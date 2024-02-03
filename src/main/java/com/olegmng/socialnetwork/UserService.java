package com.olegmng.socialnetwork;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers(){
        userRepository.save(new User(null, "Kuzma", "hkl@woiu.com"));
        userRepository.save(new User(null, "Zheka", "mlkl@woiu.com"));
        userRepository.save(new User(null, "Emma", "oplkl@woiu.com"));
        return userRepository.findAll();
    }

    public User getUser(Long id){
        return userRepository.findById(id).get();
    }
}
