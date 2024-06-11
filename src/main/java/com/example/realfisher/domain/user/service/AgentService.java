package com.example.realfisher.domain.user.service;

import com.example.realfisher.domain.user.DAO.UserDAO;
import com.example.realfisher.domain.user.DTO.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgentService {
  @Autowired
  UserDAO userDAO;

  public String registerAgent(UserDTO userDTO) {
    return userDAO.registerAgent(userDTO) == 1 ? "정상 회원가입이 되었습니다." : "오류 발생";
  }
}
