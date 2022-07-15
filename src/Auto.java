public class Auto {
    String nombre;
    Integer anio;


    @Override
    public String toString() {
        return "Auto{" +
                "nombre='" + nombre + '\'' +
                ", anio=" + anio +

                '}';
    }

    public Auto(String nombre, Integer anio){
        this.nombre=nombre;
        this.anio=anio;

    }
    public void decir(String nombre){
        System.out.println(nombre);
    }
}
