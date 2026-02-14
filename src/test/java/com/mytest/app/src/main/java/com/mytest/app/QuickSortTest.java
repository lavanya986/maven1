import java.util.Arrays;

public class QuickSortTest {

    public static void main(String[] args) {
        testStandardArray();
        testAlreadySorted();
        testReverseSorted();
        testDuplicates();
        testSingleElement();
        testEmptyArray();
    }

    private static void test(String name, int[] input, int[] expected) {
        QuickSort.sort(input, 0, input.length - 1);
        if (Arrays.equals(input, expected)) {
            System.out.println("✅ PASSED: " + name);
        } else {
            System.out.println("❌ FAILED: " + name);
            System.out.println("   Expected: " + Arrays.toString(expected));
            System.out.println("   Actual:   " + Arrays.toString(input));
        }
    }

    static void testStandardArray() {
        int[] data = {8, 7, 2, 1, 0, 9, 6};
        int[] expected = {0, 1, 2, 6, 7, 8, 9};
        test("Standard Unsorted", data, expected);
    }

    static void testAlreadySorted() {
        int[] data = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        test("Already Sorted", data, expected);
    }

    static void testReverseSorted() {
        int[] data = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        test("Reverse Sorted", data, expected);
    }

    static void testDuplicates() {
        int[] data = {3, 1, 4, 1, 5, 3};
        int[] expected = {1, 1, 3, 3, 4, 5};
        test("Duplicate Elements", data, expected);
    }

    static void testSingleElement() {
        int[] data = {42};
        int[] expected = {42};
        test("Single Element", data, expected);
    }

    static void testEmptyArray() {
        int[] data = {};
        int[] expected = {};
        test("Empty Array", data, expected);
    }
}
