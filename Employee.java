public class Employee {
    String nama;
    double  salary;

//Constructor //
public Employee(){
    nama = "";
    salary =0;
}

/*Constructor Parameter */
public Employee(String nama, double salary) {
    this.nama = nama;
    this.salary = salary;
}

//Getter-->mendapatkan nilai-->tipe data

public String getNama() {
    return nama;
}
public double getSalary() {
    return salary;
}
//Setter-->mengubah nilai-->void
public void setNama(String nama) {
    this.nama = nama;
}
public void setSalary(Double salary) {
    this.salary= salary;
}
//method tdk menghasilkan value
public void print() {
    System.out.println("Nama: " + nama);
    System.out.println("Salary : " + salary);
}
}