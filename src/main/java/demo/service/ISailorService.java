package demo.service;

import demo.model.Sailor;

import java.util.List;

public interface ISailorService {
    List<Sailor> getAllSailor();
    void addNewSailor(Sailor sailor);
    void updateSailor(Sailor sailor);
    void deleteSailor(int sailorid);
    Sailor selectSailorById(int sailorId);

}
