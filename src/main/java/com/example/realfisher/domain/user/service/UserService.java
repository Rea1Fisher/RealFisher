package com.example.realfisher.domain.user.service;

import com.example.realfisher.domain.user.DAO.UserDAO;
import com.example.realfisher.domain.user.DTO.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.KeyPair;

@Service
public class UserService {
  @Autowired
  UserDAO userDAO;

  public UserDTO selectOneUser(String userId) {
    return userDAO.selectOneUser(userId);
  }


  public String registerMember(UserDTO userDTO) {
    UserDTO dto = selectOneUser(userDTO.getUserId());

    String result = "";

    if (dto != null) result = "아이디가 중복되었습니다.";
    else result = userDAO.registerMember(userDTO) == 1 ? "정상 회원가입이 되었습니다." : "오류 발생";

    return result;
  }


}
