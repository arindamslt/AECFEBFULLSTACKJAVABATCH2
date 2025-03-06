import React from 'react'
import "./Nav.css"
function NavClient() {
  return (
    <div className='navContainer'>
      
        <div className='navltContainer'>
          <h2 className='text-primary'>FOOD CLIENT APP</h2>
        </div>
        <div className='navrtContainer'>
          
           <a href="/flist">FOODLIST</a>
           <a href="/sfood">SEARCH FOOD</a>
           <a href="/addorder">ADD ORDER</a>
           <a href="/billing">BILLING</a>
        </div>
      
    </div>
  )
}

export default NavClient