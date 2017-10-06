package demo.service;

import demo.dao.ISailorDao;
import demo.model.Sailor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SailorService implements ISailorService {
    @Autowired
    ISailorDao sailorDao;

    @Override
    public List<Sailor> getAllSailor() {

        return sailorDao.getAllSailor();
    }

    @Override
    public void addNewSailor(Sailor sailor) {
        sailorDao.addNewSailor(sailor);
    }

    @Override
    public void updateSailor(Sailor sailor) {
        sailorDao.updateSailor(sailor);

    }

    @Override
    public void deleteSailor(int sailorid) {
        sailorDao.deleteSailor(sailorid);
    }

    @Override
    public Sailor selectSailorById(int sailorId) {
        return sailorDao.selectSailorById(sailorId);
    }
}
