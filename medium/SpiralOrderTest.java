package medium;

import org.junit.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralOrderTest {

    @org.junit.Test
    public void test1() {
        List<List<Integer>> input = new ArrayList<>();
        input.add(Arrays.asList(1,2 ,3));
        List<Integer> expected = Arrays.asList(1, 2, 3);
        Assert.assertEquals(expected, spiralOrder(input));
    }

    @org.junit.Test
    public void test3x3() {
        List<List<Integer>> input = new ArrayList<>();
        input.add(Arrays.asList(1, 2, 3));
        input.add(Arrays.asList(4, 5, 6));
        input.add(Arrays.asList(7, 8, 9));
        List<Integer> expected = Arrays.asList(1, 2, 3, 6, 9, 8, 7, 4, 5);
        Assert.assertEquals(expected, spiralOrder(input));
    }

    @org.junit.Test
    public void test2x3() {
        List<List<Integer>> input = new ArrayList<>();
        input.add(Arrays.asList(1, 2, 3));
        input.add(Arrays.asList(4, 5, 6));
        List<Integer> expected = Arrays.asList(1, 2, 3, 6, 5, 4);
        Assert.assertEquals(expected, spiralOrder(input));
    }

    @org.junit.Test
    public void test3x2() {
        List<List<Integer>> input = new ArrayList<>();
        input.add(Arrays.asList(1, 2));
        input.add(Arrays.asList(4, 5));
        input.add(Arrays.asList(7, 8));
        List<Integer> expected = Arrays.asList(1, 2, 5, 8, 7, 4);
        Assert.assertEquals(expected, spiralOrder(input));
    }

    @org.junit.Test
    public void test1x3() {
        List<List<Integer>> input = new ArrayList<>();
        input.add(Arrays.asList(1));
        input.add(Arrays.asList(4));
        input.add(Arrays.asList(7));
        List<Integer> expected = Arrays.asList(1, 4, 7);
        Assert.assertEquals(expected, spiralOrder(input));
    }

    public static ArrayList<Integer> spiralOrder(final List<List<Integer>> A) {
        ArrayList<Integer> result = new ArrayList<>();

        int top = 0;
        int bottom = A.size()-1;
        int right = A.get(0).size()-1;
        int left = 0;
        int direction = 0;

        while(left <= right && top <= bottom){
            if(direction == 0){
                for(int i = left ; i <= right ; i++ ){
                    result.add(A.get(top).get(i));
                }
                top++;

            }
            else if(direction == 1){
                for(int i = top ; i <= bottom ; i++){
                    result.add(A.get(i).get(right));
                }
                right--;
            }
            else if(direction == 2){
                for(int i = right ; i >= left ; i--){
                    result.add(A.get(bottom).get(i));
                }
                bottom--;
            }
            else{
                for(int i = bottom ; i >= top ; i--){
                    result.add(A.get(i).get(left));
                }
                left++;
            }
            direction = (direction + 1) % 4;
        }

        return result;
    }

}
