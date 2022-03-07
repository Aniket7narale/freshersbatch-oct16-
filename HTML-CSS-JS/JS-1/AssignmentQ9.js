//arrays
const arr1 = ["a","b","c"];
const arr2 = [1,2,3];

//sorting & merrging arrays
let run = 0, first = 0, second = 0;
const newArr = [];
while(run < arr1.length + arr2.length){
   if(first > second){
      newArr[run] = arr2[second];
      second++;
   }else{
      newArr[run] = arr1[first];
      first++;
   }
   run++;
};

//output
document.write(newArr);
console.log(newArr);