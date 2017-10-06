package demo.service;

import demo.model.Captain;
import demo.model.Crewseeker;
import demo.model.Ship;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ICaptainService {
    List<Captain> getAllCaptain();
    void addNewCaptain(Captain captain);
    void updateCaptain(Captain captain);
    void deleteCaptain(int id);
    List<Captain> getALL();
    void addNewUser(Captain captain, Ship ship, Crewseeker crewseeker);

}
