package demo.controller;

import demo.model.Captain;
import demo.model.Crewseeker;
import demo.model.Ship;
import demo.service.ICaptainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CaptainController {
    @Autowired
    ICaptainService captainService;

//        @RequestMapping(value = "/captain1", method = RequestMethod.GET)
//    public ModelAndView allCaptain(){
//        ModelAndView model = new ModelAndView("administrator/captainlist");
//        List<Captain> captainList = captainService.getAllCaptain();
//        return model.addObject("captainlist",captainList);
//    }

    @RequestMapping(value = "/captain1", method = RequestMethod.GET)
    public ModelAndView getALl() {
        ModelAndView model = new ModelAndView("administrator/captainlist");
        List<Captain> captainList = captainService.getALL();
        return model.addObject("captainlist", captainList);
    }

    @RequestMapping(value = "/updatecapiton", method = RequestMethod.POST, produces = "text/plain")
    @ResponseBody
    public String updateCapitonDB(@ModelAttribute Captain captain) {
        captainService.updateCaptain(captain);
        String answer = "Captain update success";
        return answer;
    }

    @RequestMapping(value = "/deletecaptain", method = RequestMethod.POST, produces = "text/plain")
    @ResponseBody
    public String deleteCaptainDB(@RequestParam(value = "captainid") int captainid) {
        captainService.deleteCaptain(captainid);
        String answer = "Captain delete success";
        return answer;
    }
    @RequestMapping("/addnewuserjsp")
    public String openNewUserJsp() {
        return "administrator/newuser";
    }

    @RequestMapping(value = "/addnewuser", method = RequestMethod.POST, produces = "text/plain")
    public String addNewUser(@ModelAttribute Captain captain, @ModelAttribute Ship ship, @ModelAttribute Crewseeker crewseeker){
        captainService.addNewUser(captain,ship,crewseeker);
        String answer = "administrator/newuser";
        return answer;
    }


    @RequestMapping(value = "/joblist", method = RequestMethod.GET)
    public ModelAndView getJobList() {
        ModelAndView model = new ModelAndView("sailor/joblist");
        List<Captain> captainList = captainService.getALL();
        return model.addObject("joblist", captainList);
    }

}
