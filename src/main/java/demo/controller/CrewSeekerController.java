package demo.controller;

import demo.model.Crewseeker;
import demo.service.ICrewSeekerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CrewSeekerController {
    @Autowired
    ICrewSeekerService crewSeekerService;
    @RequestMapping(value = "/crewseekerlist", method = RequestMethod.GET)
    public ModelAndView getAllCrewSeeker(){
        ModelAndView model = new ModelAndView("administrator/crewseekerlist");
        List<Crewseeker> crewseekerList = crewSeekerService.getAllCrewSeeker();
        return model.addObject("creseekerlist",crewseekerList);
    }

    @RequestMapping(value = "/deleteonecrewseeker", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<Crewseeker> deleteCrewSeeker(@RequestBody Crewseeker crewseeker){
        crewSeekerService.deleteCrewSeeker(crewseeker.getId());
        return new ResponseEntity<Crewseeker>(HttpStatus.OK);
    }

    @RequestMapping(value = "/updatecreseeker", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<Crewseeker> updateCrewSeeker(@ModelAttribute Crewseeker crewseeker, @RequestParam(value = "id") int id){
        crewSeekerService.updateCrewSeeker(crewseeker);
        return new ResponseEntity<Crewseeker>(HttpStatus.OK);
    }


}
