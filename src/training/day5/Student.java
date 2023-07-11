package training.day5;

public class Student extends Person{

    private int _class;
    private int numberInClass;
    private int gradeMath;
    private int gradeHistory;
    private int gradeScience;
    private int gradePhysics;

    public Student(String name, String gender, int ID, int _class, int numberInClass, int gradeMath, int gradeHistory, int gradeScience, int gradePhysics) {
        super(name, gender, ID);
        this._class = _class;
        this.numberInClass = numberInClass;
        if(gradeMath >= 2 && gradeMath <= 6){
            this.gradeMath = gradeMath;
        }
        else{
            throw new IllegalArgumentException("Invalid value!");
        }

        if(gradeHistory >= 2 && gradeHistory <= 6){
            this.gradeHistory = gradeHistory;        }
        else{
            throw new IllegalArgumentException("Invalid value!");
        }

        if(gradeScience >= 2 && gradeScience <= 6){
            this.gradeScience = gradeScience;
        }
        else{
            throw new IllegalArgumentException("Invalid value!");
        }

        if(gradePhysics >= 2 && gradePhysics <= 6){
            this.gradePhysics = gradePhysics;
        }
        else{
            throw new IllegalArgumentException("Invalid value!");
        }
    }

    public int get_class() {
        return _class;
    }

    public int getNumberInClass() {
        return numberInClass;
    }

    public int getGradeMath() {
        return gradeMath;
    }

    public int getGradeHistory() {
        return gradeHistory;
    }

    public int getGradeScience() {
        return gradeScience;
    }

    public int getGradePhysics() {
        return gradePhysics;
    }

    public void studentInformation(){
        super.personInformation();
        System.out.println(super.getName() + " is in " + _class + "th class.");
        System.out.println(super.getName() + " is number " + numberInClass + " in class.");
        System.out.println(super.getName() + "'s grade in Math is " + gradeMath + ".");
        System.out.println(super.getName() + "'s grade in History is " + gradeHistory + ".");
        System.out.println(super.getName() + "'s grade in Science is " + gradeScience + ".");
        System.out.println(super.getName() + "'s grade in Physics is " + gradePhysics + ".");
    }

    public double averageMark(int gradeMath, int gradeHistory, int gradeScience, int gradePhysics){

        double average = (gradeMath + gradeHistory + gradeScience + gradePhysics)/2;

        return average;
    }
}
