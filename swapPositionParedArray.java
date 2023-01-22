public class swapPositionParedArray {
    public static void main(String[] args) {
        int[] arr={1,5,7,3,2,1};
        int[] arr2=new int[arr.length];
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                arr2[i]=arr[i+1];
            }else{
                arr2[i]=arr[i-1];
            }
        }
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
    }
}
