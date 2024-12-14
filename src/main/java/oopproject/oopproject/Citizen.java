package oopproject.oopproject;
import java.time.LocalDate;

public class Citizen {
    private String name;
    private LocalDate dob;
    private String address;

    public Citizen(String name, LocalDate dob, String address) {
        this.name = name;
        this.dob = dob;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Citizen{" +
                "name='" + name + '\'' +
                ", dob=" + dob +
                ", address='" + address + '\'' +
                '}';
    }
}
