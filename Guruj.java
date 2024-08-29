//Objek Class
public class Guruj{
    int id;
    String nama;
    String mapel;
    String alamat;

    
 //Constructor nama dng Class//
    public Guruj(){
        id = 0;
        nama = "";
        mapel ="";
        alamat = "";
    }

//Constructor Parameter
public Guruj(int id, String nama, String alamat, String mapel){
    this.id = id;
    this.nama = nama;
    this.alamat =alamat;
    this.mapel =mapel; 
    }
//Getter-->mendapatkan nilai-->tipe data
public int getId() {
    return id;
}
public String getNama() {
    return nama;
}
public String getAlamat() {
    return alamat;
}
public String getMapel() {
    return mapel;
}
//Setter-->mengubah nilai-->void
public void setId(int id) {
    this.id = id;
}
public void setNama(String nama) {
    this.nama = nama;
}
public void setAlamat(String alamat) {
    this.alamat = alamat;
}
public void setMapel(String mapel) {
    this.mapel = mapel;
}
 //method tdk menghasilkan value
 public void print() {
    System.out.println("ID : " + id);
    System.out.println("Nama : " + nama);
    System.out.println("Alamat: " + alamat);
    System.out.println("Mapel: " + mapel);
}

//method yang menghasilkan value
public String print2() {
    return "ID : " + id
    + "\nNama : " + nama
    + "\nAlamat: " + alamat
    + "\nMapel: " + mapel;
}

}