import java.util.*;
class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        long weight = (long)mass;
        Arrays.sort(asteroids);
        for(int i=0; i<asteroids.length; i++){
            if(weight < asteroids[i]) return false;
            else{
                weight = weight + asteroids[i];
            }
        }
        return true;
    }
}