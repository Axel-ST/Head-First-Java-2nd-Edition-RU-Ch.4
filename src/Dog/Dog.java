/*
 * Created by Axel_ST on 08.02.2022
 *
 * Head First Java, 2nd Edition (RU) p. 103
 */

package Dog;

public class Dog {
    int size;
    String name;
    
    void bark() {
        if(size > 60) {
            System.out.println("Wooof! Wooof!");
        } else if (size > 14) {
            System.out.println("Ruff! Ruff!");
        } else {
            System.out.println("Yip! Yip!");
        }
    }
}
