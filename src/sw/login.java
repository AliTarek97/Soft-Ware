
package sw;

import java.util.ArrayList;
import java.util.Scanner;


public class login{
    Scanner s = new Scanner(System.in);
        public void valid(saves ss){
            saves ob = ss;
            Store obj = new Store();
            System.out.println("enter your userName to login");
            String nam = s.next();
            System.out.println("enter your password to login");
            String pass = s.next();
            System.out.println("enter your type");
            String typ = s.next();
            for(int i = 0 ; i < ob.users.size() ; i++){
                if(((ob.users.get(i).name).equals(nam)) && (ob.users.get(i).password.equals(pass))) {
                    System.out.println("login success");
                    if(typ.equals("storeOwner")){
                        while(true){
                      System.out.println("press 1 to add store , 2 to add product to store , "
                              + "3 to suggest product , 4 to explore  , 5 to exit");
                            int x = s.nextInt();
                            if(x == 1){
                                ob.add_store();
                            }
                            else if(x == 2){
                                ob.add_product();
                            }
                            else if(x == 3) ob.suggest();
                            else if(x == 4) {
                                System.out.println("Enter the store name : ");
                                String str=s.next();
                                ob.exstore(str);
                            }
                        }
                        
                    }
                    else if (typ.equals("normal")){
                          System.out.println("press 1 to suggest product , 2 to buy product , "
                                + " 3 to explore products in store , 4 view specific products , 5 to exit");
                           while(true){
                            int x = s.nextInt();
                            if(x == 1){
                                ob.suggest();
                            }
                            else if(x == 2){
                                obj.buy();
                            }
                            else if(x == 3) {
                                System.out.println("Enter the store name to explore : ");
                                String str=s.next();
                                ob.exstore(str);
                            }
                            else if(x == 4){
                                ob.Spec_detials();
                            }
                            else if (x == 5){
                                return;
                            }
                            else
                            {
                                System.out.println("enter vaild number");
                            }
                        }
                        
                    }
                     else if (typ.equals("admin")){
                          System.out.println("press 1 add product to system , 2 to add brand , "
                                + " 3 to explore products in store , 4 view specific products , 5 to exit");
                           while(true){
                            int x = s.nextInt();
                            if(x == 1){
                                ob.add_product();
                            }
                            else if(x == 2){
                                ob.add_brand();
                            }
                            else if(x == 3) {
                                System.out.println("Enter the store name to explore : ");
                                String str=s.next();
                                ob.exstore(str);
                            }
                            else if(x == 4){
                                ob.Spec_detials();
                            }
                            else if (x == 5){
                                return;
                            }
                            else
                            {
                                System.out.println("enter vaild number");
                            }
                        }
                }
              
              }
                        else{
                System.out.println("login failed ! please try again");
                }
                                
            }
            
            
        }
    
    
}