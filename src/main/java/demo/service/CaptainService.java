package demo.service;

import demo.dao.ICaptainDao;
import demo.model.Captain;
import demo.model.Crewseeker;
import demo.model.Ship;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CaptainService implements ICaptainService{
    @Autowired
    ICaptainDao captainDao;

    @Override
    public List<Captain> getAllCaptain() {
        return captainDao.getAllCaptain();
    }


    @Override
    public void addNewCaptain(Captain captain) {
        captainDao.addNewCaptain(captain);

    }

    @Override
    public void updateCaptain(Captain captain) {
        captainDao.updateCaptain(captain);
    }

    @Override
    public void deleteCaptain(int id) {
        captainDao.deleteCaptain(id);
    }

    @Override
    public List<Captain> getALL() {
        return captainDao.getALL();
    }

    @Override
    public void addNewUser(Captain captain, Ship ship, Crewseeker crewseeker) {
        captainDao.addNewUser(captain,ship,crewseeker);
    }
}
