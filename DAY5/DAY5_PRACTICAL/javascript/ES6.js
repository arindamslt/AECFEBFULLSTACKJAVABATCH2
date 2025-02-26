//SPREAD OPERATOR
//COPY VALUE FROM ONE OBJECT  TO ANOTHER
var obj1={
    id:101,
    nm:'ALOKE',
    dept:'HR'
}
var obj2={
    ...obj1,
    dept:"IT"
}
console.log(obj1);
console.log(obj2);
//REST PARAMETER
function fn1(x,y,...data)
{
    console.log(x,y,data);
}
fn1(10,20);
fn1(10,20,30,40);
//ARROW FUNCTION
function fn2()
{
    console.log("NORMAL FUNCTION");
}
fn2();
const fn3=()=>{
    console.log("ARROW FUNCTION");
}
fn3();
var arr=[100,200,300,400];
arr.forEach(function(element,index){
    console.log(index,element);
})
arr.forEach((element,index)=>{
    console.log(index,element);
})
var newarray1=arr.map(function(element,index){
    return element*10;
})
var newarray1=arr.map((element,index)=>{
    return element*10;
})
var newarray2=arr.filter(function(element,index){
    return element>200;
})
console.log(newarray2);
//var vs let vs const
/*function fn5()
{
    if(true)
    {
        var x=25;
        console.log(x);
    }
    console.log(x);
}*/
/*function fn5()
{
    if(true)
    {
        let x=25;
        console.log(x);
    }
    console.log(x);
}*/
function fn5()
{
    if(true)
    {
        const x=25;
        console.log(x);
        x=40;
    }
 
}
fn5();
