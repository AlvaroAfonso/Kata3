package kata3;

public class Main {
    
    public static void main(String[] args) {
        Histogram<String> histo = new Histogram();
        
        histo.increment("ulpgc.com");
        histo.increment("dis.ulpgc.com");
        histo.increment("ull.com");
        histo.increment("amazon.com");
        histo.increment("ull.com");
        histo.increment("ulpgc.com");

        
        new HistogramDisplay(histo).execute();
    }
    
}
