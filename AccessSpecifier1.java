class AS1{
    public void msg1() {
        System.out.println("Class A: Public!");
    }
    public void msg2() {
        System.out.println("Class A: Public!");
    }
    public void msg3() {
        System.out.println("Class A: Public!");
    }
}
public class AccessSpecifier1 extends AS1{
    void msg(){
        System.out.println("CLass Main: Welcome!");
    }
    public void msg1() {
        System.out.println("Overriding Public Method!");
    }
    public void msg2() {
        System.out.println("Overriding Private Method!");
    }
    public void msg3() {
        System.out.println("Overriding Protected Method!");
    }

    public static void main(String args[]){
        AccessSpecifier1 obj = new AccessSpecifier1();
        obj.msg();
//        obj.msg1();
//        obj.msg2();
//        obj.msg3();
    }
}
