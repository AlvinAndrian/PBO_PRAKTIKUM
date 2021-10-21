class Mahasiswa { 
    private String nama; 
    private int nomorNIM; 
    private Jurusan jurusan; 
    
    public Mahasiswa(String nama, int nomorNIM){ 
        this.nama = nama; 
        this.nomorNIM = nomorNIM; 
        jurusan = null; 
    } 
    public String getNama() {
        return nama; 
    } 
    
    public void setNama(String nama) {
        this.nama = nama; 
    } 
    
    public int getNomorNIM() { 
        return nomorNIM; 
    } 
    
    public void setNomorID(int nomorNIM) { 
        this.nomorNIM = nomorNIM; 
    } 
    
    public void setJurusan(Jurusan jurusan) { 
        this.jurusan = jurusan; 
    } 
}

class Jurusan {
    String namaJurusan; 
    private Mahasiswa mahasiswa;  
    
    public Jurusan(String namaJurusan){ 
        this.namaJurusan = namaJurusan; 
        mahasiswa = null; 
    } 
    public void setMahasiswa(Mahasiswa mahasiswa) { 
        this.mahasiswa = mahasiswa; 
    } 
    
    public String getNamaJurusan() { 
        return namaJurusan; 
    } 
    
    public void setNamaJurusan(String namaJurusan) { 
        this.namaJurusan = namaJurusan; 
    } 
}

public class Asosiasi { 
    public static void main(String args []){ 
        Mahasiswa mahasiswa = new Mahasiswa("Alvin", 201511003); 
        Jurusan jurusan = new Jurusan("Teknik Komputer dan Informatika"); 
        jurusan.setMahasiswa(mahasiswa); 
        mahasiswa.setJurusan(jurusan); 
        System.out.print("Nama: " + mahasiswa.getNama() +"\n"+ "NIM: " + mahasiswa.getNomorNIM() +"\n" + 
                "Jurusan: " + jurusan.getNamaJurusan()); 
    } 
}