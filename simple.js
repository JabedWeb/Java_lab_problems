let arr=[1,5,7,3,2,1,10,12,9,8];
let arr2=[];

for(let i=0;i<arr.length;i++){
    if(i%2==0 && arr[i]>arr[i+1]){
        let temp=arr[i];
        arr[i]=arr[i+1];
        arr[i+1]=temp;
    }
}
for(let i=0;i<arr.length;i++){
    console.log(arr[i]);
}