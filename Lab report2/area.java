
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
class NumberValue {
    int length;
    int height;
    String areaname;
    double area;
  public NumberValue(int l,int h,String type) {
      length=l;
      height=h;
      areaname=type;
      area=0.5*length*height;
  }
   public NumberValue(String type,int h,int l) {
      length=l;
      height=h;
      areaname=type;
      area=length*height;
  }
      public NumberValue(String type,int r) {
      length=r;
      areaname=type;
      area=3.14*(r*r);
  }
  public void display() {
     System.out.println("total area of "+ areaname +" "+ area);
  }
}
public class area {
  public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      System.out.print("1 for tri \n 2 for rec \n  for circle\n");
      int select=scan.nextInt();
      
      switch (select) {
          case 1:
              System.out.print("Please input the length and height\n");
              int length=scan.nextInt();
              int height=scan.nextInt();
               NumberValue tri = new NumberValue(length,height,"tri");
               tri.display();
              break;
               case 2:
                   System.out.print("Please input the length and height\n");
                   int lengths=scan.nextInt();
              int heights=scan.nextInt();
                NumberValue rec = new NumberValue("rec",heights,lengths);
               rec.display();
              break;
                case 3:
                    System.out.print("Please input circle area\n");
                    int circles=scan.nextInt();
                NumberValue circle = new NumberValue("circle",circles);
               circle.display();
              break;
          default:
              throw new AssertionError();
      }
  }
}

