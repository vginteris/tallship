package demo.controller;

import demo.model.Ship;
import demo.service.IShipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ShipController {
    @Autowired
    IShipService shipService;

    @RequestMapping(value = "/shiptable", method = RequestMethod.GET)
    public ModelAndView getAllShip(){
        ModelAndView model = new ModelAndView("administrator/shiplist");
        List<Ship> shipList = shipService.getAllShip();
        return model.addObject("shiplist",shipList);
    }

    @RequestMapping(value = "/deleteship", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<Ship> deleteShip(@RequestBody Ship ship){
        shipService.deleteShip(ship.getShipid());
        return new ResponseEntity<Ship>(HttpStatus.OK);
    }

    @RequestMapping(value = "/updateship", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<Ship> updateShip(@ModelAttribute Ship ship, @RequestParam(value = "shipid") int shipid){
        shipService.updateShip(ship);
        return new ResponseEntity<Ship>(HttpStatus.OK);
    }
}
