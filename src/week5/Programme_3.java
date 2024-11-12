package week5;

//**Write a Java program to reverse an array of integer values
public class Programme_3 {

    public static void main(String[] args) {
        int[] array = {4, 5, 6, 7, 8, 9};

        System.out.println("Sequence array");
        printArray(array);

        reverseArray(array);

        System.out.println("\nReverse array");
        printArray(array);
    }

    //method to reverse array of integer value
    public static void reverseArray(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;
        }
    }

    //print array method
    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.println(i + " ");
        }
        System.out.println();
    }

}

