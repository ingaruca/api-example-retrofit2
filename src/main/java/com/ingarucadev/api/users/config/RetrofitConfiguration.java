package com.ingarucadev.api.users.config;

import com.ingarucadev.api.users.proxy.UserProxy;
import okhttp3.OkHttpClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Configuration
public class RetrofitConfiguration {

  private static final String BASE_URL = "https://reqres.in/";

  private OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

  @Bean
  Retrofit userApiClient() {
    return new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(httpClient.build())
            .build();
  }


  @Bean
  public UserProxy retrofit() {
    return userApiClient().create(UserProxy.class);
  }

}
