let initialHelath=12;
let dates=[-12,-4,6,2];
Array.splice(0,0,initialHelath);;
let currenthelth=0;
for(let i=0;i<dates.length;i++){
    currenthelth+=dates[i];
    console.log(dates[i]);
}

console.log(currenthelth);