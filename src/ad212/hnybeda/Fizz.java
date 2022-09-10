package ad212.hnybeda;



public class Fizz {
    public static void main(String[] args) {
        a();
    }
    public static void a(){
         for(int i=0; i<=100; i++){
            if (i%15==0) {
                System.out.print("\tFizzBuzz\t");
            }
            else if (i%3==0) {
                System.out.print("\tFizz\t");
            }
            else if (i%5==0){
                System.out.println("\tBuzz\t");

            }
            else {
                System.out.print(i);
            }

        }

    }
}
