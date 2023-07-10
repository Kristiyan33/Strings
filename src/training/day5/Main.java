package training.day5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Person[] people = new Person[5];

        Student student1 = new Student("Alex", "male", 3543, 7, 2, 5, 6, 4, 6);
        people[0] = student1;
        Student student2 = new Student("Gergana", "female", 6743, 7, 6, 3, 6, 5, 6);
        people[1] = student2;
        Student student3 = new Student("Kamen", "male", 9833, 7, 8, 6, 2, 4, 3);
        people[2] = student3;
        Teacher teacher1 =  new Teacher("Goshko", "male", 2442, "PGEE", "math", 3500);
        people[3] = teacher1;
        Teacher teacher2 =  new Teacher( "Qnko", "male", 5432, "PGEE", "science", 2000);
        people[4] = teacher2;
        teacher1.grades[0] = student1.gradeMath;
        teacher1.grades[1] = student2.gradeMath;
        teacher1.grades[2] = student3.gradeMath;
        teacher2.grades[0] = student1.gradeScience;
        teacher2.grades[1] = student2.gradeScience;
        teacher2.grades[2] = student3.gradeScience;

        peopleInfo(people);
        System.out.println(highestMark(people));
        System.out.println(lowestMark(people));
        System.out.println(averageSalary(people));
        averageMark(people);
        System.out.println(averageMarkForClass(people));



        //System.out.print("Enter subject to see who has the highest grades in it(math/histoy/science/physics):");
        //String subject = scanner.next();
        //System.out.print("Also enter wheter you want to see the highest result fo the subject or the lowest(highest/lowest):");
        //String lowestOrHighest = scanner.next();
        //System.out.println("The student with the highest grade in " + subject + " is " + highestMark(subject,lowestOrHighest, students));
        //System.out.println("The average salary of the theachers is " + averageSalary(teachers) + ".");
        //averageMark(students);
        //System.out.println("Enter which subject's average mark for the class you want to see:");
        //String subjectAverage = scanner.next();
        //System.out.println("The average mark of the class in " + subjectAverage + " is " + averageForSubject(subjectAverage, students) + ".");

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

    public static String highestMark(Person[] people){

        String HighestMark = ((Student) people[0]).name;

        for(int i = 1;i < people.length;i++){
            if(people[i] instanceof Student){
                if (((Student) people[i]).gradeMath > ((Student)people[i-1]).gradeMath){
                    HighestMark = ((Student) people[i]).name;
                }
            }
        }
        return HighestMark;
    }

    public static String lowestMark(Person[] people){

        String lowestMark = ((Student) people[0]).name;

        for(int i = 1;i < people.length;i++){
            if(people[i] instanceof Student){
                if (((Student) people[i]).gradeHistory < ((Student)people[i-1]).gradeHistory){
                    lowestMark = ((Student) people[i]).name;
                }
            }
        }
        return lowestMark;
    }

    public static String Marks(Student[] students){

        String HighestMark = "";
        for(int i = 1; i < students.length; i++){
            if(students[i].gradeMath > students[i-1].gradeMath){
                HighestMark = students[i].name;
            }
        }
        return HighestMark;
    }

    public static double averageMarkForClass(Person[] people){

        double averageForClass = 0;

        for(int i = 1; i < people.length; i++){
            if(people[i] instanceof Student){
                averageForClass += ((Student) people[i]).averageMark(((Student) people[i]).gradeMath, ((Student) people[i]).gradeHistory, ((Student) people[i]).gradeScience, ((Student) people[i]).gradePhysics);
            }
        }
        return (averageForClass/3);
    }

    public static double averageSalary(Person[] people) {
        int salary = 0;
        int n = 0;

        for (int i = 0; i < people.length; i++) {
            if (people[i] instanceof Teacher) {
                salary += ((Teacher) people[i]).salary;
                n += 1;
            }
        }

        return (salary / 2);
    }

    public static void averageMark(Person[] people){

        double mark = 0;

        for(int i = 0; i < people.length; i++){
            if(people[i] instanceof Student){
                mark = ((Student) people[i]).gradeMath + ((Student) people[i]).gradeHistory +((Student) people[i]).gradeScience +((Student) people[i]).gradePhysics;
                System.out.println(((Student) people[i]).name + " average mark is " + (mark/4));
            }
            mark = 0;
        }
    }

    public static double averageForSubject(String subject, Student[] students){
        int averageForSubject = 0;
        switch(subject){
            case "math":
                for(int i = 0; i < students.length; i++){
                    averageForSubject += students[i].gradeMath;
                }
            case "history":
                for(int i = 0; i < students.length; i++){
                    averageForSubject += students[i].gradeHistory;
                }
            case "science":
                for(int i = 0; i < students.length; i++){
                    averageForSubject += students[i].gradeScience;
                }
            case "physics":
                for(int i = 0; i < students.length; i++){
                    averageForSubject += students[i].gradePhysics;
                }
        }

        return (averageForSubject/ students.length);
    }

    public void teacherHighestMarks(Teacher[] teachers, Student[] students){

    }
}
