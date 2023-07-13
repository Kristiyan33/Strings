package training.day5;

public class Person {
    private String name;
    private String gender;
    private int ID;

    public Person(String name, String gender, int ID) {
        this.name = name;
        this.gender = gender;
        this.ID = ID;
    }

    public void personInformation() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("ID: " + ID);
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getID() {
        return ID;
    }
}
