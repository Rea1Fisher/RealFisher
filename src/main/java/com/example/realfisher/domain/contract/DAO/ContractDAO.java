package com.example.realfisher.domain.contract.DAO;

import com.example.realfisher.domain.contract.DTO.ContractDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface ContractDAO {

  int registerContarct(ContractDTO contractDTO);
}
