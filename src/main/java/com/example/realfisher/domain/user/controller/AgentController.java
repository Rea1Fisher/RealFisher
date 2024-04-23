package com.example.realfisher.domain.user.controller;

import com.example.realfisher.domain.user.service.AgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AgentController {
  @Autowired
  AgentService agentService;


}
