
import java.util.ArrayList;
import java.util.Iterator;


public class Kumanda implements Iterable<String> {
    private ArrayList<String> kanallar = new ArrayList<String>();
    
    public class KumandaIterator implements Iterator<String>{
        private int index = 0;
        @Override
        public boolean hasNext() {
            
            if(index >= kanallar.size()){
                return false;
            }
            else{
                return true;
            }
        }

        @Override
        public String next() {
            String kanal = kanallar.get(index);
            index++;
            
            return kanal;   
            
        }
    
}
        public void kanalEkle(String kanal){
           if(kanallar.contains(kanal)){
               System.out.println("Bu kanal listede bulunuyor...");
               System.out.println("************************");
           }
           else{
               kanallar.add(kanal);
               System.out.println("************************");
           }
           
            
        }
        public void kanalSil(String kanal){
            if(kanallar.contains(kanal)){
            kanallar.remove(kanal);
            System.out.println("************************"); 
            
        }
            else{
                System.out.println("Böyle bir kanal bulunmuyor...");
                System.out.println("************************"); 
            }
    }
        
        public int kanalSayisi(){
        System.out.println("************************"); 
        return kanallar.size();
        
    }

    @Override
    public Iterator<String> iterator() {
        return new KumandaIterator();
    }
}

