class student{
    int rollno;
    String nume;
    void display(){
        System.out.println("Roll No is -->"+rollno);
        System.out.println("Name is -->"+nume);
    }
}
public class M{
public static void main(String[]args){

    student s1=new student();
    s1.rollno =19;
    s1.nume="Aman kumar";
    s1.display();

}
}
