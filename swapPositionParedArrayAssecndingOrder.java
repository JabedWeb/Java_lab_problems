public class swapPositionParedArrayAssecndingOrder {
    public static void main(String[] args) {
        int[] arr={1,5,7,3,2,1};
        int[] arr2=new int[arr.length];

        for(int i=0;i<arr.length;i++){
            if(i%2==0 && arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
