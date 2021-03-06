package services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import models.User;
import repositories.UserRepository;


@Service
public class UserServiceImpl implements UserService{
	
	 @Autowired
	    private UserRepository userRepository;

	   
	    public List < User > getAllUsers() {
	        return userRepository.findAll();
	    }

	    @Override
	    public void saveUser(User user) {
	        this.userRepository.save(user);
	    }

	    @Override
	    public User getUserById(long id) {
	        Optional < User > optional = userRepository.findById(id);
	        User user = null;
	        if (optional.isPresent()) {
	            user = optional.get();
	        } else {
	            throw new RuntimeException(" User not found for id :: " + id);
	        }
	        return user;
	    }

	    @Override
	    public void deleteUserById(long id) {
	        this.userRepository.deleteById(id);
	    }

}
