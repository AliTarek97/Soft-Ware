
package sw;

public class Product {
    String name;
    int price;
    int c=0;
    void info(){
        System.out.println(name + " " + price);
        ++c;
    }
}
