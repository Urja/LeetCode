package medium;

import java.util.*;
import java.util.stream.Stream;

public class WinLose {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = Integer.valueOf(scanner.nextLine());
        List<String> players = new ArrayList<>();
        List<String> villansEnergy = new ArrayList<>();
        List<String> playersEnergy = new ArrayList<>();
        int i =0;
        while(scanner.hasNext() ) {
            players.add(scanner.nextLine());
            villansEnergy.add(scanner.nextLine());
            playersEnergy.add(scanner.nextLine());
            i++;
            if( testCase == i){
                    break;
            }
        }

        for(int play =0; play <players.size();play++){
          int[] villansE = parseIntArray(villansEnergy.get(play).split(" "));
          int[] playersE =  parseIntArray(playersEnergy.get(play).split(" "));
          Arrays.sort(villansE);
          Arrays.sort(playersE);
          for(int energy =villansE.length-1; energy >=0; energy--){
              if(villansE[energy] > playersE[energy] )
              {
                  System.out.println("LOSE");
                  break;
              }
              if(energy == 0){
                  System.out.println("WIN");
              }
          }
        }

    }
    static int[] parseIntArray(String[] arr) {
        return Stream.of(arr).mapToInt(Integer::parseInt).toArray();
    }
}
