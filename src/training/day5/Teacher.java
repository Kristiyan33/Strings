package training.day5;

public class Teacher extends Person{

    String school;
    String subject;
    int salary;
    int[] grades = new int[3];

    public Teacher(String name, String gender, int ID, String school, String subject, int salary) {
        super(name, gender, ID);
        this.school = school;
        this.subject = subject;
        this.salary = salary;
    }



    public void teacherInformation(){
        super.personInformation();
        System.out.println(super.name + " is teaching in " + school);
        System.out.println(super.name + " is " + subject + " teacher.");
        System.out.println(super.name + "'s salary is " + salary);
    }
}
