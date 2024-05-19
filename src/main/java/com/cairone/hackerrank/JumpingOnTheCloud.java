package com.cairone.hackerrank;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * There is a new mobile game that starts with consecutively numbered clouds.
 * Some of the clouds are thunderheads and others are cumulus.
 * The player can jump on any cumulus cloud having a number that is equal to the number
 * of the current cloud plus 1 or 2. The player must avoid the thunderheads.
 * Determine the minimum number of jumps it will take to jump from the starting position
 * to the last cloud. It is always possible to win the game.
 * <p>
 * For each game, you will get an array of clouds numbered 0 if they are safe or 1 if they must be avoided.
 * <p>
 * Example: c = [0, 1, 0, 0, 0, 1, 0]
 * <p>
 * Index the array from 0 ... 6. The number on each cloud is its index in the list so the player must
 * avoid the clouds at indices 1 and 5. They could follow these two paths: 0 -> 2 -> 4 -> 6
 * or 0 -> 2 -> 3 -> 4 -> 6. The first path takes 3 jumps while the second takes 4.
 * Return 3.
 * <p>
 * Function Description
 * <p>
 * Complete the jumpingOnClouds function in the editor below.
 * jumpingOnClouds has the following parameter(s):
 * int c[n]: an array of binary integers
 * <p>
 * Returns
 * int: the minimum number of jumps required
 * <p>
 * Input Format
 * <p>
 * The first line contains an integer n, the total number of clouds.
 * The second line contains n space-separated binary integers describing clouds c[i] where  0 <= i < n.
 * <p>
 * Constraints
 * 2 <= n <= 100
 * c[i] in {0, 1}
 * c[0] = c[n-1] = 0
 * <p>
 * Output Format
 * Print the minimum number of jumps needed to win the game.
 * Sample Input 0
 * 7
 * 0 0 1 0 0 1 0
 * <p>
 * Sample Output 0
 * 4
 */
@Slf4j
public class JumpingOnTheCloud {

    public static int jumpingOnClouds(List<Integer> c) {

        boolean jump = true;
        int jumpCount = 0;
        int idx = 0;

        while (jump) {
            int immediateType = c.get(idx + 1);
            int nextType = idx + 2 >= c.size() ? 1 : c.get(idx + 2);
            if (immediateType == 0 && nextType == 1) {
                idx += 1;
            } else if (immediateType == 1 && nextType == 0) {
                idx += 2;
            } else if (immediateType == 0 && nextType == 0) {
                idx += 2;
            }
            jumpCount++;
            if (idx >= c.size() - 1) {
                jump = false;
            }
        }

        return jumpCount;
    }

    public static void main(String[] args) {
//        List<Integer> list = List.of(0, 0, 1, 0, 0, 1, 0);
//        List<Integer> list = List.of(0, 1, 0, 0, 0, 1, 0);
        List<Integer> list = List.of  (0, 0, 0, 1, 0, 0);
        int rv = jumpingOnClouds(list);
        System.out.println("Result: " + rv);
    }
}
