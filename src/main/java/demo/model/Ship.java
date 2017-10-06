package demo.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "ship")
public class Ship {

    private int shipid;
    private String shipname;
    private String flag;
    private int year;
    private int speed;
    private int length;
    private int crew;
    private int freeCrewSpace;
    private String location;
    private String shipClass;
//    private Captain captain;
    private List<Crewseeker> crewseekerList;


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "shipid")
    public int getShipid() {
        return shipid;
    }

    public void setShipid(int shipid) {
        this.shipid = shipid;
    }

    public String getShipname() {
        return shipname;
    }

    public void setShipname(String shipname) {
        this.shipname = shipname;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getCrew() {
        return crew;
    }

    public void setCrew(int crew) {
        this.crew = crew;
    }

    public int getFreeCrewSpace() {
        return freeCrewSpace;
    }

    public void setFreeCrewSpace(int freeCrewSpace) {
        this.freeCrewSpace = freeCrewSpace;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getShipClass() {
        return shipClass;
    }

    public void setShipClass(String shipClass) {
        this.shipClass = shipClass;
    }


//    public Captain getCaptain() {
//        return captain;
//    }
//
//    public void setCaptain(Captain captain) {
//        this.captain = captain;
//    }

    @OneToMany(mappedBy = "ship")
    public List<Crewseeker> getCrewseekerList() {
        return crewseekerList;
    }

    public void setCrewseekerList(List<Crewseeker> crewseekerList) {
        this.crewseekerList = crewseekerList;
    }
}
