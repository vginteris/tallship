package demo.dao;

import demo.model.CrewSeekerRowMapper;
import demo.model.Crewseeker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public class CrewSeekerDao implements ICrewSeekerDao {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Override
    public List<Crewseeker> getAllCrewSeeker() {
        String sql = "SELECT * FROM crewseeker INNER JOIN ship ON crewseeker.ship_shipid = ship.shipid";
        RowMapper<Crewseeker> rowMapper = new CrewSeekerRowMapper();
        List<Crewseeker> crewseekerList = jdbcTemplate.query(sql, rowMapper);
        return crewseekerList;
    }

    @Override
    public void addNewCrewSeeker(Crewseeker crewseeker) {

    }

    @Override
    public void updateCrewSeeker(Crewseeker crewseeker) {
        String sql = "UPDATE crewseeker SET title=?,requirements=?,offers=?,period=?,price=? WHERE crewid=?";
        jdbcTemplate.update(sql, crewseeker.getTitle(),crewseeker.getRequirements(),crewseeker.getOffers(),
                            crewseeker.getPeriod(),crewseeker.getPrice(),crewseeker.getId());

    }

    @Override
    public void deleteCrewSeeker(int id) {
        String sql ="DELETE FROM crewseeker WHERE crewid=?";
        jdbcTemplate.update(sql,id);
    }
}
