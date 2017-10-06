package demo.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import demo.model.Sailor;
import demo.service.ISailorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class SailorController {
    @Autowired
    ISailorService sailorService;

    //    @RequestMapping("/registration")
//    public String registrationPage() {
//
//        return "registration";
//    }
//
//    @RequestMapping("/main")
//    public String mainpage() {
//        return "mainpage";
//    }
    @RequestMapping("/sailor")
    public String mainpage2() {
        return "sailor/mianss";
    }


    @RequestMapping(value = "/sailorlist", method = RequestMethod.GET)
    public ModelAndView getSailorList() {
        ModelAndView model = new ModelAndView("administrator/sailorlist");
        List<Sailor> sailorList = sailorService.getAllSailor();
        return model.addObject("sailorlist", sailorList);
    }

    @RequestMapping(value = "/deletesailor", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<Sailor> deleteSailor(@RequestBody Sailor sailor) {
        sailorService.deleteSailor(sailor.getSailorid());
        return new ResponseEntity<Sailor>(HttpStatus.OK);
    }

    @RequestMapping(value = "/updatesailor", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<Sailor> updateSailor(@ModelAttribute Sailor sailor, @RequestParam(value = "sailorid") int sailorid) {
        sailorService.updateSailor(sailor);
        return new ResponseEntity<Sailor>(HttpStatus.OK);
    }

    @RequestMapping(value = "/newsailor", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<Sailor> addNewSailor(@ModelAttribute Sailor sailor) {
        sailorService.addNewSailor(sailor);
        return new ResponseEntity<Sailor>(HttpStatus.OK);
    }

    @RequestMapping(value = "/refrestsailorlist", method = RequestMethod.GET)
    public ResponseEntity<List<Sailor>> refreshSailorList() {
        List<Sailor> sailorList = sailorService.getAllSailor();
        return new ResponseEntity<List<Sailor>>(sailorList, HttpStatus.OK);
    }

    @RequestMapping("/myinformation")
    public ModelAndView mySailorInformation(@RequestParam(value = "sailorid")int sailorid) {
        ModelAndView model = new ModelAndView("sailor/myinformation");
        Sailor sailor = sailorService.selectSailorById(sailorid);
        return model.addObject("sailor",sailor);
    }


}