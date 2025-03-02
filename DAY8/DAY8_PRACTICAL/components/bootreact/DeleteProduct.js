import React from 'react'
import axios from 'axios'
import { useState } from 'react'
function DeleteProduct() {
    let[product,setProduct]=useState({
        pid:"",
        pname:"",
        pqty:"",
        price:""
    })
    let[msg,setmsg]=useState("");
    const deleteData=(pid)=>{
        alert(pid);
        axios.delete(`http://localhost:1005/product/del/${pid}`)
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
        setProduct({
            pid:"",
            pname:"",
            pqty:"",
            price:""
        })
    }
  return (
    <div style={{width:"30%",margin:"50px auto"}}>
      <h2 className='text-primary'>ADDING PRODUCT</h2>
      <input type="text" className='form-control' placeholder='ENTER THE PRODUCT ID'
      value={product.pid} onChange={(event)=>{
        setProduct({
            ...product,
            pid:event.target.value
        })
      }}/>
     
     
    
      <button className='btn btn-outline-primary' style={{marginTop:"5px"}}
      onClick={()=>{
        deleteData(product.pid)
      }}>DELETE</button> &nbsp;&nbsp;
      <button className='btn btn-outline-secondary' style={{marginTop:"5px"}}
      onClick={refreshData}>REFRESH</button>
      <h2 className='text-danger'>{msg}</h2>
    </div>
  )
}

export default DeleteProduct
