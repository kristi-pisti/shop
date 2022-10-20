import java.lang.*;

class triangle{
    // first class for triangle with 90 digree angle
    private final float foundation;
    private float leg1;//катет #1 т.е. высота

     //write constructor
     //"this" is a reference to the object on which the method was called
    public triangle(float foundation,float altitude) {
        this.foundation = foundation;
        this.leg1 = leg1;
    }
     public double findOutHypotenuse() {//find out the hypotenuse
         return Math.sqrt(foundation*2 + leg1*2);//math.sqrt returns the square root of a value of type double passed to it as argument
     }
     public double findOutSquare() {//we are searching our square for triangle
         return  Math.sqrt((foundation * leg1) / 2);
     }
     public double findOutPerimeter() {
         return findOutHypotenuse() + foundation + leg1;
     }

 }
///////next class for circle
 class Circumference {
    private float x;
    private float y;
    private float R;//R-radius,x,y - coordinates;
    //write constructor
    public Circumference(float x,  float y, float R){
        this.x = x;
        this.y = y;
        this.R = R;
    }
    public Circumference(float X, float Y){
        new Circumference((float) X, (float) Y, 0);
        /*is a constructor for a degenerate circle
        when the radius is zero.
         */
    }
    public  double getAreaCircumference(){
        return R * R * Math.PI;
    }
    public double getLengthCircumference(){
        return 2 * R * Math.PI;
    }
    public String toString() {
        return "Circle {" + "diameter = " + 2 * R + ", radius = " + R + '}';

}
}
/////////////////////////////
class Student {
    private static String  last_name ;
    private final String first_name;
    private String group = "AD-212";
    int course;
    public double middle_score = 87;

    public Student(String last_name, String first_name, int course, String ад, double middle_score){
        this.last_name = last_name;
        this.first_name = first_name;
        this.course = course;
        this.group = group;
        this.middle_score = middle_score;
    }
    public String getLast_name() {
        return last_name;
    }
    public String getFirst_name() {
        return first_name;
    }
    public int get_Course() {
        return course;
    }

    public String get_Group() {
        return group;
    }
    public double get_Middle_score() {
        return middle_score;
    }
    public int nextCourse(){
        return course ++;
    }

   public void averrageMark(double averageMark) {
        if (averageMark < 0){
            this.middle_score=0;}
        else if (averageMark == 100){
            this.middle_score=100;}
        else this.middle_score = averageMark;

    }
    public double findIfStudentHaveScholarship() {
        return 10*( middle_score>= 60 ? middle_score : 0);

    }}
////////
class Book {
    private int q;
    private String title;
    private String author;
    private int year;
    static final float discount = (float) 0.7;
    private float price1;
    private float price2;


    public Book(String title, String author, int year, float price1, int q){
        this.title = title;
        this.author = author;
        this.year = year;
        this.q = q;
        set_first_price(price1);
    }
///getters
    public String get_Author() {
        return author;
    }
    public String get_Title() {
        return title;
    }
    public int get_Year() {
        return year;
    }
    public double get_first_price() {
        return price1;
    }
    public void setQuantity(int quantity) {
        if (quantity<0) {
            quantity=0;
        }
        this.q = quantity;
        calcPrice();
    }

    public int getQuantity() {
        return q;
    }
    public void set_first_price(double initial_price) {
        this.price1=price1;
        calcPrice();
    }
    public double get_final_Price() {
        return price2;
    }


    public double calcPrice() {
        this.price2= price1 *(1- discount *q/(q+1));
        return 0;
    }

    //calculate total amount
    public double amount() {
        return price2*q;
    }}

class Figures {
    public static void main(String[] args) {
        triangle tr = new triangle(5, 6);
        System.out.printf("            TRIANGLE\nhypotenuse: " + tr.findOutHypotenuse() + "\nSquare" + tr.findOutSquare() + "\nPerimeter" + tr.findOutPerimeter());

        Circumference circle = new Circumference(10, 10, 6);
        System.out.printf("\n           CIRCLE\nLENGTH -  " + circle.getLengthCircumference() + "\nSQUARE - " +   circle.getAreaCircumference());



        Student student = new Student("Hnybeda", "Christina", 2, "212", 95);
        System.out.printf("         STUDENT\nLAST NAME - " + student.getLast_name() +"\nNAME - " + student.getFirst_name()  + "\nCOURSE - " + student.get_Course() + "\nGROUP"  + student.get_Group() + "\nAVERRAGE MARK - " + student.get_Middle_score());
        student.nextCourse();
        student.averrageMark(97);
        System.out.println("\nMoney for student  " + student.findIfStudentHaveScholarship());


        Book book = new Book("Триумфальная арка" , "  Эрих Мария Ремарк", 1945, 178, 2);
        System.out.printf("TITLE - " + book.get_Title()+ "\nAUTHOR  -  " +book.get_Author()+" \nYEAR  - " + book.get_Year() +"\nPRICE   -  "+book.get_first_price() + "\nQUANTITY - \n" + book.getQuantity());
        System.out.printf("\nQUANTITY - " + book.getQuantity()+"\nPRICE   -  "+book.calcPrice());
        book.setQuantity(45);
        System.out.printf("\nQUANTITY   - " + book.getQuantity());


    }


}



