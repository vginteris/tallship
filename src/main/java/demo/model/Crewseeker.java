package demo.model;

import javax.persistence.*;

@Entity
@Table(name = "crewseeker")
public class Crewseeker {
    private int crewid;
    private String title;
    private String requirements;
    private String offers;
    private int period;
    private int price;
    //    private Captain captain;
    private Ship ship;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "crewid")
    public int getId() {
        return crewid;
    }

    public void setId(int crewid) {
        this.crewid = crewid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRequirements() {
        return requirements;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }

    public String getOffers() {
        return offers;
    }

    public void setOffers(String offers) {
        this.offers = offers;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    //    @ManyToOne
//    public Captain getCaptain() {
//        return captain;
//    }
//
//    public void setCaptain(Captain captain) {
//        this.captain = captain;
//    }
    @ManyToOne
    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }
}
