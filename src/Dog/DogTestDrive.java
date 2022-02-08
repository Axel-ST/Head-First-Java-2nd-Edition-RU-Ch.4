/*
 * Created by Axel_ST on 08.02.2022
 *
 * Head First Java, 2nd Edition (RU) p. 103
 */

package Dog;

public class DogTestDrive {
    public static void main(String[] args) {
        Dog one = new Dog();
        Dog two = new Dog();
        Dog three = new Dog();
        one.size = 70;
        two.size = 8;
        three.size = 35;
        
        one.bark();
        two.bark();
        three.bark();
    }
}
