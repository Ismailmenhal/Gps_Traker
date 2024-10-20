package gps.rimtelecom.Repository;

import gps.rimtelecom.Model.GpsCoordinate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GpsRepository extends JpaRepository<GpsCoordinate, Long> {
}
