import React from 'react'
import axios from 'axios'
import { useState } from 'react'
import { useEffect } from 'react'
function ProductReport() {
    let[user,setUser]=useState([]);
    useEffect(()=>{
       axios.get("http://localhost:1005/product/fetch")
       .then((res)=>{
        console.log(res.data);
        setUser(res.data);
       })
       .catch((error)=>{
        console.log(error);
        alert("SOME THING WENT WRONG ON FETCHING DATA");
       })
    },[])
  return (
    <div>
      <h2 className='text-primary'>PRODUCT DETAILS</h2>
      {
        user.length>0 ?
         <div style={{width:"60%",margin:"50px auto"}}> 
            <table className='table table-hover table-striped '>
                <thead className='table table-dark'>
                    <tr>
                    <td>PRODUCT ID</td>
                    <td>PRODUCT NAME</td>
                    <td>QUANTITY</td>
                    <td>PRICE</td>
                    </tr>
                </thead>
                <tbody>
                    {
                        user.map((element,index)=>{
                            return(
                                <tr>
                                    <td>{element.pid}</td>
                                    <td>{element.pname}</td>
                                    <td>{element.pqty}</td>
                                    <td>{element.price}</td>
                                    
                                </tr>
                            )
                        })
                    }
                </tbody>
            </table>
         </div> 
         :<h2 style={{color:"red"}}>NO DATA FOUND</h2>
      }
    </div>
  )
}
   

export default ProductReport
