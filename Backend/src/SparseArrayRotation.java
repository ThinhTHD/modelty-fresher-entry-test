import java.util.Arrays;

public class SparseArrayRotation {
    public static void main(String[] args) {
        Integer[] input = {1, null, 2, null, 3};
        int steps = 2;
        Integer[] result = rotateSparseArray(input, steps);
        System.out.println(Arrays.toString(result)); // Expected: [null, 2, null, 3, 1]
    }

    public static Integer[] rotateSparseArray(Integer[] array, int steps) {
        if (array == null || array.length == 0) {
            return array;
        }

        int n = array.length;
        steps = ((steps % n) + n) % n; // Ensure steps is positive and within array length

        Integer[] nonDefaultValues = Arrays.stream(array)
                                           .filter(num -> num != null)
                                           .toArray(Integer[]::new);

        rotateArray(nonDefaultValues, steps);

        Integer[] result = new Integer[n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            result[i] = (array[i] == null) ? null : nonDefaultValues[index++];
        }

        return result;
    }

    private static void rotateArray(Integer[] array, int steps) {
        int n = array.length;
        reverse(array, 0, n - 1);
        reverse(array, 0, steps - 1);
        reverse(array, steps, n - 1);
    }

    private static void reverse(Integer[] array, int start, int end) {
        while (start < end) {
            Integer temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}
