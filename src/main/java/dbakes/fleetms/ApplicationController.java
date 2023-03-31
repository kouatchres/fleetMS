package dbakes.fleetms;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@EnableAutoConfiguration
@Controller
public class ApplicationController extends FleetmsApplication {
   
	@GetMapping("/index")
	public String home() {
		return "index";
	}
	@GetMapping("/widgets")
	public String widgets() {
		return "widgets";
	}
	
}
