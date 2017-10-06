package demo.security.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "role_tallship")
public class UserRole {
    private Long roldeid;
    private String roleName;
    private Set<UserTallShip> userTallShipSet;

    public UserRole() {

    }

    public UserRole(Long roldeid, String roleName, Set<UserTallShip> userTallShipSet) {
        this.roldeid = roldeid;
        this.roleName = roleName;
        this.userTallShipSet = userTallShipSet;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getRoldeid() {
        return roldeid;
    }

    public void setRoldeid(Long roldeid) {
        this.roldeid = roldeid;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
    @ManyToMany(mappedBy = "userRole")

    public Set<UserTallShip> getUserTallShipSet() {
        return userTallShipSet;
    }

    public void setUserTallShipSet(Set<UserTallShip> userTallShipSet) {
        this.userTallShipSet = userTallShipSet;
    }
}
