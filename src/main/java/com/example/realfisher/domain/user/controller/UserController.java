package com.example.realfisher.domain.user.controller;

import com.example.realfisher.domain.user.service.AgentService;
import com.example.realfisher.domain.user.service.LesseeService;
import com.example.realfisher.domain.user.service.LessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
  @Autowired
  AgentService agentService;
  @Autowired
  LesseeService lesseeService;
  @Autowired
  LessorService lessorService;

}
