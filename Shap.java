

class negativeScrore extends Exception{

    negativeScrore(){
        System.out.println("Negative Score");
    }

}

class JavaProgramming{

    private double score;

    JavaProgramming(double score){
        this.score=score;
    }

    void SetScore(double score){
        try{
            if(score<0){
                throw new negativeScrore();
            }
            else {
                this.score=score;
            }
        }catch(negativeScrore e){
            System.out.println(e);
        }
    }

    public double getscore(){
        return score;
    }

     public double getTotal(JavaProgramming ob[],int numberOfExams){
        double total=0;
        for(int i=0;i<numberOfExams;i++){
            System.out.println(ob[i].getscore());
            total+=ob[i].getscore();
        }
        return total;
    }

}


public class Shap {
    public static void main(String[] args){
        double quiz=10;
        double mid=20;
        double finalScore=30;
        JavaProgramming ob[]=new JavaProgramming[3];
        try {
            ob[0]=new JavaProgramming(-10);
            ob[1]=new JavaProgramming(20);
            ob[2]=new JavaProgramming(30);
            double total=ob[0].getTotal(ob,3);
            System.out.println(total);
        } catch (Exception e) {

        
        }
    }
}