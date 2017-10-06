package demo.security.repository;

import demo.security.model.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRep extends JpaRepository<UserRole,Long>{

}
