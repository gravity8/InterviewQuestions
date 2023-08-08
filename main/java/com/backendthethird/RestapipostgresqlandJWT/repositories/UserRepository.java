package com.backendthethird.RestapipostgresqlandJWT.repositories;

import com.backendthethird.RestapipostgresqlandJWT.Exceptions.EtAuthException;
import com.backendthethird.RestapipostgresqlandJWT.domain.User;

public interface UserRepository {
    Integer create(String firstName, String LastName, String email, String password) throws EtAuthException;

    User findByEmailAndPassword(String email, String password) throws EtAuthException;
    Integer getCountByEmail(String email);
    User findById( Integer userId);
}
