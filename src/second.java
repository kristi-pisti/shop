interface Interface {
    void printInfo();
}
class Lecturer extends Person {
    String department;
    int money;

    public Lecturer(String department, String name, int age, int salary) {
        super(name, age);
        this.department = department;
        this.money = money;
    }

    @Override
    public void printInfo() {
        System.out.println("Lecturer of the department: " + department + "; Name: " + name + "; Age: " + age + "; Salary: " + money);
    }
    /*
    public String getDepartment() {
        return department;
    }
    public int getSalary() {
        return salary;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    */

}




public class second {
    public static void main(String[] args) {

        Person[] people = new Person[4];
        people[0] = new Person("Lena Kryklya", 19);
        people[1] = new Person("Sasha Petrov", 21);
        people[2] = new Man(212, "Christina Hnybeda", 18, 899);
        people[3] = new Man(212, "Andrey Privalov", 18, 678);

        for (Person person : people) {
            printInfo(person);
        }
    }
    public static void printInfo(Person p) {
        p.printInfo();
    }
}
class Person implements Interface {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    /*
    public String getName() {
    return name;
    }
    public int getAge() {
    return age;
    }
    public void setName(String name) {
    this.name = name;
    }
    public void setAge(int age) {this.age = age;}
    */

    @Override
    public void printInfo() {System.out.println("Name: " + name + "; Age: " + age);}

}
