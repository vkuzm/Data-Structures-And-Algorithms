package Problems.Other.ContainsCommonItems;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        String[] array1 = {"a", "b", "c", "x"};
        String[] array2 = {"z", "y", "a"};

        // Brutal solution
        // O(n^2)
        System.out.println(containsCommonItem(array1, array2));

        // Better solution
        // O(n+m)
        System.out.println(containsCommonItem2(array1, array2));


        List<String> list1 = Arrays.asList("a", "b", "c", "x");
        List<String> list2 = Arrays.asList("z", "y", "a");

        // Better solution (List collection)
        // O(n+m)
        System.out.println(containsCommonItem3(list1, list2));

        // Better solution (Stream)
        // O(n+m)
        System.out.println(containsCommonItem4(list1, list2));
    }

    private static boolean containsCommonItem(String[] array1, String[] array2) {

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i].equals(array2[j])) {
                    return true;
                }
            }
        }

        return false;
    }

    private static boolean containsCommonItem2(String[] array1, String[] array2) {
        Set<String> set = new HashSet<>();

        for (String array : array1) { // O(n)
            set.add(array); // O(1)
        }

        for (String array : array2) { // O(n)
            if (set.contains(array)) { // O(1)
                return true;
            }
        }

        return false;
    }

    private static boolean containsCommonItem3(List<String> array1, List<String> array2) {
        Set<String> uniqueValues = new HashSet<>(array1);

        for (String array : array2) { // O(n)
            if (uniqueValues.contains(array)) { // O(1)
                return true;
            }
        }

        return false;
    }

    private static boolean containsCommonItem4(List<String> list1, List<String> list2) {
        // return list1.stream().anyMatch(list2::contains);
        return list1.stream().anyMatch(new HashSet<>(list2)::contains);
    }

}
