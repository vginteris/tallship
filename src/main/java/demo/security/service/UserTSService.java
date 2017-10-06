package demo.security.service;

import demo.security.model.UserTallShip;
import demo.security.repository.RoleRep;
import demo.security.repository.UserRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;

@Service
public class UserTSService implements IUserTSService {
    @Autowired
    UserRep userRep;
    @Autowired
    RoleRep roleRep;
    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;
    @Override
    public UserTallShip findUserByName(String username) {
        return userRep.findUserByName(username);
    }

    @Override
    public void save(UserTallShip userTallShip) {
            userTallShip.setPassword(bCryptPasswordEncoder.encode(userTallShip.getPassword()));
            userTallShip.setUserRole(new HashSet<>(roleRep.findAll()));
            userRep.save(userTallShip);
    }
}
