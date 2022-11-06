public class SecondMinimum {
    public static void main(String[] args) {
        int [] array={3,2,7,9,1,4,10,2};
        int min=array[0];
        int index=0;
        for(int i=1;i<array.length;i++){
            if(array[i]<min){
                min=array[i];
                index=i;
            }
        }
        for(int i=index;i<array.length-1;i++){
            array[i]=array[i+1];
        }
        int second_min=array[0];
        for(int i=1;i<array.length;i++){
            if(array[i]<second_min){
                second_min=array[i];
            }
        }
        
        System.out.println(min);
        System.out.println(second_min);
    }
}
