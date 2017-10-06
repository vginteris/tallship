package demo.dao;

import demo.model.Captain;
import demo.model.Crewseeker;

import java.util.List;

public interface ICrewSeekerDao {
    List<Crewseeker> getAllCrewSeeker();
    void addNewCrewSeeker(Crewseeker crewseeker);
    void updateCrewSeeker(Crewseeker crewseeker);
    void deleteCrewSeeker(int id);
}
