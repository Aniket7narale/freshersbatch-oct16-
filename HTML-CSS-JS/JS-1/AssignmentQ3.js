// Javascript Program to find the parity of a given number
 
// take input from the user
var n = prompt("Enter a number: "); 

// Function to find the parity
function findParity(x) {
    let y = x ^ (x >> 1);
    y = y ^ (y >> 2);
    y = y ^ (y >> 4);
    y = y ^ (y >> 8);
    y = y ^ (y >> 16);
 
    // Rightmost bit of y holds the parity value
    // if (y&1) is 1 then parity is odd else even
    if (y & 1)
        return 1;
    return 0;
}
 

// checking parity & output
 
(findParity(n) == 0) ? document.write("Even Parity") : document.write("Odd Parity");
