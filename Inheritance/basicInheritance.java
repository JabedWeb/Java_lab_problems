package Inheritance;


interface A{
	public void display();
}

 abstract class rectangle{
	void display(){
		System.out.println("oK");
	}
   abstract void area();
}

class square extends rectangle implements A {
	void area(){
		System.out.println("Out");
	}
	public void display(){
		System.out.println("OK");
	}
}

public class basicInheritance {

    public static void main(String[] args) {
		rectangle r=new square();
		r.display();
	}
}
