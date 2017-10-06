package demo.service;

import demo.model.Crewseeker;

import java.util.List;

public interface ICrewSeekerService {
    List<Crewseeker> getAllCrewSeeker();
    void addNewCrewSeeker(Crewseeker crewseeker);
    void updateCrewSeeker(Crewseeker crewseeker);
    void deleteCrewSeeker(int id);
}
