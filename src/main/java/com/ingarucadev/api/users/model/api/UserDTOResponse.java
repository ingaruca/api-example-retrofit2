package com.ingarucadev.api.users.model.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDTOResponse {

  private long id;

  private String fullName;

  private String email;

}
