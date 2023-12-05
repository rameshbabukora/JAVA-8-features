package CORE_JAVA.JAVA_8_FEATURES;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveDuplicateElementsInArray {
    public static void main(String[] args) {
        // Example array with duplicates
        Integer[] array = {1, 2, 2, 3, 4, 4, 5};
        String[] str={"ram","raja","ram"};

        // Remove duplicates using Java 8 Stream API
        Integer[] uniqueArray = Arrays.stream(array)
                .distinct()
                .toArray(Integer[]::new);
        // Print the result
        System.out.println(Arrays.toString(uniqueArray));
        Stream<String> str1= Arrays.stream(Arrays.stream(str).distinct().toArray(String[]::new));
        // Print the result
        System.out.println(Arrays.toString(str1.toArray()));



    }
}
