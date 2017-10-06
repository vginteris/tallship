package demo.dao;

import demo.model.Sailor;

import java.util.List;

public interface ISailorDao {
    List<Sailor> getAllSailor();
    void addNewSailor(Sailor sailor);
    void updateSailor(Sailor sailor);
    void deleteSailor(int id);
    Sailor selectSailorById(int sailorId);
}
