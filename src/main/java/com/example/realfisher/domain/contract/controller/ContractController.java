package com.example.realfisher.domain.contract.controller;

import com.example.realfisher.domain.contract.DTO.ContractDTO;
import com.example.realfisher.domain.contract.service.ContractService;
import com.example.realfisher.domain.user.DTO.UserDTO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Random;

@Controller
@Slf4j
@RequestMapping(path = "/contract")
public class ContractController {
  @Autowired
  ContractService contractService;
  @RequestMapping
  public ModelAndView goToContract(HttpServletRequest request, HttpSession session) {
    ModelAndView mv = new ModelAndView();

    UserDTO userDTO = (UserDTO) session.getAttribute("loginUser");
    log.info("userDTO : {}", userDTO);

    ContractDTO contractDTO = new ContractDTO();
    contractDTO.setOfficeName(request.getParameter("office_name"));
    contractDTO.setRepresentName(request.getParameter("office_representName"));
    contractDTO.setOfficeAddress(request.getParameter("office_address"));

    if (userDTO.getBrokerNumber() != null) {
      contractDTO.setAgentRegistNum(userDTO.getBrokerNumber());
      contractDTO.setOfficeRegistNum(userDTO.getRegistrationNum());
      contractDTO.setAgentName(userDTO.getUserName());
    } else if (userDTO.getBuildingRegistration() != null) {
      contractDTO.setLandlordAddress(userDTO.getUserAddress());
      contractDTO.setLandlordKey(userDTO.getUserKey());
      contractDTO.setLandlordPhoneNumber(userDTO.getPhone());
      contractDTO.setLandlordName(userDTO.getUserName());
    } else {
      contractDTO.setTenantAddress(userDTO.getUserAddress());
      contractDTO.setTenantKey(userDTO.getUserKey());
      contractDTO.setTenantPhoneNumber(userDTO.getPhone());
      contractDTO.setTenantName(userDTO.getUserName());
    }

    mv.addObject("contractDTO", contractDTO);
    mv.setViewName("contract/contract");
    return mv;
  }

  @PostMapping("/startContract")
  public ModelAndView startContract(ContractDTO contractDTO) {
    ModelAndView mv = new ModelAndView();
    int hashCode=Math.abs(contractDTO.hashCode());
    contractDTO.setContractNumber(hashCode);
//    contractService.searchPreContract()
    contractService.registerContarct(contractDTO);
    return mv;
  }
}
