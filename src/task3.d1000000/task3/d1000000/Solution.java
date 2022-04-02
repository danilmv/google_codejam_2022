package task3.d1000000;

import java.util.*;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();

            List<Integer> s = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                s.add(scanner.nextInt());
            }
            Collections.sort(s);
            int straight = 0;
            for (int value : s) {
                straight++;
                if (value < straight) {
                    straight--;
                }
            }
            System.out.println("Case #" + (i + 1) + ": " + straight);
        }
    }
}
