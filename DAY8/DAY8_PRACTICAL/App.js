//import logo from './logo.svg';
import './App.css';
import FunctionalComponent from './components/FunctionalComponent';
import Fc from './components/Fc';
import StateDemo from './components/state/StateDemo';
import Profile from './components/state/Profile';
import Parent from './components/props/Parent';
import A from './components/propsdrilling/A';
import Parent1 from './components/contextapi/Parent1';
import "bootstrap/dist/css/bootstrap.css";
import Main from './components/condrend/Main';
import UseRefDemo from './components/useref/UseRefDemo';
import User from './components/axios/User';
import UserInfo from './components/useeffect/UserInfo';
import Nav from './components/route/Nav';
import { Routes,Route } from 'react-router-dom';
import Garment from './components/route/Garment';
import Retails from './components/route/Retails';
import Electronics from './components/route/Electronics';
import Jewellery from './components/route/Jewellery';
import Product from './components/route/Product';
import ProductReport from './components/bootreact/ProductReport';
import AddProduct from './components/bootreact/AddProduct';
import DeleteProduct from './components/bootreact/DeleteProduct';
function App() {
  return (
    <div className="App">
    <h2>REACT APP</h2>
    <Nav/>
     
    <Routes>
      <Route path="/state" element={<StateDemo/>}/>
      <Route path="/profile" element={<Profile/>}/>
      <Route path="/props" element={<Parent/>}/>
      <Route path="/pdrilling" element={<A/>}/>
      <Route path="/context" element={<Parent1/>}/>
      <Route path="/condrend" element={<Main/>}/>
      <Route path="/axios" element={<User/>}/>
      <Route path="/useeffect" element={<UserInfo/>}/>
      <Route path="/useref" element={<UseRefDemo/>}/>
      <Route path="/preport" element={<ProductReport/>}/>
      <Route path="/aproduct" element={<AddProduct/>}/>
      <Route path="/dproduct" element={<DeleteProduct/>}/>
      <Route path="/product" element={<Product/>}>
        <Route path="electronics" element={<Electronics/>}/>
        <Route path="retails" element={<Retails/>}/>
        <Route path="jewellery" element={<Jewellery/>}/>
        <Route path="garments" element={<Garment/>}/>
      </Route>
    </Routes>
    </div>
  );
}

export default App;
