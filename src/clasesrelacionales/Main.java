package clasesrelacionales;

public class Main {
     public static void main(String[] args) {
        Motor motor=new Motor(1500);
        Car nuevoAuto=new Car("Wolksvagen",2022,motor);
        nuevoAuto.caracteristicas();
    }
}
