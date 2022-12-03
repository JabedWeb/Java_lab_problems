

class Shape2D{
    double dim1,dim2;
    Shape2D(double dim1, double dim2){
        this.dim1 = dim1;
        this.dim2 =dim2;
    }
    double area(){
        double areas = (double) 1/2*dim2 * dim1;
        return areas;
    }
    boolean equal(Shape2D obj){
        if(area()==obj.area()){
            return true;
        }
        else{
            return false;
        }
    }
}

public class Shap {
    public static void main(String[] args) {
Shape2D obj1 = new Shape2D(3, 4);
Shape2D obj2 = new Shape2D(3, 4);
boolean res = obj2.equal(obj1);
        System.out.println(res);
    }
}