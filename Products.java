class Product{
    String name, expire_date;
    double price;
    double goponPJrice;
    boolean check;
    Product(){
       goponPJrice=10;
        System.out.println("pirce = "+goponPJrice);
    }
    Product (String name,String expire_date, double price, boolean check){
        this.name = name;
        this.expire_date = expire_date;
        this.price = price;
        this.check = check;
    }
    void isAvailable(){
        if(check==true && price>goponPJrice){
            System.out.println("yes availble");
        }
        else{
            System.out.println("Not");
        }
    }
}

public class Products {
    public static void main(String[] args) {
        Product p0 =new Product();
        Product p1 = new Product("Shipon","2090", 10,false);
p1.isAvailable();
        Product p2 = new Product("Rayhan","2080", 7,true);

        if(p2.check==true){
            System.out.println("Yes Product ase");
        }
        else {
            System.out.println("Nai");
        }


    }
}