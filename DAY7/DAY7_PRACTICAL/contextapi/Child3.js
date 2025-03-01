import React from 'react'
import { useContext } from 'react'
import mycontext from './context'
function Child3() {
    var data=useContext(mycontext);
  return (
    <div>
      <h2>CHILD3 COMPONENT</h2>
      <p>{data}</p>
    </div>
  )
}

export default Child3
