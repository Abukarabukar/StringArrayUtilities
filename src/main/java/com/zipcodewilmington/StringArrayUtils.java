package com.zipcodewilmington;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * 1
     *
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length - 1];

    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for (String element : array) {
            if (element.equals(value)) {
                return true;
            }
        }

        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] reversedArray = new String[array.length];

        for (int i = 0; i <= array.length - 1; i++) {
            reversedArray[i] = array[array.length - 1 - i];
        }


        return reversedArray;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {

        for (int i = 0; i <= array.length / 2; i++) {
            if (!array[i].equals(array[array.length - 1 - i])) {
                return false;
            }
        }
        return true;

    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        //put all characher in string in one one array
        String combined = String.join("", array).toLowerCase();

        // loop to check each letter in the alphabet
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (combined.indexOf(ch) < 0) {
                // If any letter is missing, return false
                return false;
            }
        }


        return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int time = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                time++;
            }
        }

        return time;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(valueToRemove)) {
                count++;
            }
        }
        String[] result = new String[array.length - count];

        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (!array[i].equals(valueToRemove)) {
                result[index++] = array[i];
            }
        }

        return result;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {

        List<String> result = new ArrayList<>();
        result.add(String.valueOf(array[0])); // Add the first character as a starting point


        for (int i = 1; i < array.length; i++) {

            if (!array[i].equals(array[i - 1])) {
                result.add(String.valueOf(array[i]));
            }
        }


        return result.toArray(new String[0]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {

        List<String> result = new ArrayList<>();
        StringBuilder currentPack = new StringBuilder(array[0]);


        for (int i = 1; i < array.length; i++) {

            if (array[i].equals(array[i - 1])) {
                currentPack.append(array[i]);
            } else {
                result.add(currentPack.toString());
                currentPack = new StringBuilder(array[i]);
            }
        }
        result.add(currentPack.toString());
        return result.toArray(new String[0]);
    }
}
