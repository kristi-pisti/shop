import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

class GenericClass<D> {
    private ArrayDeque<D> deque = new ArrayDeque<>();

    public ArrayDeque<D> getDeque() {
        return deque;
    }

    public void setDeque(ArrayDeque<D> deque) {
        this.deque = deque;
    }

    public void addElement(D element) {
        deque.add(element);
    }

    public void deleteElement() {
        if (deque.isEmpty()) {
            System.out.println("\nEMPTY!");
            return;
        }
        deque.removeFirst();
    }

    public void outputElements() {
        System.out.println("\nList: ");
        for(D element : deque) {
            System.out.println(element + " ");
        }
    }
}


public class changed {
    static GenericClass g = new GenericClass();

    public static void main(String[] args) {
        int Menu;

        do {

            System.out.println("\n1. ADD SOME ELEMENT" + "\n2. LIST" + "\n3. -1 ELEMENT" + "\n4. Add random collecton to list" + "\n5. Delete all elements" + "\n6. ENTER");

            Scanner menuScanner = new Scanner(System.in);
            Menu = menuScanner.nextInt();

            switch (Menu) {
                case 1: addElement(); break;
                case 2: g.outputElements(); break;
                case 3: g.deleteElement(); break;
                case 4: addCollection(); break;
                case 5: deleteAllElements(); break;
                case 6: System.exit(0);
            }
        }while(Menu != 6);

    }

    private static <E> void deleteAllElements() {
        ArrayDeque<E> deque = g.getDeque();
        deque.clear();
        g.setDeque(deque);
    }

    private static void addElement(){
        Scanner StringScanner = new Scanner(System.in);
        System.out.println("\nInput element of the list");
        String s = StringScanner.nextLine();
        g.addElement(s);
    }

    private static void addCollection() {
        ArrayDeque<String> deque = g.getDeque();
        Collection<String> list = new ArrayList<>();
        for(int i = 0; i < 5; i++) {
            double n = Math.random()*100;
            list.add(String.valueOf(n));
        }
        deque.addAll(list);
        g.setDeque(deque);
    }
}
