import React from 'react'
import Register from './Register'
import Login from './Login'
import { useState } from 'react'
function Main() {
    let[state,setState]=useState(false);
    let[username,setUsername]=useState("");
  return (
    <div>
      {
        state ? <Login username={username}/> :<Register state={state} setState={setState} username={username} setUsername={setUsername}/>
      }
    </div>
  )
}

export default Main
