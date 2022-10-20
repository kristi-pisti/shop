import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        System.out.println("ENTER");
        String enter = new Scanner(System.in).nextLine();

        //output method 1
        System.out.println("line ends with |ed-true| other |false|  - "+ ifNextHasEd(enter));
        //output method 2
        System.out.println("The sum of your digits -  " + sumCharNumbers(enter));
        //output method 3
        System.out.println("The longest block -  " + findTheLongestBlock(enter));
        //output method 4
        System.out.println("Output in the console of the found words in the string -  "+ searchWords(enter));
        //input method 5
        System.out.print("Input a first string: ");
        String s1 = new Scanner(System.in).nextLine();
        System.out.print("Input a second string: ");
        String s2 = new Scanner(System.in).nextLine();
        //output method 5
        System.out.println("Mixed string: " + mixOfTwoStrings(s1,s2));
    }
    // method 1
    public static  boolean ifNextHasEd(String enter)
    {
        return enter.endsWith("ed");
        /*We have the string.With endsWith()
         we checked to see if the
         string ended in "ed" and returned true. */
    }
    // method 2
    private static int sumCharNumbers(String enter) {
        int sum = 0;
       if (enter != null) {
           int i = 0;
            /*The java isDigit(enter.charAt (i)) is an inbuilt method
               in java which determines whether the specified Unicode
               code point character of integer type is a digit or not.*/
           while (i < enter.length ()) {
               if (Character.isDigit (enter.charAt (i)))
               /*In a variable of type char, we assigned
               a value i and about the index.*/

                    {
                   sum += Character.getNumericValue (enter.charAt (i));
               }
               return sum;
           }
       }
        return sum;
    }
    // method 3
    private static int findTheLongestBlock(String enter) {
        char word = enter.charAt(0);
        int max = 0, length = 1;
        for (int i = 1; i < enter.length(); i++) {
            if (enter.charAt(i) == word) length++;
            else {
                word = enter.charAt(i);
            }
            if (length > max) max = length;
        }
        return max;
    }
    // method 4
    static int searchWords(String enter) {
        if (enter.length() == 0) {
            return 0;
        }
        int i;
        for (i = 0; i < enter.length(); i++) {
            System.out.println(enter.charAt(i));
        }
        return i;
    }
    // method 5
    private static String mixOfTwoStrings(String s1, String s2) {
        String shorter = s1;
        boolean longer = true;
        if (s1.length() > s2.length()) {
            shorter = s2;
            longer = false;
        }
        StringBuffer builder = new StringBuffer();
        int i;
        for (i = 0; i < shorter.length(); i++) {
            builder.append(s1.charAt(i)).append(s2.charAt(i));
        }
        if (longer)
            builder.append(s2.substring(i));
        else builder.append(s1.substring(i));
        //append() method adds a substring to the end of the StringBuffer:

        return builder.toString();

}
}










