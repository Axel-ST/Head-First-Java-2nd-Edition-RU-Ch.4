/*
 * Created by Axel_ST on 10.03.2022
 *
 * Head First Java, 2nd Edition (RU) p. 118
 */

package beTheCompiler;

public class XCopy {
    public static void main(String[] args) {
        int orig = 42;
        XCopy x = new XCopy();
        int y = x.go(orig);
        System.out.println(orig + " " + y);
    }
    
    int go(int arg) {
        arg *= 2;
        return arg;
    }
}
