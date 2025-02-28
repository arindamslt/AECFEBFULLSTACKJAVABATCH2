var product={
    pid:"P1",
    pname:"TV",
    pqty:5,
    price:32000.00
}
console.log(product);
console.log(product.pname,product.price);
//ADD DATA IN THE EXISTING OBJECT
product.compnay="SAMSUNG";
console.log(product);
//DELETE THE PROPERTIES IN OBJECT
delete product.compnay;
console.log(product);
//NESTED OBJECT OBJECT WITHIN OBJECT
var employee={
    eid:101,
    ename:'SUMAN',
    desig:'MANAGER',
    address:{
        plotno:'AD10',
        streetnm:'SALTLAKE CITY',
        pincode:'700064',
        area:{
            ps:'BIDHANAGAR',
            dist:'24pgs north'
        }
    }
}
console.log(employee.ename,employee.desig,employee.address.plotno,employee.address.streetnm,employee.address.area.ps);