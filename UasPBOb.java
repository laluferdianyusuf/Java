package bljr.java;

class hewan {
    protected String nafas;
    }
    class mamalia extends hewan{
        protected String reproduksi;
        protected String makan;
    }
    class reptil extends hewan {
        protected String reproduksi;
        protected String makan;
    }
    class Kambing extends mamalia {
        private String nama;
        private String jenis;
        void set(String animalia, String jenisku)
        {
            nama = animalia;
            jenis = jenisku;
        }
    
    void klasifikasi(String nafas, String reproduksi, String makan)
    {
        System.out.println ("Nama Hewan : " + nama);
        System.out.println ("Jenis Hewan : " + jenis);
        System.out.println ("Pernapasan : " + nafas);
        System.out.println ("Berkembang Biak : " + reproduksi);
        System.out.println ("Jenis Makanan : " + makan);
    }
}

class Kucing extends mamalia {
    
    private String nama;
    private String jenis;
    void set(String animalia, String jenisku)
    {
        nama = animalia;
        jenis = jenisku;
    }
    
    void klasifikasi(String nafas, String reproduksi, String makan)
    {
        System.out.println ("Nama Hewan : " + nama);
        System.out.println ("Jenis Hewan : " + jenis);
        System.out.println ("Pernapasan : " + nafas);
        System.out.println ("Berkembang Biak : " + reproduksi);
        System.out.println ("Jenis Makanan : " + makan);
    }
}
class Ular extends reptil {
    private String nama;
    private String jenis;
    void set(String animalia, String jenisku)
    {
        nama = animalia;
        jenis = jenisku;
    }
    
    void klasifikasi(String nafas, String reproduksi, String makan)
    {
        System.out.println ("Nama Hewan : " + nama);
        System.out.println ("Jenis Hewan : " + jenis);
        System.out.println ("Pernapasan : " + nafas);
        System.out.println ("Berkembang Biak : " + reproduksi);
        System.out.println ("Jenis Makanan : " + makan);
    }
}
class Buaya extends reptil {
    private String nama;
    private String jenis;
    void set(String animalia, String jenisku)
    {
        nama = animalia;
        jenis = jenisku;
    }
    void klasifikasi(String nafas, String reproduksi, String makan)
    {
        System.out.println ("Nama Hewan : " + nama);
        System.out.println ("Jenis Hewan : " + jenis);
        System.out.println ("Pernapasan : " + nafas);
        System.out.println ("Berkembang Biak : " + reproduksi);
        System.out.println ("Jenis Makanan : \n" + makan);
        System.out.println ("-------------------------------------");
    }
}
public class UasPBOb {
    public static void main(String[] args) {
    
    Kucing a = new Kucing();
    a.set("Kucing", "Mamalia");
    a.klasifikasi("Paru-paru", "Vivipar", "Omnivora\n");
    
    Kambing b = new Kambing();
    b.set("Kambing", "Mamalia");
    b.klasifikasi("Paru-paru", "Vivipar", "Herbivora\n");
    
    Ular c = new Ular();
    c.set("Ular", "Reptil");
    c.klasifikasi("Paru-paru", "Ovipar/Ovovivipar", "Karnivora\n");
    
    Buaya d = new Buaya();
    d.set("Buaya", "Reptil");
    d.klasifikasi("Paru-paru", "Ovipar", "Karnivora");
    
    }
}
   