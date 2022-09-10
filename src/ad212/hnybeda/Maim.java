package ad212.hnybeda;

import java.util.Scanner;

public class Maim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("- - - - Enter size - - - - ");
        int sizeArray;
        sizeArray = scanner.nextInt();
        int [] array = new int[sizeArray];



        for (int i = 0; sizeArray > i; i++) {
            System.out.print(" |Element #" + i + "|");
            array[i] = scanner.nextInt();
        }
        System.out.println(isSorted(array));
    }
    private static boolean isSorted(int[] array) {
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i + 1]) {
                    return false;
                }
            }
        return true;
    }
}

