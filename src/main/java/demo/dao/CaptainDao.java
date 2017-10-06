package demo.dao;

import demo.model.Captain;
import demo.model.CaptainRowMapper;
import demo.model.Crewseeker;
import demo.model.Ship;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.*;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

@Transactional
@Repository
public class CaptainDao implements ICaptainDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Captain> getAllCaptain() {
        String sql = "SELECT * FROM captain INNER JOIN ship ON captain.ship_shipid = ship.shipid";
        RowMapper<Captain> rowMapper = new CaptainRowMapper();
        List<Captain> captainList = jdbcTemplate.query(sql,rowMapper);
        return captainList;
    }

    @Override
    public List<Captain> getALL(){
        String sql = "SELECT c from Captain c";
        return entityManager.createQuery(sql, Captain.class).getResultList();
    }

    @Override
    public void addNewCaptain(Captain captain) {
        String sql= "INSERT INTO captain (captainid, email, name, nationality, password, phone, sailling_experience, surname, ship_shipid) " +
                "VALUES (?,?,?,?,?,?,?,?,?)";
        jdbcTemplate.update(sql,captain.getCaptainid(),captain.getEmail(),captain.getName(),captain.getNationality(),
                captain.getPassword(),captain.getPhone(),captain.getSaillingExperience(),captain.getSurname(),captain.getShip());
    }

    @Override
    public void updateCaptain(Captain captain) {
        String sql = "UPDATE captain SET email=?, name=?, nationality=?, password=?, phone=?, sailling_experience=?, surname=? WHERE captainid=?";
        jdbcTemplate.update(sql,captain.getEmail(),captain.getName(),captain.getNationality(),
                captain.getPassword(),captain.getPhone(),captain.getSaillingExperience(),captain.getSurname(),captain.getCaptainid());

    }

    @Override
    public void deleteCaptain(int id) {
        String sql = "DELETE FROM captain WHERE captainid=?";
        jdbcTemplate.update(sql,id);

    }

    public void addNewUser(Captain captain, Ship ship, Crewseeker crewseeker){
        String INSERT_SQL = "INSERT INTO ship (crew, flag, free_crew_space, length, location, ship_class, shipname, speed, year) VALUES (?,?,?,?,?,?,?,?,?)";
        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(
                new PreparedStatementCreator() {
                    public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                        PreparedStatement statement =
                                connection.prepareStatement(INSERT_SQL, new String[] {"shipid"});
                        statement.setInt(1,ship.getCrew());
                        statement.setString(2,ship.getFlag());
                        statement.setInt(3,ship.getFreeCrewSpace());
                        statement.setInt(4,ship.getLength());
                        statement.setString(5,ship.getLocation());
                        statement.setString(6,ship.getShipClass());
                        statement.setString(7,ship.getShipname());
                        statement.setInt(8,ship.getSpeed());
                        statement.setInt(9,ship.getYear());
                        return statement;
                    }
                },
                keyHolder);
        Integer primaryKey = (Integer) keyHolder.getKey();

        String sqlCaptain= "INSERT INTO captain (email, name, nationality, password, phone, sailling_experience, surname, ship_shipid) " +
                "VALUES (?,?,?,?,?,?,?,?)";
        jdbcTemplate.update(sqlCaptain,captain.getEmail(),captain.getName(),captain.getNationality(),
                captain.getPassword(),captain.getPhone(),captain.getSaillingExperience(),captain.getSurname(),primaryKey);
        String sqlCrewSeeker = "INSERT INTO  crewseeker (offers, period, price, requirements, title, ship_shipid) VALUES (?,?,?,?,?,?)";
        jdbcTemplate.update(sqlCrewSeeker,crewseeker.getOffers(), crewseeker.getPeriod(), crewseeker.getPrice(), crewseeker.getRequirements(),
                crewseeker.getTitle(), primaryKey);
    }
}
