public class Attribute extends Friend{
    String attribute;
    Integer money;
    Attribute(String name,String attribute,Integer money){
        super(name);
        this.attribute=attribute;
        this.money=money;

    }
    public void add(){
        System.out.println("You got a new friend named "+this.name+" he/she is "+this.attribute+" and has "+this.money+" bucks");
    }
}
