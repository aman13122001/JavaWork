class Counter {
    static int count=0;
    Counter(){
        count++;
    }
    void dipalayCount(){
        System.out.println("Count "+count);
    }
}


public class Main {
    public static void main(String[] args) {
    Counter c1 =new Counter();
       
    System.out.println(Counter.count);
    }
    
}
