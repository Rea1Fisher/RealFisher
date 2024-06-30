package com.example.realfisher.domain.user.DAO;

import com.example.realfisher.domain.user.DTO.UserDTO;
import org.apache.ibatis.annotations.Mapper;
import org.aspectj.weaver.loadtime.Agent;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserDAO {

  UserDTO selectOneUser(String id);
  UserDTO selectOneAgent(String id);

  int registerMember(UserDTO userDTO);

  int registerAgent(UserDTO userDTO);


}
