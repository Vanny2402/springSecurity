package springsc.demo.userepository;

import org.springframework.data.repository.CrudRepository;

import springsc.demo.model.UserDao;

public interface UserRepository extends CrudRepository<UserDao, Long> {
	public UserDao findByUsername(String userName);
	
}

