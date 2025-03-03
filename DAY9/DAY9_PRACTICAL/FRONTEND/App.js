//import logo from './logo.svg';
import './App.css';
import "bootstrap/dist/css/bootstrap.css";
import Nav from './components/Nav';
import { Routes,Route } from 'react-router-dom';
import Food from './components/Food';
import AddFood from './components/AddFood';
import FoodList from './components/FoodList';
import DeleteFood from './components/DeleteFood';
import UpdateFood from './components/UpdateFood';
import SearchFood from './components/SearchFood';
function App() {
  return (
    <div className="App">
     <h2>FOOD APP</h2>
     <Nav/>
     <Routes>
      <Route path="/flist" element={<FoodList/>}/>
      <Route path="/sfood" element={<SearchFood/>}/>
      <Route path="/food" element={<Food/>}>
         <Route path="afood" element={<AddFood/>}/>
         <Route path="dfood" element={<DeleteFood/>}/>
         <Route path="ufood" element={<UpdateFood/>}/>
      </Route>
     </Routes>
    </div>
  );
}

export default App;
