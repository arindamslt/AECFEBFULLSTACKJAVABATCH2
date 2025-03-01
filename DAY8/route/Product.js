import React from 'react'
import "./Product.css"
import { Link } from 'react-router-dom'
import { Outlet } from 'react-router-dom'
function Product() {
  return (
    <div className='prdContainer'>
        <div className='prdlContainer'>
         <Link to="electronics">ELECTRONICS</Link>
         <Link to="garments">GARMENTS</Link>
         <Link to="retails">RETAILS</Link>
         <Link to="jewellery">JEWELLERY</Link>
        </div>
        <div className='prdrContainer' style={{textAlign:"center",marginLeft:"500px"}}>
            <Outlet/>
            </div>
      
    </div>
  )
}

export default Product
