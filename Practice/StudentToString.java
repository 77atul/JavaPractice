public class StudentToString {
    String name;
    int age;
    String div;
    int rollno;

    public StudentToString( String name, int age, String div, int rollno) {
        this.name = name;
        this.age = age;
        this.div = div;
        this.rollno = rollno;
    }

    @Override
    public String toString() {
        return "Student details:{" +
                " name of student: " + name + " ," +
                " age of student: " + age + " ," +
                " class div: " + div + " , " +
                " roll number: " + rollno + " ," +
                "}";
    }

    public static void main(String[] args) {
        StudentToString student = new StudentToString("atul", 19,"u",50);
        System.out.println(student);
    }
}
