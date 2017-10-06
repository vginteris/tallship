package demo.dao;

import demo.model.Captain;
import demo.model.Ship;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Transactional
@Repository
public class ShipDao implements IShipDao {
    @PersistenceContext
    EntityManager entityManager;
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<Ship> getAllShip() {
        String sql = "FROM Ship";
        return entityManager.createQuery(sql, Ship.class).getResultList();
    }

    @Override
    public void addNewShip(Ship ship) {

    }

    @Override
    public void updateShip(Ship ship) {
        String sql = "UPDATE ship SET crew=?, flag=?, free_crew_space=?, length=?, location=?, ship_class=?, shipname=?, speed=?, year=? WHERE shipid=?";
        jdbcTemplate.update(sql, ship.getCrew(), ship.getFlag(), ship.getFreeCrewSpace(), ship.getLength(), ship.getLocation(), ship.getShipClass(), ship.getShipname(),
                ship.getSpeed(), ship.getYear(), ship.getShipid());

    }

    @Override
    public void deleteShip(int id) {
        String captainSql = "DELETE FROM captain WHERE ship_shipid=?";
        jdbcTemplate.update(captainSql, id);
        String crewSql = "DELETE FROM crewseeker WHERE ship_shipid=?";
        jdbcTemplate.update(crewSql,id);
        String shipSql = "DELETE FROM ship WHERE shipid=?";
        jdbcTemplate.update(shipSql,id);
    }


}
