package Labreport4;

 abstract class rectangle{
	void display(){
		System.out.println("oK");
	}
   abstract void area();
}


class square extends rectangle {
	void area(){
		System.out.println("Out");
	}
}

public class calculator {

    public static void main(String[] args) {
		rectangle r=new square();
		r.display();
	}
}