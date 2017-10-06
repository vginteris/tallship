package demo.dao;

import demo.model.Captain;
import demo.model.Crewseeker;
import demo.model.Sailor;
import demo.model.Ship;

import java.util.List;

public interface ICaptainDao {
    List<Captain> getAllCaptain();
    void addNewCaptain(Captain captain);
    void updateCaptain(Captain captain);
    void deleteCaptain(int id);
    List<Captain> getALL();
    void addNewUser(Captain captain, Ship ship, Crewseeker crewseeker);
}
