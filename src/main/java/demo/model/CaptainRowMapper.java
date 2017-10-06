package demo.model;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CaptainRowMapper implements RowMapper<Captain> {
    @Override
    public Captain mapRow(ResultSet resultSet, int i) throws SQLException {
        Captain captain = new Captain();
        captain.setCaptainid(resultSet.getInt("captainid"));
        captain.setName(resultSet.getString("name"));
        captain.setSurname(resultSet.getString("surname"));
        captain.setPhone(resultSet.getString("phone"));
        captain.setNationality(resultSet.getString("nationality"));
        captain.setEmail(resultSet.getString("email"));
        captain.setPassword(resultSet.getString("password"));
        captain.setSaillingExperience(resultSet.getInt("sailling_experience"));
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
        captain.setShip(ship);
        return captain;



    }
}
