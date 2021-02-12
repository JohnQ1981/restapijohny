package comjohny.johny;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VBean05Config {
	@Bean
	CommandLineRunner commandLineUsers(VBean02Repo usersRepo) {
		return arg->{
			for(int i=200; i<250; i++) {
				VBean01 p=new VBean01(200+i,"Name"+i, "LastName "+i, i+25000);
				i++;
				usersRepo.saveAll(List.of(p));
			}
			
		};
		
	}

}
