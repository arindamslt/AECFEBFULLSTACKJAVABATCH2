import React from 'react'
import { useState } from 'react'
import { useRef } from 'react';
function UseRefDemo() {
    let[state,setState]=useState("");
   // var city="DELHI";
   var city=useRef("DELHI");
    const updateState=()=>{
        setState("UPDATE STATE");
    }
    const updateCity=()=>{
        city.current="HYDRABAD";
    }
    const printCity=()=>{
        console.log(city.current);
    }
  return (
    <div>
      <h2 className='text-white bg-dark'>USE REF IMPLEMETATIONS</h2>
      <button className='btn btn-outline-primary' onClick={updateState}>UPDATE STATE</button> &nbsp;&nbsp;
      <button className='btn btn-outline-secondary' onClick={updateCity}>UPDATE CITY</button> &nbsp;&nbsp;
      <button className='btn btn-outline-success' onClick={printCity}>PRINT CITY</button>
      <h2 className='text-danger'>{state}</h2>
    </div>
  )
}

export default UseRefDemo
