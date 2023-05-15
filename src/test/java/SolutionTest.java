import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void numJewelsInStonesTest() {
        Solution solution = new Solution();
        String jewels = "aA";
        String stones = "aAAbbbb";
        int expected = 3;

        int actually = solution.numJewelsInStones(jewels, stones);

        Assert.assertEquals(expected, actually);
    }

    @Test
    public void numIdenticalPairsTest() {
        Solution solution = new Solution();
        int[] nums = {1,2,3,1,1,3};
        int expected = 4;

        int actually = solution.numIdenticalPairs(nums);

        Assert.assertEquals(expected, actually);
    }

    @Test
    public void maxNumberOfBalloonsTest() {
        Solution solution = new Solution();
        String text =  "loonbalxballpoon";
        int expected = 2;

        int actually = solution.maxNumberOfBalloons(text);

        Assert.assertEquals(expected, actually);
    }

}
