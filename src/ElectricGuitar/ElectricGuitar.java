/*
 * Created by Axel_ST on 08.02.2022
 *
 * Head First Java, 2nd Edition (RU) p. 109
 */

package ElectricGuitar;

public class ElectricGuitar {
    private String brand;
    private int numOfPickups;
    private boolean rockStarUsesIt;
    
    String getBrand() {
        return brand;
    }
    
    void setBrand(String aBrand) {
        brand = aBrand;
    }
    
    int getNumOfPickups() {
        return numOfPickups;
    }
    
    void setNumOfPickups(int num) {
        numOfPickups = num;
    }
    
    boolean getRockStarUsesIt() {
        return rockStarUsesIt;
    }
    
    void setRockStarUsesIt(boolean yesOrNo) {
        rockStarUsesIt = yesOrNo;
    }
}
