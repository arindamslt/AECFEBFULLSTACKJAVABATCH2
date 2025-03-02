import React from 'react'
import axios from 'axios'
import { useState } from 'react'
function AddProduct() {
    let[product,setProduct]=useState({
        pid:"",
        pname:"",
        pqty:"",
        price:""
    })
    let[msg,setmsg]=useState("");
    const addData=()=>{
        axios.post("http://localhost:1005/product/add",product)
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
     <input type="text" className='form-control' placeholder='ENTER THE PRODUCT NAME'
      value={product.pname} onChange={(event)=>{
        setProduct({
            ...product,
            pname:event.target.value
        })
      }}/>
      <input type="text" className='form-control' placeholder='ENTER THE PRODUCT QUANTITY'
      value={product.pqty} onChange={(event)=>{
        setProduct({
            ...product,
            pqty:event.target.value
        })
      }}/>
     <input type="text" className='form-control' placeholder='ENTER THE PRODUCT PRICE'
      value={product.price} onChange={(event)=>{
        setProduct({
            ...product,
            price:event.target.value
        })
      }}/>
      <button className='btn btn-outline-primary' style={{marginTop:"5px"}}
      onClick={addData}>ADD</button> &nbsp;&nbsp;
      <button className='btn btn-outline-secondary' style={{marginTop:"5px"}}
      onClick={refreshData}>REFRESH</button>
      <h2 className='text-danger'>{msg}</h2>
    </div>
  )
}

export default AddProduct
