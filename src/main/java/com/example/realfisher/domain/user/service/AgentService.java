package com.example.realfisher.domain.user.service;

import com.example.realfisher.domain.user.DAO.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgentService {
  @Autowired
  UserDAO agentDAO;
}
