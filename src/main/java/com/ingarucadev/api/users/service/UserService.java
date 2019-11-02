package com.ingarucadev.api.users.service;

import com.ingarucadev.api.users.model.api.UserDTOResponse;

import java.io.IOException;

public interface UserService {

  UserDTOResponse getUser(long id) throws IOException;

}
