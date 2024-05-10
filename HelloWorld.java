public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        quick_sort(array, 0, array.length - 1);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void quick_sort(int[] array, int low, int high) {
        int begin = low;
        int end = high;
        int key = begin;
        int temp;

        if (low >= high) {
            return;
        }

        while (begin < end) {
            while (begin < end && array[end] >= array[key]) {
                end -= 1;
            }

            while (begin < end && array[begin] <= array[key]) {
                begin += 1;
            }

            temp = array[begin];
            array[begin] = array[end];
            array[end] = temp;
        }

        temp = array[begin];
        array[begin] = array[key];
        array[key] = temp;
        quick_sort(array, low, begin - 1);
        quick_sort(array, begin + 1, high);
        return;
    }
}
