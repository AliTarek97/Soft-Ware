
package sw;

import java.util.ArrayList;
import java.util.Scanner;


public class Users {
    saves data=new saves();
    
    String password;
    String name , type;
    
     public void reg(){
            Scanner s=new Scanner(System.in);
            System.out.println("enter your user name");
            name= s.next();
            System.out.println("enter your password");
            password = s.next();
            System.out.println("user type");
            type = s.next();
            data.users.add(this);
            }
}
