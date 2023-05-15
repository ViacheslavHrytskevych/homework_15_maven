import java.util.HashMap;

public class Solution {

    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for (char c : stones.toCharArray()) {
            if (jewels.indexOf(c) != -1)
                count++;
        }
        return count;
    }

    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> booster = new HashMap<>();

        int counter = 0;

        for (int num : nums) {
            int pairCount = booster.getOrDefault(num, 0);
            counter += pairCount;
            booster.put(num, pairCount + 1);
        }
        return counter;
    }

    public int maxNumberOfBalloons(String text) {

        int a = 0, b = 0, l = 0, o = 0, n = 0, count = 0;

        for (char character: text.toCharArray()){
            switch (character){
                case 'a' -> a++;
                case 'b' -> b++;
                case 'l' -> l++;
                case 'n' -> n++;
                case 'o' -> o++;
            }
            if (a >= 1 && b >= 1 && n >= 1 && l >= 2 && o >= 2){
                count++;
                a -= 1; b -= 1; n -= 1; l -= 2; o -= 2;
            }
        }
        return count;
    }

}
