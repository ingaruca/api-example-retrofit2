package com.ingarucadev.api.users.expose.web;

import com.ingarucadev.api.users.model.api.UserDTOResponse;
import com.ingarucadev.api.users.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/api/v1.0")
public class UserController {

  private UserService userService;

  @GetMapping(value = "/users/{id}")
  public UserDTOResponse getUser(@PathVariable("id") long id) throws IOException {
    return userService.getUser(id);
  }

}
