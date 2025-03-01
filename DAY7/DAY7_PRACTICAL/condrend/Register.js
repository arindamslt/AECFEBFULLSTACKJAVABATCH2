import React from 'react'

function Register({state,setState,username,setUsername}) {
    const populateData=(event)=>{
   setUsername(event.target.value);
    }
  return (
    <div style={{width:"30%",margin:"50px auto"}}>
      <h2 className='text-warning'>REGISTRATION FORM</h2>
      <input type="text" className='form-control' placeholder='ENTER THE USERNAME' onChange={populateData}/>
      <input type="password" className='form-control' placeholder='ENTER THE PASSWORD'/>
      <input type="text" className='form-control' placeholder='ENTER THE NAME'/>
      <input type="text" className='form-control' placeholder='ENTER THE EMAIL'/>
      <input type="text" className='form-control' placeholder='ENTER THE PHONE NO'/>
      <button className='btn btn-outline-primary' onClick={()=>{
        setState(true);
      }}>REGISTER</button>
    </div>
  )
}

export default Register
