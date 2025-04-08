class pattern{
    int i,j;
    int row;
    void display(){
        for(i=0;i<=row;i++){
            for(j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
   
}





public class bymainClass {
    public static void main(String[] args) {
        pattern p1=new pattern();

        p1.row=5;
        p1.display();
    }
    
}
