package com.example.realfisher.domain.user.service;

import com.example.realfisher.domain.user.DAO.UserDAO;
import com.example.realfisher.domain.user.DTO.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
  @Autowired
  UserDAO userDAO;

  public UserDTO selectOneUser(String id) {
    return userDAO.selectOneUser(id);
  }
}
