package services;

import java.util.List;

import models.User;


public interface UserService {
	
	 List < User > getAllUsers();
	 void saveUser(User user);
	 User getUserById(long id);
	 void deleteUserById(long id);

}
