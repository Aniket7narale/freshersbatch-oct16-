var x = prompt("Enter a number: "); 

function square(double){
    return double*double;
}

function double(x){
    return x*2;
}

function composeValue(){
    return square(double(x));
}

document.write("The Compose Value is : "+composeValue());