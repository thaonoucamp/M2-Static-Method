public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();

        Student s1 = new Student(1, "Thao");
        Student s2 = new Student(2, "Tha");
        Student s3 = new Student(3, "Thu");

        s1.display();
        s2.display();
        s3.display();
    }
}
