package imagesharingplatform.userservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import imagesharingplatform.userservice.entity.User;
import imagesharingplatform.userservice.repository.UserRepository;

@SpringBootApplication
public class UserServiceApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class, args);
    }

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User user = new User(null, "fn1", "ln1", "email1", "password1");
        userRepository.save(user);
        
        System.out.println(userRepository.findAll());
    }

}
