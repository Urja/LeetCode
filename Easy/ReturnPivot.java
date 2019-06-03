package Easy;

public class ReturnPivot {
    public static void main(String[] args) {
        int[] numbers =new int[]{1,2, 3,3};
        System.out.println(findPivot(numbers));
    }
    public static int findPivot(int[] numbers){
        int index =-1;
        if(numbers.length>1){
            int sumOfLeft = numbers[0];
            int sumOfRight = numbers[2];

            for(int i=3; i < numbers.length; i++){
                sumOfRight  = sumOfRight+numbers[i];
            }

            for(int i=1; i < numbers.length; i++){
                if(sumOfLeft < sumOfRight){
                    sumOfLeft =sumOfLeft+numbers[i];
                    sumOfRight = sumOfRight - numbers[i+1];
                }
                else if(sumOfLeft == sumOfRight){
                    index = i;
                    break;
                }
            }
        }
        return index;
    }
}


