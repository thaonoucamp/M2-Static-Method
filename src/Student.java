public class Student {
    private int rol;
    private String name;
    private static String college = "BBDIT";

    Student(int r, String n) {
        rol = r;
        name = n;
    }

    static void change() {
        college = "CODEGYM";
    }

    void display() {
        System.out.println(rol + " " + name + " " + college);
    }
}
