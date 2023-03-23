class MinMaxNum_02 {

    public static void main(String[] args) {
        int arr[] = { 10, 20, 1, 100, 30, 40 };
        int size = arr.length;
        MinMax m = new MinMax();
        System.out.println("Min Value = " + m.min(arr));
        System.out.println("Max Value = " + m.max(arr));
    }
}



class MinMax {

    public int max(int arr[]) {
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public int min(int arr[]) {
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

}
