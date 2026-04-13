/*
 * Program: StreamsDemo
 * Purpose: Demonstrate Java Stream API operations
 * Features Used:
 * 1. List.of() (Immutable List - Java 9+)
 * 2. Stream API
 * 3. Lambda Expressions
 * 4. Method Reference
 * 5. Intermediate Operations: filter(), map(), sorted()
 * 6. Terminal Operations: forEach(), count()
 * 7. Stream Reusability Concept (Important)
 */

import java.util.*;          // For List
import java.util.stream.*;   // For Stream API

class StreamsDemo {

    public static void main(String[] args) {

        // Creating an immutable list using List.of()
        List<Integer> marks = List.of(11, 3, 14, 15, 2, 19);

        // =====================================================
        // Example 1: Debugging Stream (Understanding Flow)
        // =====================================================
        /*
         * filter(): filters elements > 15
         * forEach(): prints elements
         * Lambda used for custom logic + debugging print
         */
        System.out.println("---- Filter > 15 (Debug Flow) ----");

        marks.stream()
             .filter(m -> {
                 System.out.println("Checking: " + m); // Debugging
                 return m > 15;
             })
             .forEach(System.out::println); // Method Reference

        // =====================================================
        // Example 2: Chaining Stream Operations
        // =====================================================
        /*
         * filter(): select elements > 15
         * map(): add 3 to each element
         * sorted(): sort ascending
         * count(): count total elements
         */
        System.out.println("\n---- Count after Operations ----");

        long count = marks.stream()
                          .filter(m -> m > 15)
                          .map(m -> m + 3)
                          .sorted()
                          .count(); // Terminal operation

        System.out.println("Count: " + count);

        // =====================================================
        // Example 3: Professional Stream Pipeline
        // =====================================================
        /*
         * filter(): select odd numbers
         * map(): convert odd -> even (add 1)
         * sorted(): sort result
         * forEach(): print output
         */
        System.out.println("\n---- Odd to Even Transformation ----");

        marks.stream()
             .filter(m -> m % 2 != 0)   // Odd numbers
             .map(m -> m + 1)           // Convert to even
             .sorted()                  // Sort
             .forEach(System.out::println);

        // =====================================================
        // Important Concept: Stream Cannot Be Reused
        // =====================================================
        /*
         * Once a stream is consumed (terminal operation used),
         * it CANNOT be reused.
         *
         * ❌ Wrong:
         * Stream<Integer> s = marks.stream();
         * s.forEach(System.out::println);
         * s.forEach(System.out::println); // ERROR
         *
         * ✅ Correct:
         * marks.stream().forEach(System.out::println);
         * marks.stream().forEach(System.out::println);
         */

        // =====================================================
        // Bonus: Reduce Example (Sum of elements)
        // =====================================================
        /*
         * reduce(): combines elements into single result
         * Here, calculating sum
         */
        System.out.println("\n---- Sum using reduce() ----");

        int sum = marks.stream()
                       .reduce(0, (a, b) -> a + b);

        System.out.println("Sum: " + sum);

        // =====================================================
        // Original List remains unchanged (Immutable)
        // =====================================================
        System.out.println("\n---- Original List ----");
        System.out.println(marks);
    }
}
