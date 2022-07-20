package clasesrelacionales;

public class Car {
    String name;
    Integer year;

    Motor motor;


    public Car(String name, Integer year,Motor motor) {
        this.name = name;
        this.year = year;
        this.motor=motor;
    }
    public void caracteristicas(){
        System.out.println("Nombre "+this.name+" ,año  "+this.year+" ,modelo "+this.motor);
    }
}
