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
        
        one.setSize(70);
        two.setSize(8);
    
        System.out.println("Dog one: " + one.getSize());
        System.out.println("Dog two: " + two.getSize());
        
        one.bark(2);
        two.bark(3);
    }
}
