// program to display the sum of mutiple of 3 & 5 n natural numbers.

// take input from the user
var n = prompt("Enter a number: "); 
var sum=0;
 
// looping & sorting mutiples of 3 & 5 from i = 1 to number 
if (n > 0) { 
  for (var i = 1; i <= n; i++) { 
    if ((i % 3 == 0) || (i % 5 == 0)) 
       sum=sum+i
  } 
} 

//shows output 
document.write("The sum for mutliple number of 3 & 5 till n natural sumber is: ", sum);