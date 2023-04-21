package students;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Eduardo");
        student1.addGrade(70);
        student1.addGrade(80);
        student1.addGrade(90);
        //System.out.println(student1.getGrades().get(1));
        System.out.println(student1.getGradeAverage());
    }
}