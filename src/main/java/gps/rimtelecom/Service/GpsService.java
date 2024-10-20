package gps.rimtelecom.Service;


import gps.rimtelecom.Model.GpsCoordinate;
import gps.rimtelecom.Repository.GpsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GpsService {

    @Autowired
    private GpsRepository gpsRepository;

    public List<GpsCoordinate> getAllCoordinates() {
        return gpsRepository.findAll();
    }
}
