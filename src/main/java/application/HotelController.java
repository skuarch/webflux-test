package application;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hotels")
public class HotelController {

	@GetMapping(path = "/{id}")
	public String get(@PathVariable("id") long id){
		return null;
	}
	
	
	
}
