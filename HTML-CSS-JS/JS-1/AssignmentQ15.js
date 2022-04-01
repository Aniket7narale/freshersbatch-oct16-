document.write("Randomly generated numbers array with length of 20: <br>")

var makeARandomNumber = function(){
    return Math.floor(Math.random() * 10);
}
var randoms = Array(20).fill(0).map(makeARandomNumber);
document.write("Array : ",randoms,"<br>");
document.write("Array length : ",randoms.length,"<br>");

// Creating the bblSort function
function bblSort(arr){
     
    for(var i = 0; i < arr.length; i++){
        
      // Last i elements are already in place  
      for(var j = 0; j < ( arr.length - i -1 ); j++){
          
        // Checking if the item at present iteration 
        // is greater than the next iteration
        if(arr[j] > arr[j+1]){
            
          // If the condition is true then swap them
          var temp = arr[j]
          arr[j] = arr[j + 1]
          arr[j+1] = temp
        }
      }
    }
    // Print the sorted array
    document.write("Using bubble sort: ",arr);
   }

   bblSort(randoms);