package demo.security.service;

import demo.security.model.UserTallShip;

public interface IUserTSService {
    UserTallShip findUserByName(String username);
    void save(UserTallShip userTallShip);
}
