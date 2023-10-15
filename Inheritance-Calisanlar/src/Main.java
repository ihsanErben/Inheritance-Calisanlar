
public class Main {
    public static void main(String[] args){
        Yazilimci yazilimci = new Yazilimci("ihsan", "erben", 5);
        Yonetici yonetici = new Yonetici(10,"Yusuf","Dikan");
        
        yazilimci.format_at();
        yonetici.toplanti_planla();
        System.out.println();
        yazilimci.bilgiler();
        yonetici.bilgiler();
            
}
}
