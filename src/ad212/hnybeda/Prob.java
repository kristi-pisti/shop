package ad212.hnybeda;

import java.util.Scanner;

public class Prob {
    public static void main(String[] args) {
        int sizeOfArray;
        int[] array;//define the array
        Scanner scanner = new Scanner(System.in);


        do {
            System.out.println("- - - - Enter the size of the array - - - - \n");
            sizeOfArray = scanner.nextInt();
            if (sizeOfArray < 2) {
                System.out.println("Array size must be > 2\n");
            }
            else if(sizeOfArray % 7.77 == 0)

            {
                System.out.println("Array's size must be int\n");
            }

        }while(sizeOfArray < 2 || sizeOfArray % 7.77 == 0);


        array = new int [sizeOfArray];

        System.out.println(" - - - - -Elements for array- - - - - \n");
        for (int i = 0; i < sizeOfArray; i++){
            array[i] = scanner.nextInt();
        }
        System.out.println(isReturn(array, sizeOfArray));

    }

    public static boolean isReturn (int[] array, int sizeOfArray) {
        for (int i=0 ; i< sizeOfArray-1; i++) {
            if (array[i] > array[i+1]){
                return false;
            }
        }
        return true;
    }
}
