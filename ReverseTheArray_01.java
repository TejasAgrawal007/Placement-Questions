class ReverseTheArray_01 {

    static void reverse(int arr[], int start, int end) {
        int temp;
        while (start <= end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void printArray(int arr[], int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };
        int size = arr.length;
        printArray(arr, size);
        System.out.println();
        reverse(arr, 0, size - 1);
        printArray(arr, size);
    }
}