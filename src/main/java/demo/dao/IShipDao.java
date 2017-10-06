package demo.dao;

import demo.model.Captain;
import demo.model.Ship;

import java.util.List;

public interface IShipDao {
    List<Ship> getAllShip();
    void addNewShip(Ship ship);
    void updateShip(Ship ship);
    void deleteShip(int id);

}
