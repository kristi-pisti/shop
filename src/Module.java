import java.util.Scanner;

public class  Module {
    public static void main(String[] args) {
        int day;
        System.out.println("_________HI________\n     ITS A NICE DAY!\nEnter the number of the day :) (1-7) ");
        Scanner input = new Scanner(System.in);
        day = input.nextInt();
        if(day==1){
            System.out.println("It is MONDAY!");
        }
        else if (day==2){
            System.out.println("It is TUESDAY!");
        }
        else if (day==3){
            System.out.println("It is WEDNESDAY!");
        } else if (day==4){
            System.out.println("It is THURSDAY!");
        } else if (day==5){
            System.out.println("It is FRIDAY!");
        } else if (day==6){
            System.out.println("It is SATURDAY!");
        }
        else if (day==7){
            System.out.println("It is SUNDAY!");
        }

    }
    }
