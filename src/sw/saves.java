
package sw;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class saves {
    ArrayList<Users> users = new ArrayList<Users>();
    ArrayList<Product> sys_products= new ArrayList<Product>();
    ArrayList<Brands> br = new ArrayList<Brands>();
     ArrayList<Store> stores = new ArrayList<Store>();
       void add_product()  {
   
    Product ob = new Product();
    Scanner s = new Scanner(System.in);
    System.out.println("enter product name to add to System");
       ob.name = s.next();
       System.out.println("enter price of product");
       ob.price = s.nextInt();
       sys_products.add(ob);
}
    void add_brand(){
    Brands ob = new Brands();
    Scanner s = new Scanner(System.in);
    System.out.println("enter brand name to add to System");
       ob.name = s.next();
       System.out.println("enter category of braand");
       ob.category = s.next();
       br.add(ob);
    }
    
    void suggest(){
        
        Random x=new Random();
        if(sys_products.size()>0){
        int v=x.nextInt()%sys_products.size();
        sys_products.get(v).info();}
        else{
        System.out.println("no products");
        }
        
    }
    
    public void add_store(){
        System.out.println("enter number of Stores to add");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i = 0 ; i < n ; i++){
            Store ob = new Store();
            System.out.println("Store name");
            ob.name = s.next();
            System.out.println("Store Type");
            ob.type = s.next();
            System.out.println("Store ID");
            ob.id = s.nextInt();
            stores.add(ob);
        }
        System.out.println("Added Success");
    }
    void exstore(String n){
        for(Store st:stores){
            if(n.equals(st.name)){
                st.explore();
            }
        }
    }
    public void Spec_detials(){
        Scanner s = new Scanner(System.in);
        String str = s.next();
        for(int i = 0 ; i < sys_products.size() ; i++){
            if(s.equals(sys_products.get(i))){
                sys_products.get(i).info();
        }
    }
    
    
    }
}
    