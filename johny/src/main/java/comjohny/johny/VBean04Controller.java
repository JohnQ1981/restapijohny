package comjohny.johny;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VBean04Controller {
	public final VBean03Service usersService;
	
	@Autowired
	public VBean04Controller (VBean03Service usersService) {
		this.usersService=usersService;
		
	}
	@GetMapping(path="/users")
	public List<VBean01> getAllUsers(){
		return usersService.getUsers();
	}
	
	
	
	
}
