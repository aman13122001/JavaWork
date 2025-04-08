
class college {
    static int a=0;
    college(){
        a++;
    }

}
class StaticA{
    public static void main(String[] args) {
        System.out.println(college.a);
    }
}
