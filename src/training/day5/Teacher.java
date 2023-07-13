package training.day5;

public class Teacher extends Person{

    private String school;
    private String subject;
    private int salary;
    private int[] grades = new int[100];

    public Teacher(String name, String gender, int ID, String school, String subject, int salary) {
        super(name, gender, ID);
        this.school = school;
        this.subject = subject;
        this.salary = salary;
    }

    public String getSchool() {
        return school;
    }

    public String getSubject() {
        return subject;
    }

    public int getSalary() {
        return salary;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int grades) {

        for(int i = 0;i < 100;i++) {
            this.grades[i] = grades;
        }
    }

    public void teacherInformation() {
        super.personInformation();
        System.out.println("School: " + school);
        System.out.println("Subject:" + subject);
        System.out.println("Salary: " + salary);
    }
}
