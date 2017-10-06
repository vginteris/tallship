package demo.service;

import demo.dao.ICrewSeekerDao;
import demo.model.Crewseeker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CrewSeekerService implements ICrewSeekerService {
    @Autowired
    ICrewSeekerDao crewSeekerDao;


    @Override
    public List<Crewseeker> getAllCrewSeeker() {
        return crewSeekerDao.getAllCrewSeeker();
    }

    @Override
    public void addNewCrewSeeker(Crewseeker crewseeker) {

    }

    @Override
    public void updateCrewSeeker(Crewseeker crewseeker) {
        crewSeekerDao.updateCrewSeeker(crewseeker);

    }

    @Override
    public void deleteCrewSeeker(int id) {
        crewSeekerDao.deleteCrewSeeker(id);

    }
}
