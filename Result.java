

public class Result {
    public static void main(String[] args) {
        double[] res = {4.4, 2.2, 4, 3.0, 3.8};
        double ave;
        double sum=0;
        int i;
        for(i=0; i<res.length; i++){
            sum = sum + res[i];
        }
        ave = sum / res.length;
        System.out.println(ave);

        double [] di=new double[res.length];
        for(i=0; i<res.length; i++){
            double dif = Math.abs(res[i]-ave);
            di[i]=dif;
        }
        double min=di[0];
        for(i=0;i<di.length;i++){
            if(di[i]<min){
                min=di[i];
            }
        }

        for(i=0;i<di.length;i++){
            if(di[i]==min){
                System.out.println("The closest value to the average is "+i);
            }
        }
    }
}
