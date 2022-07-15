import java.util.Scanner;

public class input {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Escriba su nombre por favor");
        String name=scanner.nextLine();

        System.out.println("por favor escriba su edad");
        int age=scanner.nextInt();
        System.out.println("tu nombre es "+name+" y tienes "+age);
    }
}
