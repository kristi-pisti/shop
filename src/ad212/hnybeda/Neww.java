package ad212.hnybeda;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Name: " + name + "; Age: " + age);
    }

}
class Student extends Person {
    int gr_Number;
    int ticketNumber;

    public Student( int groupNumber, String name, int age, int ticketNumber) {
        super(name, age);
        this.gr_Number = groupNumber;
        this.ticketNumber = ticketNumber;
    }

    public int getGroupNumber() {
        return gr_Number;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.gr_Number = groupNumber;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }


    public void printInfo() {
        System.out.println("Student of group: " + gr_Number + "; Name: " + name + "; Age: " + age + "; Student ticket number: " + ticketNumber);
    }

}

class Lecturer extends Person {
    String location;
    int money;

    public Lecturer(String location, String name, int age, int money) {
        super(name, age);
        this.location = location;
        this.money = money;
    }

    public String getDepartment() {
        return location;
    }

    public int getSalary() {
        return money;
    }

    public void setDepartment(String location) {
        this.location = location;
    }

    public void setSalary(int salary) {
        this.money = money;
    }


    public void printInfo() {
        System.out.println("Lecturer of the department: " + location + "|Name= " + name + "| Age = " + age + "| Salary= " + money);
    }

}
public class Neww {
    public static void main(String[] args) {


        Person[] ppl = new Person[4];
        ppl[0] = new Person("  Henri Pupovich  ", 45);
        ppl[1] = new Student(  212, "Katya Boyko  ", 18, 32);
        ppl[2] = new Lecturer("  ICS  ", "  Zubarev Kolya  ", 25, 231343434);
        ppl[3] = new Lecturer("  ICS  ", "  Luda S Golivuda ", 65, 1);

        for (Person person : ppl) {
            printInfo(person);
        }
    }
    public static void printInfo(Person p) {
        p.printInfo();
    }
}
