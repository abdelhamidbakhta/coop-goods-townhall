package org.coopgoods.controller.user;

import java.util.List;

import org.coopgoods.api.UserAPI;
import org.coopgoods.boot.TownHallConfiguration;
import org.coopgoods.model.user.User;
import org.coopgoods.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController implements UserAPI {

  @Autowired private TownHallConfiguration configuration;
  @Autowired private UserService userService;

  @Override
  public List<User> findAll() {
    return userService.findAll();
  }
}
