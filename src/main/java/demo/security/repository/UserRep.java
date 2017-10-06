package demo.security.repository;

import demo.security.model.UserTallShip;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRep extends JpaRepository<UserTallShip, Long> {
    UserTallShip findUserByName(String username);
}
