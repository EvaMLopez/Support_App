package dev.evalopez.appsupport.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.evalopez.appsupport.Model.User;
import dev.evalopez.appsupport.Repository.UserRepository;

@Service
public class UserService implements GenericService<User> {
    
    private final UserRepository userRepository;

    @Autowired 
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public User save(User entity) {
        return userRepository.save(entity);
    }
    
    @Override
    public User update(User entity) {
        return userRepository.save(entity);
    }

    @Override
    public void delete(User entity) {  
        userRepository.delete(entity);
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElse(null);        
    }    
}
