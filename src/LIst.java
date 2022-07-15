import java.util.ArrayList;
import java.util.List;

public class LIst {
    public static void main(String [] args){
        List <String> nombres = new ArrayList<>();
        nombres.add("damian");
        nombres.add("duran");
        System.out.println(nombres);
        for (String nombrecito: nombres){
            System.out.println(nombrecito);
        }
    }
}
