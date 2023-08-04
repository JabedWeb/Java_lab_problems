package Theory_Final;



abstract class Shape {
    private String color;
    Shape(String color){
        this.color=color;
    }

    public String GetColor(){
        return color;
    }
 public abstract double area();
  abstract double volume();
}

class Sphere extends Shape {
    private double radius;
    Sphere(String color,double radius){
        super(color);
        this.radius=radius;
    }

    @Override
    public double area() {
        return 4*Math.PI*radius*radius;
        
    }
    @Override
    double volume() {
        return (4/3)*Math.PI*radius*radius*radius;
       
    }
 
}

class Cube extends Shape {

    private double area;

    private double side;
    Cube (String color,double side){
        super(color);
        this.side=side;
    }

    @Override
    public double area() {
        area=6*side*side;
        return area;
        
    }
    void display (){
        System.out.println(area);
    }

    @Override
    public double volume() {
        return 6*side*side*side;
    }
 
}


 public class ShapeProblem {
        public static void main(String[] args) {
            Sphere ob=new Sphere("red",10);
            System.out.println(ob.area());
            System.out.println(ob.volume());
            Cube ob1=new Cube("blue",10);
            System.out.println(ob1.area());
            System.out.println(ob1.volume());
            System.out.println(ob.GetColor());

        }
    
}
