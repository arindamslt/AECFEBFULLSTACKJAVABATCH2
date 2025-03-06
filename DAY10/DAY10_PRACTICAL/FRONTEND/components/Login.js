import React from 'react'
import axios from 'axios'
import { useState } from 'react'
import { useNavigate } from 'react-router-dom'
function Login() {
   let[register,setRegister]=useState({
          uname:"",
          pass:"",
          nm:"",
          email:"",
          phno:""
      })
      let[msg,setmsg]=useState("");
      var navigate=useNavigate();
      const checkLogin=(uname,pass)=>{
        axios.get(`http://localhost:1005/register/login/${uname}/${pass}`)
        .then((res)=>{
            console.log(res.data);
           
            if(uname==='admin' && pass==='admin')
            {
               navigate("/nav")
            }
            else{
              if(res.data==="LOGIN SUCCESSFULL")
              {
                navigate("/navclient")
              }
              else{
                setmsg(res.data)
              }
            }
        })
        .catch((error)=>{
            console.log(error);
            alert("SOMETHING WENT WRONG ADDING DATA");
        })
    }
    const refreshData=()=>{
        setmsg("");
        setRegister({
          uname:"",
          pass:"",
          nm:"",
          email:"",
          phno:""
        })
    }
  return (
    <div style={{width:"30%",margin:"50px auto"}}>
      <h2 className='text-primary'>LOGIN FORM</h2>
      <input type="text" className='form-control' placeholder='ENTER THE USERNAME'
      value={register.uname} onChange={(event)=>{
        setRegister({
            ...register,
            uname:event.target.value
        })
      }}/>
     <input type="password" className='form-control' placeholder='ENTER THE PASSWORD'
      value={register.pass} onChange={(event)=>{
        setRegister({
            ...register,
            pass:event.target.value
        })
      }}/>
      
     
      <button className='btn btn-outline-primary' style={{marginTop:"5px"}}
      onClick={()=>{
        checkLogin(register.uname,register.pass)
      }}>LOGIN</button> &nbsp;&nbsp;
      <button className='btn btn-outline-secondary' style={{marginTop:"5px"}}
      onClick={refreshData}>REFRESH</button> &nbsp;&nbsp;
        <button className='btn btn-outline-success' style={{marginTop:"5px"}}
      onClick={()=>{
        navigate("/")
      }}>HOME</button>
      <h2 className='text-danger'>{msg}</h2>
    </div>
  )
}

export default Login
