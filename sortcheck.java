public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7};

        boolean isDescending = isDescending(arr);
        boolean isAscending = isAscending(arr);

        if (isDescending || isAscending) {
            System.out.print("Your array is sorted");
        } else {
            System.out.print("Your array is not sorted");
        }
    }

    public static boolean isDescending(int[] arr) {
        int i = 1;  // Start from index 1
        while (i < arr.length) {
            if (arr[i] > arr[i - 1]) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean isAscending(int[] arr) {
        int i = 1;  // Start from index 1
        while (i < arr.length) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
            i++;
        }
        return true;
    }
}
