class loop{
    int i=1,j,row;
void displayforlop(){
    System.out.println("for loop...");
    for(i=0;i<=row;i++){
        for(j=0;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
void displayWhileLoop(){
    System.out.println("While loop....");
    i=1;
    while(i<=row){
        System.out.println("iteration= "+i);
        i++;
    }
}

void displayDoWhile(){
    System.out.println( "Do While loop....");
    j=1;
    do{
        System.out.println("number="+j);
        j++;

    }while(j<row);
}
    
}

public class loopByMainFun {
    public static void main(String[] args) {
        loop  l1 = new loop();
        l1.row=5;
        l1.displayforlop();
        l1.displayWhileLoop();
        l1.displayDoWhile();
    }
    
}
