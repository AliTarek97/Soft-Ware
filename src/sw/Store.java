package sw;

import java.util.ArrayList;
import java.util.Scanner;

public class Store {
    String name, type;
    int id ;
    ArrayList<Product> products = new ArrayList<Product>();
    int maxview=0;
    void add_product()  {
    ArrayList<Product> products_System = new ArrayList<Product>();
    Product ob = new Product();
    Scanner s = new Scanner(System.in);
    System.out.println("enter product name to add to System");
       ob.name = s.next();
       System.out.println("enter price of product");
       ob.price = s.nextInt();
       products.add(ob);
}
    
    void explore(){
        for(Product p:products){
            p.info();
        }
    }
    
    void buy(){
        if(products.size()>0){
        System.out.println("Enter product name :");
        Scanner s = new Scanner(System.in);
        String n=s.next();
        
        for(Product p:products){
            if(n.equals(p.name)){
                System.out.print("you have bought : ");
                p.info();
                p.c++;
                maxview=Math.max(maxview,p.c);
            }
        }}
        else System.out.println("no products");
        
    }
    
    void getmaxviewed(){
        for(Product p:products){
           if(p.c==maxview) p.info();
        }
    }
    
}