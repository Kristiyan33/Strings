package training.day5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter how many students you want to have: ");
        int nStudents = scanner.nextInt();
        Student[] students = new Student[nStudents];
        System.out.print("Creating students...");
        creatingStudents(nStudents, students);

        System.out.print("Enter how many teachers you want to have: ");
        int nTeachers = scanner.nextInt();
        Teacher[] teachers = new Teacher[nTeachers];
        System.out.print("Creating teachers...");
        creatingTeachers(nTeachers, teachers);

        System.out.println("This is the information we have about the sudents and the teachers.");
        System.out.println("STUDENTS");
        studentsInfo(students);
        System.out.println("TEACHERS");
        teahcersInfo(teachers);

        System.out.print("Enter subject to see who has the highest grades in it(math/histoy/science/physics):");
        String subject = scanner.next();
        System.out.print("Also enter wheter you want to see the highest result fo the subject or the lowest(highest/lowest):");
        String lowestOrHighest = scanner.next();
        System.out.println("The student with the highest grade in " + subject + " is " + highestMark(subject,lowestOrHighest, students));
        System.out.println("The average salary of the theachers is " + averageSalary(teachers) + ".");
        averageMark(students);
        System.out.println("Enter which subject's average mark for the class you want to see:");
        String subjectAverage = scanner.next();
        System.out.println("The average mark of the class in " + subjectAverage + " is " + averageForSubject(subjectAverage, students) + ".");



        // if (gender == "f" || gender == "F" || gender == "m" || gender == "M") {
        //            this.gender = gender;
        //        }
        //        else
        //        {
        //            throw new IllegalArgumentException("Wrong credetentials!");
        //        }
    }

    public static void creatingStudents(int n, Student[] students){

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < students.length; i++){
            System.out.println("Enter name: ");
            String name = scanner.next();
            System.out.println("Enter gender(m or f): ");
            String gender = scanner.next();
            System.out.println("Enter ID number: ");
            int id = scanner.nextInt();
            System.out.println("Enter in which class the student is: ");
            int _class = scanner.nextInt();
            System.out.println("Enter his number in clas: ");
            int numberInClass = scanner.nextInt();
            System.out.println("Enter his Math grade: ");
            int gradeMath = scanner.nextInt();
            System.out.println("Enter his History grade: ");
            int gradeHistory = scanner.nextInt();
            System.out.println("Enter his Science grade: ");
            int gradeScience = scanner.nextInt();
            System.out.println("Enter his Physics grade: ");
            int gradePhysics = scanner.nextInt();

            students[i] = new Student(name, gender, id, _class, numberInClass, gradeMath, gradeHistory, gradeScience, gradePhysics);
        }
    }

    public static void creatingTeachers(int n, Teacher[] teachers){

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < teachers.length; i++){
            System.out.println("Enter name: ");
            String name = scanner.next();
            System.out.println("Enter gender(m or f): ");
            String gender = scanner.next();
            System.out.println("Enter ID number: ");
            int id = scanner.nextInt();
            System.out.println("Enter in which school the teacher works: ");
            String school = scanner.next();
            System.out.println("Enter in which subject he teaches: ");
            String subject = scanner.next();
            System.out.println("Enter his salary: ");
            int salary = scanner.nextInt();

            teachers[i] = new Teacher(name, gender, id, school, subject, salary);
        }
    }

    public static void studentsInfo(Student[] students){
        for(int i = 0; i < students.length; i++){
            students[i].studentInformation();
        }
    }

    public static void teahcersInfo(Teacher[] teachers){
        for(int i = 0; i < teachers.length; i++){
            teachers[i].teacherInformation();
        }
    }

    public static String highestMark(String subject, String lowestOrHighest, Student[] students){

        String HighestMark = "";

        switch(lowestOrHighest){
            case "highest":
                switch(subject) {
                    case "math":
                        return Marks(students);
                    case "history":
                        return Marks(students);
                    case "physics":
                        return Marks(students);
                    case "science":
                        return Marks(students);
                }
            case "lowest":
                switch(subject){
                    case "math":
                        return lMarks(students);
                    case "history":
                        return lMarks(students);
                    case "physics":
                        return lMarks(students);
                    case "science":
                        return lMarks(students);
                }
        }

        return "Invalid Inputs!";
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

    public static String lMarks(Student[] students){

        String LowestMark = "";
        for(int i = 1; i < students.length; i++){
            if(students[i].gradeMath < students[i-1].gradeMath){
                LowestMark = students[i].name;
            }
        }
        return LowestMark;
    }

    public static int averageSalary(Teacher[] teachers){
        int salary = 0;

        for(int i = 0; i < teachers.length; i++){
            salary += teachers[i].salary;
        }

        return salary/ teachers.length;
    }

    public static void averageMark(Student[] students){

           for(int i = 0; i < students.length; i++){
               System.out.println("The average mark of " + students[i].name + " is " + students[i].averageMark(students[i].gradeMath, students[i].gradeHistory, students[i].gradeScience, students[i].gradePhysics));
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

        return averageForSubject/ students.length;
    }
}
