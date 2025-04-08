class dataType{
    int num;
    char ch;
    boolean bol;
    String str;
    float fl;
    long l;
    byte b;
    short sh;
    double du;

    void display(){
        System.out.println("int value= "+num + "char value= "+ch+ "boolean value= "+bol+"Steing value="+str+ "float value="+fl+ "long value= "+l+"byte value= "+b+ "short value= "+sh+"double value= "+du);
    }
}

public class datatypebymainfun {

    public static void main(String[] args) {
        dataType d1 = new dataType();
        d1.num=112;
        d1.ch='a';
        d1.bol=true;
        d1.str="Aman";
        d1.fl=123.122f;
        d1.l=1234567;
        d1.b=123;
        d1.sh=987;
        d1.du=123456;
        d1.display();
    }


    
}
