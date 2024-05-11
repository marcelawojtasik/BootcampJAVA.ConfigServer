package Flight.Tickets.controller;

import Flight.Tickets.model.FlightDTO;
import Flight.Tickets.service.FlightClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {

    @Autowired
    private FlightClient flightClient;
    @GetMapping("/all")
    public List<FlightDTO> getAllFlights(){
        return flightClient.getAllFlights();
    }

    @GetMapping("/id")
    public FlightDTO getFlight(Long id){
        return flightClient.getFlight(id);
    }

}
