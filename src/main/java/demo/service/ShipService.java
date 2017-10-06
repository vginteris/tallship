package demo.service;

import demo.dao.IShipDao;
import demo.model.Ship;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShipService implements IShipService{
    @Autowired
    IShipDao shipDao;

    @Override
    public List<Ship> getAllShip() {
        return shipDao.getAllShip();
    }

    @Override
    public void addNewShip(Ship ship) {

    }

    @Override
    public void updateShip(Ship ship) {
        shipDao.updateShip(ship);
    }

    @Override
    public void deleteShip(int id) {
    shipDao.deleteShip(id);
    }
}
