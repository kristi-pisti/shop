import java.util.Scanner;




//We create the Item class.
class Item {
    //fields
    private String name;    //string-name
    private float price;    //float-price
    //the constructor accepts the name and the initial price of the product.
    public Item (String name, float price) {
        this.name = name;
        this.price = price;

        inCaseIfPriceNegativePriceToNull();
    }
    //getters
    public String getName()
    {
        return name;
    }
    public float getPrice()
    {
        return price;
    }

    /*We call the setName() method on the name object, pass it a string as an argument,
     and that string is assigned to the name field of our object.*/
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(float price) {
        this.price=price;
        inCaseIfPriceNegativePriceToNull();
    }

    ////public method: increasing the price by a certain percentage
    public void increasePrice(float percent) {
        increase(percent);
    }
    private void increase(float percent) {
        price+=price*percent/100;
        inCaseIfPriceNegativePriceToNull();
    }
    //public method: decreasing the price by a certain percentage
    public void decreasePrice(float percent) {
        decrease(percent);
    }
    private void decrease(float percent) {
        price-=price*percent/100;
        inCaseIfPriceNegativePriceToNull();
    }
    //method - check if the price is negative
    private void inCaseIfPriceNegativePriceToNull() {
        if (price<0) {
            System.out.println("Ваша цена негативная,приравниваю её к нулю");
            price=0;}}
}

//I create a class Cart
class Cart {
    //data structure stack, which contains objects of the class "item"
    private final Item[] stack;
    private int number;
    public Cart(int maxNumber) {
        stack=new Item[maxNumber];
        number=0;
    }


    //getters
    public Item[] getStack() {
        return stack;
    }
    public int getItemNumber() {
        return number;
    }
    public void addItem(Item i) {
        if (isStackFull ())
            return;
        stack[number] = i;
        number++;
    }
    public void deleteItem() {
        if (isStackEmpty())
            return;
        stack[number-1] = null;
        number--;
    }

    //sum prices of item
    public float sumItemPrice() {
        float sum=0;
        for (Item item : stack) {
            sum += item.getPrice();
        }
        return sum;
    }

    //increasing price
    public void increaseItemPrice(float percent) {
        for (Item item : stack) {
            item.increasePrice(percent);
        }
    }

    //decreasing price
    public void decreaseItemPrice(float percent) {
        for (Item item : stack) {
            item.decreasePrice(percent);
        }
    }
    //checking if stack is full
    private boolean isStackFull() {
        boolean error=number==stack.length;
        if(error) System.out.println("Basket is already full");
        return error;
    }

    //checking if stack  empty
    private boolean isStackEmpty() {
        boolean error=number==0;
        if(error) System.out.println("Basket is empty");
        return error;
    }
}

/////////////////////
public class Main {
    public static void main(String[] args) {
        Cart basket;

        basket = inputItems();

        System.out.println("_______BASKET_______");
        outputCart(basket);

        System.out.println("Sum of prices of all items in the cart   " + basket.sumItemPrice());

        System.out.println(" ___+15%___ ");
        basket.increaseItemPrice(15);
        outputCart(basket);
        System.out.println("Sum of prices of all items in the cart: " + basket.sumItemPrice());

        System.out.println("___-30%___ ");
        basket.decreaseItemPrice(30);
        outputCart(basket);
        System.out.println("Sum of prices of all items in the cart: " + basket.sumItemPrice());
    }

    //adding items to cart
    public static Cart inputItems() {
        int itemNumber;
        Cart basket;
        Scanner nameScanner = new Scanner(System.in);
        Scanner numberScanner = new Scanner(System.in);

        //input number of items in the cart
        do {
            System.out.println("Input items number in the cart (>0):");
            itemNumber = numberScanner.nextInt();
            if (itemNumber <= 0) System.out.println("Please, input a number more than 0.");
        } while (itemNumber <= 0);

        //cart initialisation
        basket = new Cart(itemNumber);

        //cart filling by items
        for (int i = 0; i < itemNumber; i++) {
            System.out.println("\nInput name of item #" + (i + 1));
            String name = nameScanner.nextLine();
            System.out.println("Input price of item #" + (i + 1));
            float price = numberScanner.nextFloat();

            basket.addItem(new Item(name, price));
        }

        return basket;
    }

    //outputting of the cart
    public static void outputCart (Cart basket) {
        for (int i=0; i<basket.getItemNumber(); i++) {
            System.out.println("Item #" + (i + 1) + ": " + basket.getStack()[i].getName() + " - " + basket.getStack()[i].getPrice());
        }
    }



}
//////////////////



