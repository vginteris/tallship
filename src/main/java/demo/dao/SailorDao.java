package demo.dao;

import demo.model.Sailor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public class SailorDao implements ISailorDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<Sailor> getAllSailor() {
        String sql = "SELECT * FROM sailor";
        RowMapper<Sailor> rowMapper = new BeanPropertyRowMapper<>(Sailor.class);
        List<Sailor> sailorList = jdbcTemplate.query(sql, rowMapper);
        return sailorList;
    }

    @Override
    public void addNewSailor(Sailor sailor) {
        String sql="INSERT INTO sailor (email, more_information, name, nationality, password, phone, sailling_experience, surname) VALUES (?,?,?,?,?,?,?,?)";
        jdbcTemplate.update(sql,sailor.getEmail(), sailor.getMoreInformation(),sailor.getName(),
                sailor.getNationality(), sailor.getPassword(),sailor.getPhone(),sailor.getSaillingExperience(),sailor.getSurname());

    }

    @Override
    public void updateSailor(Sailor sailor) {
        String sql="UPDATE sailor SET email=?, more_information=?, name=?, nationality=?, password=?, phone=?, sailling_experience=?, surname=? WHERE sailorid=?";
        jdbcTemplate.update(sql,sailor.getEmail(), sailor.getMoreInformation(),sailor.getName(),
                sailor.getNationality(), sailor.getPassword(),sailor.getPhone(),sailor.getSaillingExperience(),sailor.getSurname(),sailor.getSailorid());
    }

    @Override
    public void deleteSailor(int sailorid) {
        String sql="DELETE FROM sailor WHERE sailorid=?";
        jdbcTemplate.update(sql,sailorid);

    }

    @Override
    public Sailor selectSailorById(int sailorId) {
        String sql = "SELECT * from sailor WHERE sailorid=?";
        RowMapper<Sailor> rowMapper = new BeanPropertyRowMapper<>(Sailor.class);
        Sailor sailor = jdbcTemplate.queryForObject(sql,rowMapper,sailorId);
        return sailor;
    }


}
