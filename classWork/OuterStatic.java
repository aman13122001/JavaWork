public class OuterStatic {

    static int x=10;
    static class inner{
        void show(){
            System.out.println("Nested Inner class:");
            System.out.println("Access out class static dada member:"+x);
        }
    }

    public static void main(String[] args) {
        OuterStatic.inner  o1 = new OuterStatic.inner();
        o1.show();
    
}
}
