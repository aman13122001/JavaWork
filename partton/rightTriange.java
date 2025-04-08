class printPartton{
    int i=1,j=0,n=5;
    void display(){
       for(i=0;i<=n;i++){
        for(j=0;j<=i;j++){
            System.out.print("*");
        }
            System.out.println();
       }
    }

   
}

public class rightTriange {
    public static void main(String[] args) {
        printPartton p1 = new printPartton();
        p1.n=5;
        p1.display();  
    }

    
    
}
