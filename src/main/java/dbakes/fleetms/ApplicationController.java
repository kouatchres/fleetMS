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
	@GetMapping("/layout")
	public String layout() {
		return "_layout";
	}
	@GetMapping("/hr")
	public String widget() {
		return "/hr/index";
	}
	@GetMapping("/fleet")
	public String fleet() {
		return "/fleet/index";
	}
	@GetMapping("/parameters")
	public String parameters() {
		return "/parameters/index";
	}
	@GetMapping("/accounts")
	public String account() {
		return "/account/index";
	}
	@GetMapping("/order")
	public String order() {
		return "/order/index";
	}
}
