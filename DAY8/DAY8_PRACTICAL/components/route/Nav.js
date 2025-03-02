import React from 'react'
import "./Nav.css"
function Nav() {
  return (
    <div className='navContainer'>
      
        <div className='navltContainer'>
          <h2>MYAPP</h2>
        </div>
        <div className='navrtContainer'>
           <a href="/state">STATE</a>
           <a href="/profile">PROFILE</a>
           <a href="/props">PROPS</a>
           <a href="/pdrilling">PROPSDRILLING</a>
           <a href="/context">CONTEXTAPI</a>
           <a href="/condrend">CONDREND</a>
           <a href="/axios">AXIOS</a>
           <a href="/useeffect">USEEFFECT</a>
           <a href="/useref">USEREF</a>
           <a href="/preport">PRODUCTREPORT</a>
           <a href="/aproduct">ADDPRODUCT</a>
           <a href="/dproduct">DELETEPRODUCT</a>
           <a href="/product">PRODUCT</a>
        </div>
      
    </div>
  )
}

export default Nav
