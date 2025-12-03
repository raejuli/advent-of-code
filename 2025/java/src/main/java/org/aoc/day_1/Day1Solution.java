package org.aoc.day_1;

public class Day1Solution {
    public static long run(String[] rotations) {
        long count = 0;
        long dial = 50;

        for (String item : rotations) {
            char direction = item.charAt(0);
            long steps = Long.parseLong(item.substring(1));
            long toZero = direction == 'L' ? dial : 100 - dial;

            if (toZero == 0) {
                toZero = 100;
            }

            if (steps >= toZero) {
                count += 1 + (steps - toZero) / 100;
            }

            dial = ((dial + (direction == 'L' ? -steps : steps)) % 100 + 100) % 100;
        }

        return count;
    }
}
