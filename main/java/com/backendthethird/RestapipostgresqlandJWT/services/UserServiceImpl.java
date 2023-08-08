package com.backendthethird.RestapipostgresqlandJWT.services;

import com.backendthethird.RestapipostgresqlandJWT.Exceptions.EtAuthException;
import com.backendthethird.RestapipostgresqlandJWT.domain.User;
import com.backendthethird.RestapipostgresqlandJWT.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.regex.Pattern;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public User validateUser(String email, String password) throws EtAuthException {
        return null;
    }

    @Override
    public User registeUser(String firstname, String lastName, String email, String password) throws
            EtAuthException {
        Pattern pattern = Pattern.compile("^(.+)@(.+)$");
        if(email!=null){
            email = email.toLowerCase();
        }
        if(!pattern.matcher(email).matches()){
            throw new EtAuthException("invalid email");
        }
        Integer count = userRepository.getCountByEmail(email);
        if(count>0)
            throw new EtAuthException("email already in use");
        Integer userId = userRepository.create(firstname,lastName,email,password);
        return userRepository.findById(userId);
    }
}
