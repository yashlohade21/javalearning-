class Student {
    int rollno;
    String name, course;
    float fee;
    Student( int rollno, String name, String course ){
        this.rollno = rollno;
        this.name = name;
        this.course = course;
    }
    Student(int rollno, String name, String course, float fee){
        this(rollno, name, course);
        this.fee=fee;
    }
    void display() {
        System.out.println(rollno+ " "+name+" "+course+" "+fee);
    }
}
public class ThisAvoidCollision {
    public static void main(String args[]){
        Student s1 = new Student(111, "Ankit", "Java");
        Student s2 = new Student(112, "Sumit", "Java", 6000f);
        s1.display();
        s2.display();
    }
}
