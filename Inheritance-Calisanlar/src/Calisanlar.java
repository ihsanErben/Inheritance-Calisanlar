
public class Calisanlar {
    private String isim;
    private String soyisim;

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public Calisanlar(String isim, String soyisim) {
        this.isim = isim;
        this.soyisim = soyisim;
    }
    
    public void bilgiler(){
    System.out.println("isim: " + isim);
    System.out.println("soyisim: " + soyisim);
    }
}
