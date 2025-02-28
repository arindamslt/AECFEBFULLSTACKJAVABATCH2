//NORMAL FUNCTION
function fn1()
{
    console.log("HELLO");
}
fn1();
//PARAMETERISED FUNCTION
function fn2(x,y)
{
    console.log(x,y);
}
fn2(10,20);
//FUNCTION WITH RETURN VALUE
function fn3(x,y)
{
    return(x+y);
}
var res=fn3(10,20);
console.log("RESULT:"+res);
//ANNONYMOUS FUNCTION  FUNCTION WIYHOUT NAME
function fn4(f)
{
    console.log(f);
    f();
}
fn4(function(){
    var city='KOLKATA';
    console.log(city);
})
//CALLBACK HIGHER ORDER FUNCTION
function fn5(f)
{
    console.log(f);
    f();
}
function print()
{
    var state="WESTBENGAL";
    console.log(state);
}
fn5(print);
//FUNCTION EXPRESSION
var result=function(){
    var nm="ANNANYA";
    console.log(nm);
}
result();