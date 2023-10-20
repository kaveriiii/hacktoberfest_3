public class ShellSort {
    public static void main(String[] args) {
        int[] arr = {12, 34, 54, 2, 3};
        
        System.out.println("Original Array:");
        printArray(arr);

        shellSort(arr);

        System.out.println("\nSorted Array:");
        printArray(arr);
    }

    public static void shellSort(int arr[]) {
        int n = arr.length;

        // Start with a large gap and reduce it over time
        for (int gap = n / 2; gap > 0; gap /= 2) {
            // Perform an insertion sort for the elements at the current gap
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap];
                }
                arr[j] = temp;
            }
        }
    }

    public static void printArray(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
