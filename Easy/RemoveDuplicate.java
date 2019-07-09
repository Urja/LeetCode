package Easy;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 1, 2};
        int j = 1;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[j-1]) {
                nums[j++] = nums[i];
            }
        }
        System.out.println(j);
    }
}
