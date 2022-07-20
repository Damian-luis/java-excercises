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
        List<Integer> years=new ArrayList<>();
        for(int i=0;i<=2022;i++){
            years.add(i);
        }
        for(Integer year:years){
            System.out.println(year);
        }
    }
}
