package oopproject.oopproject;

import java.time.LocalDate;

public class Applicant {
    private String applicationNumber;
    private String name;
    private LocalDate dob;

    public String getApplicationNumber() {
        return applicationNumber;
    }

    public void setApplicationNumber(String applicationNumber) {
        this.applicationNumber = applicationNumber;
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

    public Applicant(String applicationNumber, String name, LocalDate dob) {
        this.applicationNumber = applicationNumber;
        this.name = name;
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Applicant{" +
                "applicationNumber='" + applicationNumber + '\'' +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                '}';
    }
}
