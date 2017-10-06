package demo.model;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CrewSeekerRowMapper implements RowMapper<Crewseeker> {
    @Override
    public Crewseeker mapRow(ResultSet resultSet, int i) throws SQLException {
        Crewseeker crewseeker = new Crewseeker();
        crewseeker.setId(resultSet.getInt("crewid"));
        crewseeker.setTitle(resultSet.getString("title"));
        crewseeker.setRequirements(resultSet.getString("requirements"));
        crewseeker.setOffers(resultSet.getString("offers"));
        crewseeker.setPeriod(resultSet.getInt("period"));
        crewseeker.setPrice(resultSet.getInt("price"));
        Ship ship = new Ship();
        ship.setShipid(resultSet.getInt("shipid"));
        ship.setCrew(resultSet.getInt("crew"));
        ship.setFlag(resultSet.getString("flag"));
        ship.setFreeCrewSpace(resultSet.getInt("free_crew_space"));
        ship.setLength(resultSet.getInt("length"));
        ship.setLocation(resultSet.getString("location"));
        ship.setShipClass(resultSet.getString("ship_class"));
        ship.setShipname(resultSet.getString("shipname"));
        ship.setSpeed(resultSet.getInt("speed"));
        ship.setYear(resultSet.getInt("year"));
        crewseeker.setShip(ship);
        return crewseeker;
    }
}
