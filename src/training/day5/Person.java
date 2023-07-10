package training.day5;

public class Person {
    String name;
    String gender;
    int ID;

    public Person(String name, String gender, int ID){
        this.name = name;
        this.gender = gender;
        this.ID = ID;
    }

    public void personInformation(){
        System.out.println("The name of the person is " + name);
        System.out.println("He is a " + gender + ".");
        System.out.println("His ID is " + ID);
    }
}
