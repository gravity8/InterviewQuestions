package com.backendthethird.RestapipostgresqlandJWT.services;

import com.backendthethird.RestapipostgresqlandJWT.Exceptions.EtAuthException;
import com.backendthethird.RestapipostgresqlandJWT.domain.User;

public interface UserService{
    User validateUser(String email, String password) throws EtAuthException;

    User registeUser(String firstname, String lastName, String email, String password) throws EtAuthException;

}
