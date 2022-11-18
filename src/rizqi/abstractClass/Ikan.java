package rizqi.abstractClass;

public class Ikan extends Hewan{
    @Override
    public void bergerak(){
        System.out.println("Berenang dengan SIRIP, \"wush..wush..\"");
    }
    
    public void makan(){
        System.out.println("Ikan makan makanan Takari");
    }
}
