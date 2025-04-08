
class Factorial {
    int i, fact = 1;
    int number;

    void display() {
        for(i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of " + number + "is " + fact);
    }
}

public class FactorialWithMain {
    public static void main(String[] args) {
        Factorial F1 = new Factorial();
        F1.number=5;
        F1.display();
    }
}
