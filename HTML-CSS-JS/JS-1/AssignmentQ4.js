// Javascript Program takes number of flips as parameter and returns the fraction that were heads

// Function to find head tails
function coinFlip() {
    return(Math.random() < 0.3) ? 'Heads' : 'Tails'; //ofc 0.3 is 30% (3/10)
}

// take input from the user
var howManyTimes = prompt("Enter a head ratio: "); 

//takes number of flips as parameter
var countHeads=0; 
for (var i=0; i<howManyTimes;i++){
if (coinFlip()==='Heads'){
 countHeads++;
}
}

alert("Heads appear "+(countHeads/howManyTimes)+"in fraction");