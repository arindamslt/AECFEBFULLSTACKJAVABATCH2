import React from 'react'
import axios from 'axios'
import { useState } from 'react'
import NavClient from './NavClient'
function AddOrder() {
    let[order,setOrder]=useState({
        fid:"",
        oqty:"",
        uname:""
    })
    let[msg,setmsg]=useState("");
    const addData=()=>{
        axios.post("http://localhost:1005/order/add",order)
        .then((res)=>{
            console.log(res.data);
            setmsg(res.data);
        })
        .catch((error)=>{
            console.log(error);
            alert("SOMETHING WENT WRONG ADDING DATA");
        })
    }
    const refreshData=()=>{
        setmsg("");
        setOrder({
            fid:"",
            oqty:"",
            uname:""
        })
    }
  return (
    
    <div style={{width:"60%",margin:"50px auto"}}>
        <NavClient/>
      <h2 className='text-primary'>ORDER FOOD</h2>
      <input type="text" className='form-control' placeholder='ENTER THE FOOD ID'
      value={order.fid} onChange={(event)=>{
        setOrder({
            ...order,
            fid:event.target.value
        })
      }}/>
    <input type="text" className='form-control' placeholder='ENTER THE QUANTITY IN NUMBER'
      value={order.oqty} onChange={(event)=>{
        setOrder({
            ...order,
            oqty:event.target.value
        })
      }}/>
      
      <input type="text" className='form-control' placeholder='ENTER THE USERNAME'
      value={order.uname} onChange={(event)=>{
        setOrder({
            ...order,
            uname:event.target.value
        })
      }}/>
      
      <button className='btn btn-outline-primary' style={{marginTop:"5px"}}
      onClick={addData}>ORDERED FOOD</button> &nbsp;&nbsp;
      <button className='btn btn-outline-secondary' style={{marginTop:"5px"}}
      onClick={refreshData}>REFRESH</button>
      <h2 className='text-danger'>{msg}</h2>
    </div>
  )
}

export default AddOrder