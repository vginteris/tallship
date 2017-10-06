package demo.model;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "captain")
public class Captain {

    private int captainid;
    private String name;
    private String surname;
    private String phone;
    private String nationality;
    private String email;
    private String password;
    private int saillingExperience;
    private Ship ship;
//    private List<Crewseeker> crewseekerList;



    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "captainid")
    public int getCaptainid() {
        return captainid;
    }

    public void setCaptainid(int captainid) {
        this.captainid = captainid;
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

    @OneToOne
    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }
//    @OneToMany
//    public List<Crewseeker> getCrewseekerList() {
//        return crewseekerList;
//    }
//
//    public void setCrewseekerList(List<Crewseeker> crewseekerList) {
//        this.crewseekerList = crewseekerList;
//    }
}
