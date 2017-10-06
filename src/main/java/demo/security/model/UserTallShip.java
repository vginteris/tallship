package demo.security.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "user_tallship")
public class UserTallShip {
    private Long userid;
    private String username;
    private String email;
    private String password;
    private String passwordConfrim;
    private Set<UserRole> userRole;

    public UserTallShip() {
    }

    public UserTallShip(Long userid, String username, String email, String password, String passwordConfrim, Set<UserRole> userRole) {
        this.userid = userid;
        this.username = username;
        this.email = email;
        this.password = password;
        this.passwordConfrim = passwordConfrim;
        this.userRole = userRole;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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
    @Transient
    public String getPasswordConfrim() {
        return passwordConfrim;
    }

    public void setPasswordConfrim(String passwordConfrim) {
        this.passwordConfrim = passwordConfrim;
    }

    @ManyToMany
    @JoinTable(name = "usertls_roletlship", joinColumns = @JoinColumn(name = "userts_id", referencedColumnName = "userid"),
                inverseJoinColumns = @JoinColumn(name = "rolets_id", referencedColumnName = "roldeid"))
    public Set<UserRole> getUserRole() {
        return userRole;
    }

    public void setUserRole(Set<UserRole> userRole) {
        this.userRole = userRole;
    }
}
