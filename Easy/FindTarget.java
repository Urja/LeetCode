package Easy;

public class FindTarget {
    public static void main(String[] args) {
        int[] nums = new int[] {1};
        System.out.println(searchInsert(nums, 1));
    }

    public static int searchInsert(int[] nums, int target) {
        if(nums.length>0 && target !=0 && target > nums[0]) {
            int middleValue = nums[nums.length / 2];
            int start =0;
            int end =nums.length;
            if (target > nums[nums.length - 1]) {
                return nums.length;
            }

            for (int i = start; i< end ;i++){
                if(target == nums[i]){
                    return i;
                }
                else if(target < nums[i]){
                    if(i==0){
                        return  1;
                    }
                    return i;
                }
            }
        }
    return 0;
    }
}
