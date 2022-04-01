var x = prompt("Enter a number: "); 

function square(double){
    return double*double;
}

function double(x){
    return x*2;
}

var f1 = function compose(){
    return square(double(x));
}

var f2 = function compose(){
    return double(square(x));
}

document.write("The Compose Value of f1 is : "+f1()+"<br>");
document.write("The Compose Value of f2 is : "+f2());