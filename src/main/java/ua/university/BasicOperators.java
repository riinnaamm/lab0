package ua.university;

/**
 * BasicOperators class contains a set of static methods
 * for practicing Java operators, loops, arrays, and branching.
 */
public class BasicOperators {

    /**
     * Returns the sum and average of three integers.
     *
     * @param a first integer
     * @param b second integer
     * @param c third integer
     * @return double array where [0] is the sum and [1] is the average
     */
    public static double[] sumAndAverage(int a, int b, int c) {
        return null;
    }

    /**
     * Returns the maximum of three integers.
     *
     * @param a first integer
     * @param b second integer
     * @param c third integer
     * @return the largest of the three values
     */
    public static int maxOfThree(int a, int b, int c) {
        return 0;
    }

    /**
     * Returns the corresponding grade letter for a given numeric score.
     * <p>
     * The grading scale is as follows:
     * <ul>
     *     <li>90-100: 'A'</li>
     *     <li>80-89:  'B'</li>
     *     <li>70-79:  'C'</li>
     *     <li>60-69:  'D'</li>
     *     <li>50-59:  'E'</li>
     *     <li>0-49:   'F'</li>
     * </ul>
     *
     * @param score the numeric score, expected to be between 0 and 100 inclusive
     * @return the grade letter corresponding to the given score
     * @throws IllegalArgumentException if {@code score} is less than 0 or greater than 100
     */
    public static char gradeFromScore(int score) {
        return '0';
    }

    /**
     * Returns the English name of the day of the week for a number 1-7,
     * where 1 is Monday and 7 is Sunday.
     * <p>
     * Returned values are exactly:
     * {@code "Monday"}, {@code "Tuesday"}, {@code "Wednesday"},
     * {@code "Thursday"}, {@code "Friday"}, {@code "Saturday"}, {@code "Sunday"}.
     *
     * @param day the day number, from 1 (Monday) to 7 (Sunday)
     * @return the English name of the day
     * @throws IllegalArgumentException if {@code day} is less than 1 or greater than 7
     */
    public static String dayOfWeek(int day) {
        return null;
    }

    /**
     * Returns an array counting down from n to 1.
     *
     * @param n the starting value
     * @return an array holding n, n-1, ..., 1; an empty array if {@code n} is 0
     * @throws IllegalArgumentException if {@code n} is negative
     */
    public static int[] countdown(int n) {
        return null;
    }

    /**
     * Returns the factorial of n.
     *
     * @param n the number whose factorial is calculated
     * @return the factorial of {@code n}; 1 when {@code n} is 0
     * @throws IllegalArgumentException if {@code n} is negative
     */
    public static long factorial(int n) {
        return 0;
    }

    /**
     * Returns a reversed copy of the array.
     *
     * @param arr the array to reverse; must not be null
     * @return a new array holding the elements in reverse order;
     *         the argument is left unchanged
     * @throws IllegalArgumentException if {@code arr} is null
     */
    public static int[] reverseArray(int[] arr) {
        return null;
    }

    /**
     * Returns the sum of all elements in a 2D array (matrix).
     *
     * @param matrix the matrix to sum; must not be null
     * @return the sum of every element; 0 for a matrix with no elements
     * @throws IllegalArgumentException if {@code matrix} is null
     */
    public static int sumMatrix(int[][] matrix) {
        return 0;
    }

    /**
     * Checks if a string is a palindrome.
     * <p>
     * Comparison is case-sensitive and takes every character into account,
     * including spaces and punctuation.
     *
     * @param s the string to check; must not be null
     * @return {@code true} if {@code s} reads the same forwards and backwards
     * @throws IllegalArgumentException if {@code s} is null
     */
    public static boolean isPalindrome(String s) {
        return false;
    }

    /**
     * Returns the minimum and maximum of an array.
     *
     * @param arr the array to scan; must not be null or empty
     * @return double-element array where [0] is the minimum and [1] is the maximum
     * @throws IllegalArgumentException if {@code arr} is null or empty
     */
    public static int[] findMinMax(int[] arr) {
        return null;
    }

    /**
     * Returns an n x n multiplication table.
     * <p>
     * The element at row i and column j holds the product (i + 1) * (j + 1).
     *
     * @param n the size of the table
     * @return a matrix of n rows by n columns
     * @throws IllegalArgumentException if {@code n} is less than 1
     */
    public static int[][] multiplicationTable(int n) {
        return null;
    }

    /**
     * Returns all even numbers from 2 up to and including n.
     *
     * @param n the upper bound, inclusive
     * @return an array of even numbers in ascending order;
     *         an empty array if {@code n} is less than 2
     */
    public static int[] evenNumbersUpToN(int n) {
        return null;
    }

    /**
     * Checks if a number is prime.
     *
     * @param n the number to check
     * @return {@code true} if {@code n} is prime;
     *         {@code false} for any {@code n} less than 2
     */
    public static boolean isPrime(int n) {
        return false;
    }

    /**
     * Counts vowels in a string.
     * <p>
     * Only the Latin vowels a, e, i, o, u are counted, in both lower
     * and upper case. The letter y is not counted.
     *
     * @param s the string to scan; must not be null
     * @return the number of vowels found
     * @throws IllegalArgumentException if {@code s} is null
     */
    public static int countVowels(String s) {
        return 0;
    }

    /**
     * Returns the first n Fibonacci numbers, starting with 0 and 1.
     *
     * @param n how many numbers to return
     * @return an array holding 0, 1, 1, 2, 3, ... of length {@code n};
     *         an empty array if {@code n} is 0
     * @throws IllegalArgumentException if {@code n} is negative
     */
    public static int[] fibonacci(int n) {
        return null;
    }

    /**
     * Returns the transpose of a 2D array (matrix).
     *
     * @param matrix a rectangular matrix; must not be null
     * @return a new matrix where rows and columns are swapped;
     *         the argument is left unchanged
     * @throws IllegalArgumentException if {@code matrix} is null
     */
    public static int[][] transpose(int[][] matrix) {
        return null;
    }

    /**
     * Returns a sorted copy of the array in ascending order.
     *
     * @param arr the array to sort; must not be null
     * @return a new array holding the elements in ascending order;
     *         the argument is left unchanged
     * @throws IllegalArgumentException if {@code arr} is null
     */
    public static int[] sortArray(int[] arr) {
        return null;
    }
}
