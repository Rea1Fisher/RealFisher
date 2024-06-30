package com.example.realfisher.domain.user.service;

import com.example.realfisher.domain.user.DTO.MailDTO;
import com.example.realfisher.domain.user.DTO.UserDTO;
import org.aspectj.weaver.loadtime.Agent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComponentService {
  @Autowired
  AgentService agentService;
  @Autowired
  LesseeService lesseeService;
  @Autowired
  LessorService lessorService;
  @Autowired
  UserService userService;
  @Autowired
  MailService mailService;

  public UserDTO selectOneUser(String userId) {
    return userService.selectOneUser(userId);
  }

  public int createMailRegister(MailDTO userEmail) {
    return mailService.createMailRegister(userEmail);
  }


  public String registerMember(UserDTO userDTO) {
    return userService.registerMember(userDTO);
  }

  public String registerAgent(UserDTO userDTO) {
    return agentService.registerAgent(userDTO);
  }

  public UserDTO selectOneAgent(String userId) {
    return agentService.selectOneAgent(userId);
  }
}
