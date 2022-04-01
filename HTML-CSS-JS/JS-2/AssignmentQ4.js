//input
const array1 = [1, 2, 3, 4, 5];
const array2 = [1, 4, 9, 16, 25];

// pass a function to map
const map1 = array1.map(x => x * x);
const map2 = array2.map(x => Math.sqrt(x));

//output
console.log(map1);
document.write("Square of each element in array: ",map1,"<br>");
console.log(map2);
document.write("Square root of each element in array: ",map1,"<br>");



