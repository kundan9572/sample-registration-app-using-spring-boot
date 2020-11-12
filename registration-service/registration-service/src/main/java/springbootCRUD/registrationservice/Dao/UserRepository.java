package springbootCRUD.registrationservice.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import springbootCRUD.registrationservice.Model.User;


@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
		
	List<User> findByEmail(String email);
	//List<User> findAll();
}
