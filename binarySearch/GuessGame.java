package binarySearch;

public class GuessGame {
    public static void main(String[] args) {
        System.out.println(me());
    }
    private static int guess( int i ){
        int givenNumber = 6;
        if(givenNumber == i) {
            return 0;
        }
        else if( givenNumber < i){
            return -1;
        }

            return 1;

    }
    private static  int me(){
        int n = 10;
        int left = 1;
        int right = n;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int result = guess(mid);

            if (result == 0) {
                return mid;
            }
            if (result == -1) {
                right = mid-1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

}
