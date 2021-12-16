package bljr.java;

class Civitas{
    protected String nama;
    protected String alamat;
    public Civitas(String namaku, String alamatku){
        super();
        nama = namaku;
        alamat = alamatku;
    }
    protected void hello(){
        System.out.println("Data Diri CIvitas Mahasiswa :");
    }
    protected void hello1(){
        System.out.println("Data Diri CIvitas Dosen :");
    }
    protected void hello2(){
        System.out.println("Data Diri CIvitas Pegawai TU :");
    }
}

class mahasiswa extends Civitas{
    private String nim;
    private String status;
    private String jk;
    public mahasiswa(String namaku, String alamatku){
        super(namaku, alamatku);
    }
    void setnim(String nimku, String statusku, String jeniskelaminku){
        nim = nimku;
        status = statusku;
        jk = jeniskelaminku;
    }
    void datadiri(){
        System.out.println("Nama : " + nama);
        System.out.println("Alamat : " + alamat);
        System.out.println("NIM : " + nim);
        System.out.println("Status : " + status);
        System.out.println("Jenis Kelamin : " + jk);
    }
}

class Dosen extends Civitas{
    private String Nip;
    private String status;
    private String jk;
    public Dosen(String namaku, String alamatku){
        super(namaku, alamatku);
    }
    void setNip(String nipku, String statusku, String jeniskelaminku){
        Nip = nipku;
        status = statusku;
        jk = jeniskelaminku;
    }
    void datadosen(){
        System.out.println("Nama : " + nama);
        System.out.println("Alamat : " + alamat);
        System.out.println("NIP : " + Nip);
        System.out.println("Status : " + status);
        System.out.println("Jenis Kelamin : " + jk);
    }
}

class PegawaiTu extends Civitas{
    private String Nip;
    private String status;
    private String jk;
    
    public PegawaiTu(String namaku, String alamatku){
        super(namaku, alamatku);
    }
    void setNipTu(String nipku, String statusku, String jeniskelaminku){
        Nip = nipku;
        status = statusku;
        jk = jeniskelaminku;
    }
    void dataTu(){
        System.out.println("Nama : " + nama);
        System.out.println("Alamat : " + alamat);
        System.out.println("NIP : " + Nip);
        System.out.println("Status : " + status);
        System.out.println("Jenis Kelamin : " + jk);
    }
}

public class UasPBO2 {
    public static void main(String[] args) {
        
        System.out.println("=-----------------------------------------------=");
        System.out.println("= PROGRAM DATA PRIBADI ANGGOTA CIVITAS AKADEMIK =");
        System.out.println("=-----------------------------------------------=");
        mahasiswa a = new mahasiswa("Lalu Ferdian Yusuf","Lombok Tengah");
        a.setnim("F1B019077","Mahasiswa","Laki Laki");
        a.hello();
        a.datadiri();
        System.out.println("=-------------------------=\n");
        
        Dosen b = new Dosen("Amri Rizan","Lombok Tengah");
        b.setNip("1112DF3456","Dosen","Laki Laki");
        b.hello1();
        b.datadosen();
        System.out.println("=-------------------------=\n");
        
        PegawaiTu c = new PegawaiTu("Wardaniah","Lombok Barat");
        c.setNipTu("445FdA6571","Tata Usaha","Perempuan");
        c.hello2();
        c.dataTu();
        System.out.println("=-----------------------------------------------=");
    }    
}