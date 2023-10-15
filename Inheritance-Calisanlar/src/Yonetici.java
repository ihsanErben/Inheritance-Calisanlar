
public class Yonetici extends Calisanlar{
    private int calisan_sayisi;

    public Yonetici(int calisan_sayisi, String isim, String soyisim) {
        super(isim, soyisim);
        this.calisan_sayisi = calisan_sayisi;
    }
    
    public void toplanti_planla(){
    System.out.println(getIsim() + " " + getSoyisim() + ", yonetici toplanti planladi.");     
    }
    
    public void bilgiler(){
        
        super.bilgiler();
        System.out.println("calisan sayisi: " + calisan_sayisi);
    }
    
}
