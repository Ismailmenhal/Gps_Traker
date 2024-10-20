package gps.rimtelecom.controller;


import gps.rimtelecom.Model.GpsCoordinate;
import gps.rimtelecom.Service.GpsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/gps")
@CrossOrigin
public class GpsController {

    @Autowired
    private GpsService gpsService;

    @GetMapping("/coordinates")
    public List<GpsCoordinate> getGpsCoordinates() {
        return gpsService.getAllCoordinates();
    }
}
