package demo.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "sailor")
public class Sailor {
    private int sailorid;
    private String name;
    private String surname;
    private String phone;
    private String nationality;
    private String email;
//    private int roles;
    private String password;
    private int saillingExperience;
    private String moreInformation;


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "sailorid")
    public int getSailorid() {
        return sailorid;
    }

    public void setSailorid(int sailorid) {
        this.sailorid = sailorid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getSaillingExperience() {
        return saillingExperience;
    }

    public void setSaillingExperience(int saillingExperience) {
        this.saillingExperience = saillingExperience;
    }

    public String getMoreInformation() {
        return moreInformation;
    }

    public void setMoreInformation(String moreInformation) {
        this.moreInformation = moreInformation;
    }
}
