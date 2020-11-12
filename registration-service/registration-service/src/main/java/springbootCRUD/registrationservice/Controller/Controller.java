package springbootCRUD.registrationservice.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springbootCRUD.registrationservice.Dao.UserRepository;
import springbootCRUD.registrationservice.Model.User;




@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/")

public class Controller {

	@Autowired
    private UserRepository repository;

    @PostMapping(value= "/register")
    public String register(@RequestBody User user) {
    	System.out.println(user.getId());
    	System.out.println(user.getName());
    	System.out.println(user.getEmail());
        repository.save(user);
        return "Hi " + user.getName() + " your Registration process successfully completed";
    }
  
    @GetMapping("/getAllUsers")
    public List<User> findAllUsers() {
        return repository.findAll();
    }

    @GetMapping(value= "/findUser/{email}")
    public List<User> findUser(@PathVariable String email) {
        return repository.findByEmail(email);
    }

    @DeleteMapping(value= "/cancel/{id}")
    public List<User> cancelRegistration(@PathVariable int id) {
        repository.deleteById(id);
        return repository.findAll();
    }
    
    

}
