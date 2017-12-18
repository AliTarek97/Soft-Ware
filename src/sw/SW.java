
package sw;

import java.util.Scanner;

public class SW {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Resgister reg=new Resgister();
        
        while(true){
            System.out.println("Press 1 to to login or 2 to sign up or 3 to exit");
            int x = s.nextInt();
            
             if(x == 2){
                reg.reg();
             }
            else if(x == 1){
                login ob = new login();
                ob.valid(reg.obj);
            }
            else if(x == 3) return;
            else System.out.println("Invalid input");
        }

    }
    
}
