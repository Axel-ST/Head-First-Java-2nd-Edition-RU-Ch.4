/*
 * Created by Axel_ST on 08.02.2022
 *
 * Head First Java, 2nd Edition (RU) p. 103
 */

package Dog;

public class Dog {
    private int size;
    private String name;
    
    public int getSize() {
        return size;
    }
    
    public void setSize(int s) {
        size = s;
    }
    
    public void bark(int numOfBarks) {
        while(numOfBarks > 0){
            if(size > 60) {
                System.out.print("Wooof!");
            } else if (size > 14) {
                System.out.print("Ruff!");
            } else {
                System.out.print("Yip!");
            }
            System.out.print(" ");
            numOfBarks--;
        }
        System.out.println();
    }
}
