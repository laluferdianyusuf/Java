package bljr.java;

class hitungluas{
    float luas(){
        System.out.println("MENGHITUNG LUAS PADA SEBUAH BANGUN DATAR :");
        System.out.println("1. Luas Persegi");
        System.out.println("2. Luas Segitiga");
        System.out.println("3. Luas Lingkaran");
        return 0;
    }
}
class persegi extends hitungluas{
    int sisi;
    public persegi(int s){
        sisi = s;
    }
    //Overriding
    public float luas(){
        float luas_persegi = sisi*sisi;
        return luas_persegi;
    }
}
class segitiga extends hitungluas{
    int alas;
    int tinggi;
    public segitiga(int a, int t){
        alas = a;
        tinggi = t;
    }
    //Overriding
    public float luas(){
        float luas_segitiga = (alas * tinggi) / 2;
        return luas_segitiga;
    }
}
class lingkaran extends hitungluas{
    double pb;
    double phi;
    float r;
    double d;
    public lingkaran(double pi, float jarijari){
        phi = pi;
        r = jarijari;
    }
    public lingkaran(double pembagi, double pi, double diameter){
        pb = pembagi;
        phi = pi;
        d = diameter;
    }
    //Overloading
    // menghitung luas lingkaran dengan jari-jari
    public float luas(double pi, float jarijari){ 
        float luas_lingkaranRj = (float) (phi * jarijari * jarijari);
        return luas_lingkaranRj;
    }
    //Overloading
    // menghitung luas lingkaran dengan diameter
    public float luas(double pembagi, double pi, double diameter){ 
        float luas_lingkaranDm = (float)(pb*phi* diameter * diameter);
        return luas_lingkaranDm;
    }
}
public class UasPBOa {
    public static void main(String[] args) {
        System.out.println("=----------------------------------------=");
        hitungluas ls = new hitungluas();
        ls.luas();
        System.out.println("=----------------=");
        persegi a = new persegi(7);
        float hasil_persegi = a.luas();
        System.out.println("Luas Persegi  : " + hasil_persegi);
                
        segitiga b = new segitiga(9,7);
        float hasil_segitiga = b.luas();
        System.out.println("Luas Segitiga : " + hasil_segitiga);
        
        lingkaran c = new lingkaran(3.14,7);
        float hasil_lingkaranR = c.luas(3.14,7);
        System.out.println("Luas lingkaran Dengan Jari-Jari : " + hasil_lingkaranR);
        
        lingkaran d = new lingkaran(0.25,3.14,7);
        float hasil_lingkaranD = d.luas(0.25,3.14,7);
        System.out.println("Luas Lingkaran Dengan Diameter  : " + hasil_lingkaranD);
        System.out.println("=---------------------------------------=");
    }
}