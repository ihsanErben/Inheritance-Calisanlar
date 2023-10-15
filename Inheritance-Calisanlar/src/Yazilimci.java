
public class Yazilimci extends Calisanlar{
private int diller;

    public Yazilimci(String isim, String soyisim, int diller) {
        super(isim, soyisim);
        this.diller = diller;
    }
    
    public void format_at(){
    System.out.println(getIsim() + " " + getSoyisim() + ", Yazilimci format atiyor.");
    }
    
    public void bilgiler(){
    super.bilgiler();
    System.out.println("diller: " + diller);
    }
}
