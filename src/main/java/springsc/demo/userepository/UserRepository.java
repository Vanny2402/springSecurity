package springsc.demo.userepository;

import org.springframework.data.repository.CrudRepository;

import springsc.demo.model.User;

public interface UserRepository extends CrudRepository<User, Long> {
	public User findByUserName(String userName);
	
}

