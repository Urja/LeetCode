package binarySearch;

public class SimpleBinarySearch {
    public static void main(String[] args) {
        int[] nums = new int[] {-1,0,3,5,9,12};
        System.out.println(search(nums, 9));
    }

    public static int search(int[] nums, int target) {
        int lowerLimit = 0;
        int upperLimit = nums.length - 1;

        while (lowerLimit <= upperLimit) {
            int midIndex = (lowerLimit + upperLimit) / 2;
            if (nums[midIndex] < target) {
                lowerLimit = midIndex + 1;
            } else if (nums[midIndex] > target) {
                upperLimit = midIndex - 1;
            }
            else {
                return midIndex;
            }
        }
        return -1;
    }
}
