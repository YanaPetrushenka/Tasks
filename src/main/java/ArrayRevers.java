public class ArrayRevers {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int temp;
        int length = array.length;
        for (int i = 0; i < length / 2; i++) {
            temp = array[i];
            array[i] = array[length - i - 1];
            array[length - i - 1] = temp;
        }
        System.out.println("инвертированный массив: ");
        for (int element : array) {
            System.out.println(element + "");
        }
    }
}
