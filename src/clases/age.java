package clases;

public class age extends person{
    Integer age;

    public age(String name, Integer age) {
        super(name);
        this.age = age;
    }
    public void decir(){
        System.out.println("nombre "+this.name+" edad "+this.age);
    }
}
