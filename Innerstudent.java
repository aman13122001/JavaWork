class student {
    int rollno;
    String name;
    void display(){
        System.out.println("Roll No ="+rollno);
        System.out.println("Name is ="+name);
    }

    
}


public class Innerstudent {

    public static void main(String[] args) {
        student s1=new student();
        s1.rollno=19;
        s1.name="Aman";
        s1.display();
    }

    
}

