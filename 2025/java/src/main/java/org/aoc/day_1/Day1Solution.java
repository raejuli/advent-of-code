package org.aoc.day_1;

public class Day1Solution {
    public static long run(String[] rotations) {
        long count = 0;
        long dial = 50;

        for (String item : rotations) {
            char direction = item.charAt(0);
            if (direction == 'L') {
                dial -= Long.parseLong(item.substring(1));
            } else if (direction == 'R') {
                dial += Long.parseLong(item.substring(1));
            }

            while (dial < 0) {
                dial = 100 + dial;
            }

            while (dial > 99) {
                dial = dial % 100;
            }


            if (dial == 0) {
                count++;
            }
        }

        return count;
    }
}
