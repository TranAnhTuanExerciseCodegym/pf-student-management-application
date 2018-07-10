public class StudentManagerTest {
    public static void main(String[] args) {
        Student student = new Student("Andy", 23);

        StudentManager studentManager = new StudentManager();
        studentManager.add(student);
        studentManager.add(student);
        studentManager.displayAll();
        studentManager.find("111");
        System.out.println("added " + student.getInfomation());
    }
}
