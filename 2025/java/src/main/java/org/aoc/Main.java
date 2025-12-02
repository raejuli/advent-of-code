package org.aoc;

import org.aoc.day_1.Day1Solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStream in = Main.class.getClassLoader().getResourceAsStream("day_1.txt");
        if (in == null) {
            throw new IOException("Resource not found on classpath: day_1.txt");
        }
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(in, StandardCharsets.UTF_8));
             Stream<String> lines = reader.lines()) {
            String[] input = lines.toArray(String[]::new);
            long result = Day1Solution.run(input);
            System.out.println(result);
        }
    }
}
