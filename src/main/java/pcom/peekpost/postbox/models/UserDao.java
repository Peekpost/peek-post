package pcom.peekpost.postbox.models;

import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User, String> {
	
	public User findByPhone(String phone);

}
