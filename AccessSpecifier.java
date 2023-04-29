//class BaseClass {
//    public int x = 10;
//    private int y = 10;
//    protected int z = 10;
//    int a = 10;
//
//    public int getX(){
//        return x;
//    }
//    public void setX(){
//        this.x = x;
//    }
//    private void getY(){
//        return y;
//    }
//    private void setY(int y){
//        this.y=y;
//    }
//    protected int getZ() {
//        return z;
//    }
//    int getA(){
//        return a;
//    }
//    void setA(int a){
//        this.a = a;
//    }
//}
//public class AccessSpecifier extends BaseClass {
//    public static void main(String args[]){
//        BaseClass rr = new BaseClass();
//        rr.z=0;
//        AccessSpecifier subClassObj = new AccessSpecifier();
////        Access Modifier - public
//        System.out.println("Value of x is : " + subClassObj.x);
//        subClassObj.setX(20);
//        System.out.println("Value of x is : " + subClassObj.x);
////        System.out.println("Value of y is : " + subClassObj.y);
////        subClassObj.setY(20);
////        System.out.println("Value of y is : " + subClassObj.y);
//
////        Access Modifier - Protected
//        System.out.println("Value of z is : " + subClassObj.z);
//        subClassObj.setZ(30);
//        System.out.println("Value of z is : " + subClassObj.z);
//
////        Access Modifier - Default
//        System.out.println("Value of x is : " + subClassObj.a);
//        subClassObj.setA(20);
//        System.out.println("Value of x is : " + subClassObj.a);
//    }
//}
