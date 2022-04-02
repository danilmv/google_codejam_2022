package task1.PuchedCards;

import java.util.Scanner;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);
    private static char[] row;
    private static char[][] symbol = new char[][]{{'+', '-'}, {'|', '.'}};

    public static void main(String[] args) {
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int r = scanner.nextInt();
            int c = scanner.nextInt();
            row = new char[c * 2 + 1];
            System.out.println("Case #" + (i + 1) + ":");
            for (int y = 0; y < r * 2 + 1; y++) {
                for (int x = 0; x < c * 2 + 1; x++) {
                    if (x <= 1 && y <= 1) row[x] = '.';
                    else row[x] = symbol[y % 2][x % 2];
                }
                System.out.println(row);
            }

        }
    }
}
