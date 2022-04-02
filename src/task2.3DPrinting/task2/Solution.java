package task2;

import java.util.Scanner;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int[] mins = new int[]{1000001, 1000001, 1000001, 1000001};

            for (int p = 0; p < 3; p++) {
                for (int c = 0; c < mins.length; c++) {
                    mins[c] = Math.min(mins[c], scanner.nextInt());
                }
            }

            StringBuilder solution = new StringBuilder();
            int sum = 0;
            for (int c = 0; c < mins.length; c++) {
                sum += mins[c];
            }
            if (sum < 1000000)
                solution.append(" IMPOSSIBLE");
            else {
                sum = 0;
                for (int c = 0; c < mins.length; c++) {
                    sum += mins[c];
                    if (sum >= 1000000) {
                        solution.append(" ").append(mins[c] + 1000000 - sum);
                        sum = 1000000;
                    } else
                        solution.append(" ").append(mins[c]);

                }
            }

            System.out.println("Case #" + (i + 1) + ":" + solution);
        }
    }
}
