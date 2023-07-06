package training.day4;

public class Homework4 {
    public static void main(String[] args){

        Vehicle AudiA4 = new Vehicle(20, 150 );
        AudiA4.drive(200);

        Car GolfMk2 = new Car(25, 250 );
        GolfMk2.drive(300);

        RaceMotorcycle HondaCBR = new RaceMotorcycle(15, 180 );
        HondaCBR.drive(250);

        SportsCar KoeningseggJesko = new SportsCar(70, 1280 );
        KoeningseggJesko.drive(400);

    }
}
