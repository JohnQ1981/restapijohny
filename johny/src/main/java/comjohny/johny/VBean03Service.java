package comjohny.johny;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VBean03Service {
	public final VBean02Repo usersRepo;
	
	@Autowired
	public VBean03Service (VBean02Repo usersRepo) {
		this.usersRepo= usersRepo;
		
	}
	
	public List<VBean01> getUsers(){
		return usersRepo.findAll();
		
	}

}
