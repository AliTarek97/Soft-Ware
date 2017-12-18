
package sw;

import java.util.ArrayList;
import java.util.Scanner;

public class Resgister {
        
        Scanner s = new Scanner(System.in);
        Users ob = new Users();
        saves obj = new saves();
        public void reg(){
            
            System.out.println("enter your user name");
            ob.name= s.next();
            System.out.println("enter your password");
            ob.password = s.next();
            System.out.println("user type");
            ob.type = s.next();
            obj.users.add(ob);
            }
            
        
    
}
