package medium;

import java.util.HashSet;
import java.util.Set;

/**
 * Given a N*N matrix M representing the friend relationship between students in the class. If M[i][j] = 1, then the ith and jth students are direct friends with each other, otherwise not. And you have to output the total number of friend circles among all the students.
 */
public class FriendCircles {

    public static void main(String[] args) {
        int[][] M = {
                {1, 0, 0, 1},
                {0, 1, 1, 0},
                {0, 1, 1, 1},
                {1, 0, 1, 1}
        };
        System.out.println(findCircleNum(M));
    }

    public static int findCircleNum(int[][] M) {
        Set<Set<Integer>> circles = new HashSet<>();
        for (int student = 0; student < M.length; student++) {
            int[] Rel = M[student];
            Set<Integer> circle = getCircle(student, circles);
            for (int other = 0; other < Rel.length; other++) {
                int isFriend = Rel[other];
                if (isFriend == 1) {
                    addFriendToCircle(circles, circle, other);
                }
            }
            circles.add(circle);
        }
        return circles.size();
    }

    private static void addFriendToCircle(Set<Set<Integer>> circles, Set<Integer> circle, int friend) {
        Set<Integer> f_circle = getCircle(friend, circles);
        if (!f_circle.isEmpty()) {
            circles.remove(f_circle);
            circle.addAll(f_circle);
        }
        circle.add(friend);
    }

    public static Set<Integer> getCircle(int student, Set<Set<Integer>> circles) {
        return circles.stream()
                .filter(c -> c.contains(student))
                .findFirst()
                .orElse(new HashSet<>());
    }
}
