package com.example.realfisher.domain.contract.service;

import com.example.realfisher.domain.contract.DAO.ContractDAO;
import com.example.realfisher.domain.contract.DTO.ContractDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ContractService {
  @Autowired
  ContractDAO contractDAO;
  public int registerContarct(ContractDTO contractDTO) {
    return contractDAO.registerContarct(contractDTO);
  }
}
