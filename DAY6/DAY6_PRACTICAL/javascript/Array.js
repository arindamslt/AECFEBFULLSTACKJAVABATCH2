var arr=[100,200,300,400];
console.log(arr);
console.log(typeof arr);
//ADD A ELEMENT AT LAST
arr.push(500);
console.log(arr);
//DELETE THE LAST ELEMENT
arr.pop();
console.log(arr);
//ADD THE ITEM AT FIRST
arr.unshift(50);
console.log(arr);
//DELETE THE FIRST ITEM
arr.shift();
console.log(arr);
//DELETE ITEMS IN SPECIFIC POSITION
arr.splice(2,1);
console.log(arr);
//INSERT INTO SPECIFIC POSTION
arr.splice(2,0,300);
console.log(arr);
//RANGE OF VALUES
var newarray=arr.slice(2,4);
console.log(newarray);
//FOR EACH LOOP
arr.forEach(function(element,index){
    console.log(index,element);
})
//MAP FUNCTION
var newarray1=arr.map(function(element,index){
    return element*10;
})
console.log(newarray1);
//FILTER METHOD
var newarray2=arr.filter(function(element,index){
    return element>200;
})
console.log(newarray2);