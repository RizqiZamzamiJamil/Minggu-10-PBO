package rizqi.abstractClass;

public class Kucing extends Hewan{
    @Override
    public void bergerak(){
        System.out.println("Berjalan dengan KAKI, \"Tap..tap..\"");
    }
    public void suara(){
        System.out.println("Suara kucing meowww...meooww");
    }
}
