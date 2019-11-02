package com.ingarucadev.api.users.proxy;

import com.ingarucadev.api.users.model.thirdparty.UserApiResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface UserProxy {

  @GET("/api/users/{id}")
  Call<UserApiResponse> getUser(@Path("id") long id);

}
