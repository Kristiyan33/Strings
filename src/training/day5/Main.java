package training.day5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Person[] people = new Person[5];
        int nStudents = 3;

        Student student1 = new Student("Alex", "male", 3543, 7, 2, 3, 6, 4, 4);
        people[0] = student1;
        Student student2 = new Student("Gergana", "female", 6743, 7, 6, 6, 2, 5, 2);
        people[1] = student2;
        Student student3 = new Student("Kamen", "male", 9833, 7, 8, 6, 5, 5, 5);
        people[2] = student3;
        Teacher teacher1 =  new Teacher("Goshko", "male", 2442, "PGEE", "math", 3500);
        people[3] = teacher1;
        Teacher teacher2 =  new Teacher( "Qnko", "male", 5432, "PGEE", "science", 2000);
        people[4] = teacher2;
        teacher1.setGrades(student1.getGradeMath());
        teacher1.setGrades(student2.getGradeMath());
        teacher1.setGrades(student3.getGradeMath());
        teacher2.setGrades(student1.getGradeScience());
        teacher2.setGrades(student2.getGradeScience());
        teacher2.setGrades(student3.getGradeScience());

        peopleInfo(people);
        highestGrade(people);
        lowestGrade(people);
        System.out.println("====AVERAGE GRADES OF THE STUDENTS====");
        averageGrade(people);
        System.out.println("====OTHER STATISTICS====");
        System.out.println("The average salary of the teachers is " + averageSalary(people) + ".");
        System.out.println("The average grade of the class is " + df.format(averageGradeForClass(people)) + ".");
        averageGrade(people);
        SubjectHighestGrade(people);
        TeacherSingingHighestGrade(people, nStudents);

    }
    public static void peopleInfo(Person[] people) {

        for(int i = 0; i < people.length; i++){

            System.out.println("=======");

            if(people[i] instanceof Student){
                ((Student) people[i]).studentInformation();
            }
            else if(people[i] instanceof Teacher){
                ((Teacher) people[i]).teacherInformation();
            }
        }
    }

    public static void highestGrade(Person[] people) {

        String HighestGrade = people[0].getName();

        System.out.println("===HIGHEST GRADES===");

        for(int i = 1; i < people.length; i++){
            if(people[i] instanceof Student){
                    if (((Student) people[i]).getGradeMath() > ((Student)people[i-1]).getGradeMath()){
                        System.out.println("The student with the highest grade in Math is " + people[i].getName() + ".");
                    }
                    if (((Student) people[i]).getGradeHistory() > ((Student)people[i-1]).getGradeHistory()){
                        System.out.println("The student with the highest grade in History is " + people[i].getName() + ".");
                    }
                    if (((Student) people[i]).getGradeScience() > ((Student)people[i-1]).getGradeScience()){
                        System.out.println("The student with the highest grade in Science is " + people[i].getName() + ".");
                    }
                    if (((Student) people[i]).getGradePhysics() > ((Student)people[i-1]).getGradePhysics()){
                        System.out.println("The student with the highest grade in Physics is " + people[i].getName() + ".");
                    }

            }
        }
    }

    public static void lowestGrade(Person[] people) {

        System.out.println("===LOWEST GRADES===");

        String lowestGrade = people[0].getName();

        for(int i = 1; i < people.length; i++){
            if(people[i] instanceof Student){
                    if (((Student) people[i]).getGradeMath() < ((Student)people[i-1]).getGradeMath()){
                        System.out.println("The student with the lowest grade in Math is " + people[i].getName() + ".");
                    }
                    if (((Student) people[i]).getGradeHistory() < ((Student)people[i-1]).getGradeHistory()){
                        System.out.println("The student with the lowest grade in History is " + people[i].getName() + ".");
                    }
                    if (((Student) people[i]).getGradeScience() < ((Student)people[i-1]).getGradeScience()){
                        System.out.println("The student with the lowest grade in Science is " + people[i].getName() + ".");
                    }
                    if (((Student) people[i]).getGradePhysics() < ((Student)people[i-1]).getGradePhysics()){
                        System.out.println("The student with the lowest grade in Physics is " + people[i].getName() + ".");
                    }

            }
        }
    }

    public static double averageGradeForClass(Person[] people) {

        double averageForClass = 0;

        for(int i = 1; i < people.length; i++){
            if(people[i] instanceof Student){
                averageForClass += ((Student) people[i]).averageMark(((Student) people[i]).getGradeMath(), ((Student) people[i]).getGradeHistory(), ((Student) people[i]).getGradeScience(), ((Student) people[i]).getGradePhysics());
            }
        }
        return (averageForClass/3);
    }

    public static double averageSalary(Person[] people) {
        int salary = 0;
        int n = 0;

        for (int i = 0; i < people.length; i++) {
            if (people[i] instanceof Teacher) {
                salary += ((Teacher) people[i]).getSalary();
                n += 1;
            }
        }

        return (salary / 2);
    }

    public static void TeacherSingingHighestGrade(Person[] people,int n) {


        int averageForMath = 0;
        int averageForHistory = 0;
        int averageForScience = 0;
        int averageForPhysics = 0;

                for(int i = 0; i < people.length; i++) {
                    if(people[i] instanceof Student) {

                        averageForMath += ((Student) people[i]).getGradeMath() ;
                    }
                }
                averageForMath = averageForMath/n;

                for(int i = 0; i < people.length; i++) {
                    if(people[i] instanceof Student) {

                        averageForHistory += ((Student) people[i]).getGradeHistory() ;
                    }
                }
                averageForHistory = averageForHistory/n;

                for(int i = 0; i < people.length; i++){
                    if(people[i] instanceof Student){

                        averageForScience += ((Student) people[i]).getGradeScience() ;
                    }
                }
                averageForScience = averageForScience/n;

                for(int i = 0; i < people.length; i++) {
                    if(people[i] instanceof Student) {

                        averageForPhysics += ((Student) people[i]).getGradePhysics() ;
                    }
                }
                averageForPhysics = averageForPhysics/n;

                String bestTeacher = " ";

                if(averageForMath > averageForHistory && averageForMath > averageForScience && averageForMath > averageForPhysics) {
                    bestTeacher = findingTeachersBySubject(people, "math");
                }
                if(averageForHistory > averageForMath && averageForHistory > averageForScience && averageForHistory > averageForPhysics){
                    bestTeacher = findingTeachersBySubject(people, "history");
                }
                if(averageForScience > averageForMath && averageForScience > averageForHistory && averageForScience > averageForPhysics){
                    bestTeacher = findingTeachersBySubject(people, "science");
                }
                if(averageForPhysics > averageForMath && averageForPhysics > averageForHistory && averageForPhysics > averageForScience){
                    bestTeacher = findingTeachersBySubject(people, "physics");
                }

                System.out.println("The teacher giving highest grades is " + bestTeacher + ".");

    }

    public static void averageGrade(Person[] people) {
        for(int i = 0; i < people.length; i++){
            if(people[i] instanceof Student){
                System.out.println(((Student) people[i]).getName() + "'s average grade is " + ((Student) people[i]).averageGrade() + "." );

            }
        }
    }

    public static void SubjectHighestGrade(Person[] people) {
        for(int i = 0; i < people.length; i++) {
            if(people[i] instanceof Student) {
                System.out.print(people[i].getName());
                ((Student) people[i]).highestGrade();
            }
        }
    }

    public static String findingTeachersBySubject(Person[] people, String subject) {

        for(int i = 0; i < people.length; i++) {
            if(people[i] instanceof Teacher){
                if( ((Teacher) people[i]).getSubject() == subject){
                    return people[i].getName();
                    }
            }
        }
        return null;
    }
}
