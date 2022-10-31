
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
      System.out.print("1 for tri \n 2 for rec \3 for circle");
      int select=scan.nextInt();
      
      switch (select) {
          case 1:
              int length=scan.nextInt();
              int height=scan.nextInt();
               NumberValue tri = new NumberValue(length,height,"tri");
               tri.display();
              break;
               case 2:
                   int length=scan.nextInt();
              int height=scan.nextInt();
                NumberValue rec = new NumberValue("rec",20,10);
               rec.display();
              break;
                case 3:
                NumberValue circle = new NumberValue("circle",10);
               circle.display();
              break;
          default:
              throw new AssertionError();
      }
  }
}

