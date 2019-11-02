package com.ingarucadev.api.users.service.impl;

import com.ingarucadev.api.users.model.api.UserDTOResponse;
import com.ingarucadev.api.users.model.thirdparty.UserApi;
import com.ingarucadev.api.users.model.thirdparty.UserApiResponse;
import com.ingarucadev.api.users.proxy.UserProxy;
import com.ingarucadev.api.users.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import retrofit2.Response;

import java.io.IOException;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private UserProxy userProxy;

  @Override
  public UserDTOResponse getUser(long id) throws IOException {
    UserDTOResponse response = new UserDTOResponse();
    Response<UserApiResponse> userApiResponse = userProxy.getUser(id).execute();
    UserApi userApi = userApiResponse.body().getData();

    response.setId(id);
    response.setFullName(userApi.getFirst_name().concat(" ").concat(userApi.getLast_name()));
    response.setEmail(userApi.getEmail());
    return response;
  }

}
