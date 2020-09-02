
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Kumanda kumanda = new Kumanda();
        
        System.out.println("Kumanda Programına Hoşgeldiniz...");
        Scanner scanner = new Scanner(System.in);
        
        String islemler = "İşlemler...\n"
                        + "1. Kanalları göster\n"
                        + "2. Kanal ekle\n"
                        + "3. Kanal sil\n"
                        + "4. Kanal sayısını öğren\n"
                        + "Çıkış için : q";
        
        while(true){
            System.out.println(islemler);
            System.out.print("İşlemi giriniz : ");
            String islem = scanner.nextLine();
            
            if(islem.equals("q")){
                System.out.println("Programdan çıkılıyor...");
                break;
            }
            else if(islem.equals("1")){
                kanallariGoster(kumanda);
            }
            else if(islem.equals("2")){
                System.out.print("Eklenecek kanal : ");
                String kanal_ismi = scanner.nextLine();
                
                kumanda.kanalEkle(kanal_ismi);
            }
            else if(islem.equals("3")){
                System.out.print("Silinecek kanal : ");
                String kanal_ismi = scanner.nextLine();
                
                kumanda.kanalSil(kanal_ismi);
            }
            else if(islem.equals("4")){
                System.out.println("Bulunan kanal sayısı : " + kumanda.kanalSayisi());
            }
            else{
                System.out.println("Geçersiz işlem...");
            }
        }
    }
    public static void kanallariGoster(Kumanda kumanda){
        
        if(kumanda.kanalSayisi() == 0){
            System.out.println("************************");
            System.out.println("Şu anda hiçbir kanal bulunmuyor...");
            System.out.println("************************");
        }
        else{
            for(String kanal : kumanda){
                System.out.println("Kanal : " + kanal);
                System.out.println("************************"); 
            }
        }
    }
}
