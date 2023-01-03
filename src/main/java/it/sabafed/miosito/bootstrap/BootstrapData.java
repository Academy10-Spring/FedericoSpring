package it.sabafed.miosito.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import it.sabafed.miosito.model.User;
import it.sabafed.miosito.repository.UserRepository;

@Component
public class BootstrapData implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	

	@Override
	public void run(String... args) throws Exception {
		
		User user1 = new User("Gavino");
		User user2 = new User("Filippo");
		
		userRepository.save(user1);
		userRepository.save(user2);
	}

}