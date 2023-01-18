var factorial=1;
let i=1;

while (true) {
    factorial *= i ;
    console.log(factorial);
    i++;
    if (i>10) break;
  }
console.log("The factorial of 10 is: "+factorial);