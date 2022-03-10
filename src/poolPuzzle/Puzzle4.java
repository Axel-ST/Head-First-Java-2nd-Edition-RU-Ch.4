/*
 * Created by Axel_ST on 10.03.2022
 *
 * Head First Java, 2nd Edition (RU) p. 121
 */
package poolPuzzle;

public class Puzzle4 {

}

class Puzzle4b{
    int ivar;
    private int doStuff(int factor) {
        if (ivar > 100) {
            return ivar * factor;
        } else {
            return ivar * (5 - factor);
        }
    }
}
