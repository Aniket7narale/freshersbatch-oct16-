// program to generate fibonacci series up to n terms

// take input from the user
const number = parseInt(prompt('Enter the number of terms: '));
let n1 = 0, n2 = 1, nextTerm;

console.log('Fibonacci Series till nth term:');
document.write("Fibonacci Series till nth term: ");

for (let i = 1; i <= number; i++) {
    document.write(n1,"<br>");
    console.log(n1);
    nextTerm = n1 + n2;
    n1 = n2;
    n2 = nextTerm;
}