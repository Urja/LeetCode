package hard;

import java.util.Arrays;

/**
 * @author urja
 * Median of Two Sorted Arrays
 */
public class Median {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2};
        int[] nums2 = new int[]{3, 4};

        double median = 0;
        int[] wholeArray = generateWholeArray(nums1,nums2);
        Arrays.sort(wholeArray);

        if(wholeArray.length%2!=0){
            median =wholeArray[(int) Math.floor(wholeArray.length/2)];
        }
        else{
            median=(float)(wholeArray[wholeArray.length/2]+ wholeArray[wholeArray.length/2-1])/2;
        }
        System.out.println(median);
    }

    static int[] generateWholeArray(int[] firstArray, int[] secondArray) {
        int[] wholeArray = new int[firstArray.length+secondArray.length];
        int index=0;
       for(int value:firstArray){
           wholeArray[index] = value;
           index++;
       }
        for(int value:secondArray){
            wholeArray[index] = value;
            index++;
        }
        return wholeArray;
    }
}
