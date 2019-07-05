package binarySearch;

public class IsBadVersion {
    public static void main(String[] args) {
        int left =1;
        int right = 5;

        while (left < right){
            int element = left + (right - left) / 2;
            if(isBadVersion(element)){
                right = element;
            }
            else{
                left = element + 1;
            }
        }
        System.out.println(right);

    }
    private  static boolean isBadVersion (int element){
        if(element >= 4){
            return true;
        }
        return false;
    }
}
