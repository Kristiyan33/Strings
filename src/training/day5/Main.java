package training.day5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Person[] people = new Person[5];
        // int nSudents' value should equal the number of students.
        // It could also be used to write how many students you want to have in more advanced version of the code;
        int nStudents = 3;

        Student student1 = new Student("Alex", "male", 3543, 7, 2, 5, 6, 4, 4);
        people[0] = student1;
        Student student2 = new Student("Gergana", "female", 6743, 7, 6, 6, 2, 3, 2);
        people[1] = student2;
        Student student3 = new Student("Kamen", "male", 9833, 7, 8, 6, 2, 4, 3);
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
        System.out.println(highestGrade(people));
        System.out.println(lowestGrade(people));
        System.out.println(averageSalary(people));
        averageGrade(people);
        System.out.println(averageGradeForClass(people));
        // the method below may return null and this would be because as example I had initialized only two teachers,
        // but there are four subjects, so for example if the history teacher is the one giving the highest grades,
        // he is not initiliazed yet, so the method will return null.
        // Otherwise the method is working fine.
        TeacherSingingHighestGrade(people, nStudents);

    }
    public static void peopleInfo(Person[] people){
        for(int i = 0; i < people.length; i++){
            if(people[i] instanceof Student){
                ((Student) people[i]).studentInformation();
            }
            else if(people[i] instanceof Teacher){
                ((Teacher) people[i]).teacherInformation();
            }
        }
    }

    public static String highestGrade(Person[] people){

        String HighestGrade = people[0].getName();

        for(int i = 1;i < people.length;i++){
            if(people[i] instanceof Student){
                if (((Student) people[i]).getGradeMath() > ((Student)people[i-1]).getGradeMath()){
                    HighestGrade = people[i].getName();
                }
            }
        }
        return HighestGrade;
    }

    public static String lowestGrade(Person[] people){

        String lowestGrade = people[0].getName();

        for(int i = 1;i < people.length;i++){
            if(people[i] instanceof Student){
                if (((Student) people[i]).getGradeHistory() < ((Student)people[i-1]).getGradeHistory()){
                    lowestGrade = people[i].getName();
                }
            }
        }
        return lowestGrade;
    }

    public static double averageGradeForClass(Person[] people){

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

    public static void averageGrade(Person[] people){

        double averageGrade = 0;

        for(int i = 0; i < people.length; i++){
            if(people[i] instanceof Student){
                averageGrade = ((Student) people[i]).getGradeMath() + ((Student) people[i]).getGradeHistory() +((Student) people[i]).getGradeScience() +((Student) people[i]).getGradePhysics();
                System.out.println(people[i].getName() + " average mark is " + (averageGrade/4));
            }
            averageGrade = 0;
        }
    }

    public static void TeacherSingingHighestGrade(Person[] people,int n){


        int averageForMath = 0;
        int averageForHistory = 0;
        int averageForScience = 0;
        int averageForPhysics = 0;

                for(int i = 0; i < people.length; i++) {
                    if(people[i] instanceof Student){

                        averageForMath += ((Student) people[i]).getGradeMath() ;
                    }
                }
                averageForMath = averageForMath/n;

                for(int i = 0; i < people.length; i++){
                    if(people[i] instanceof Student){

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
                    if(people[i] instanceof Student){

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

    public static String findingTeachersBySubject(Person[] people, String subject){

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
