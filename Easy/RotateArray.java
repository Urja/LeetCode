package Easy;

public class RotateArray {
    public static void main(String[] args) {
        int k =3;
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        solutionOne(nums, k);
        solutionTwo(nums, k);

    }
    private static  void solutionOne(int[] nums, int k){
        while( k > 0){
            int lastElement = nums[ nums.length - 1 ];
            for(int i = nums.length-1 ;i < 0 ; i++){
                nums[i] = nums[i-1];
            }
            nums[0] = lastElement;
            k--;
        }
    }
//Not working
    private static  void solutionTwo(int[] nums, int k){
        int[] subArray = new int[nums.length - (k + k)];
        int j = 0;
        for(int i = k; i < nums.length - k ; i++ ){
            subArray[j] = nums[i];
            j++;
        }

        for(int i = 0 ; i < k ; i++){
            nums[i+k] = nums[i];
            nums[i] = nums[nums.length-1-i];
        }
        j = 0;
        for(int i = (nums.length - subArray.length) ; j < subArray.length ; i++){
            nums[i] = subArray[j];
            j++;
        }
    }
}
