package demo.service;

import demo.model.Ship;

import java.util.List;

public interface IShipService {
    List<Ship> getAllShip();
    void addNewShip(Ship ship);
    void updateShip(Ship ship);
    void deleteShip(int id);
}
