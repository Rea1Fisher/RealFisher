package com.example.realfisher.domain.user.controller;

import com.example.realfisher.domain.user.DTO.*;
import com.example.realfisher.domain.user.service.*;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Slf4j
@RequestMapping(path = "/user")
public class UserController {

  @Autowired
  ComponentService service;
//  @Autowired
//  UserService userService;
//  @Autowired
//  MailService mailService;

  @RequestMapping("/logout")
  public String logout(HttpSession session) {
    session.invalidate();
    return "redirect:/";
  }

  @GetMapping("/login")
  public String login() {
    return "user/loginForm";
  }

  @ResponseBody
  @PostMapping("/login")
  public String login(
          String userId, String userPw, boolean rememberId
          , HttpServletResponse response, HttpSession session
  ) {
    log.info("id : {}", userId);
    log.info("pw : {}", userPw);
    UserDTO dto = service.selectOneUser(userId);
//    log.info("dto : {}", dto);

    String loginResult = "";
    String jsonResult = "";

    if (dto == null) {
      loginResult = "아이디나 비밀번호를 확인해주세요.";
      jsonResult = "{\"loginResult\": \"" + loginResult + "\" }";

    } else {
      if (dto.getUserPw().equals(userPw)) {
        session.setAttribute("loginUser", dto);
        loginResult = "로그인 성공";
        jsonResult = "{\"loginResult\": \"" + loginResult + "\" }";

        if (rememberId) {
          Cookie cookie = new Cookie("id", userId);
          response.addCookie(cookie);
        } else {
          Cookie cookie = new Cookie("id", userId);
          cookie.setMaxAge(0);

          response.addCookie(cookie);
        }
      }
    }
    return jsonResult;
  }

  @GetMapping("/signup")
  public String signup() {
    return "user/signupForm";
  }

  @PostMapping("/signup")
  public ModelAndView signup(
          UserDTO userDTO, Model model, HttpSession session,
          String addressNumber, String addressStreet, String addressSpecific
  ) {

    String address = addressStreet + " " + addressSpecific;
    userDTO.setUserAddress(address);

    ModelAndView mv = new ModelAndView();
    log.info("userDTO : {}", userDTO);

    if (userDTO.getRegistrationNum().isEmpty())
      userDTO.setRegistrationNum(null);

    String result= "";

    // 공인중개사인 경우
    if (userDTO.getWhichParticipant().equals("agent")) {
      result = service.registerAgent(userDTO);
    } else {
    // 일반 회원인 경우
      result = service.registerMember(userDTO);
    }

    log.info("result : {}", result);

    if (result.equals("정상 회원가입이 되었습니다.")) {
      session.setAttribute("loginUser", userDTO);
      mv.setViewName("redirect:/");
    } else {
      mv.setViewName("redirect:/user/signup");
    }
//    mv.addObject("registerResult", result);

    return mv;
  }

  @PostMapping("/id_check")
  @ResponseBody
  public String signupCheck1(String userId) {
    String idCheckResult = "";
    String jsonResult = "";

    UserDTO dto = service.selectOneUser(userId);

    if (dto != null) {
      idCheckResult = "아이디 중복";
      jsonResult = "{\"idCheckResult\" : \"" + idCheckResult + "\"}";
    } else {
      idCheckResult = "사용가능한 아이디";
      jsonResult = "{\"idCheckResult\" : \"" + idCheckResult + "\"}";
    }
    return jsonResult;
  }

  @ResponseBody
  @PostMapping("/email_check")
  public String signupCheck2(String email) {
    String jsonResult = "";
    log.info("email : {}", email);
    MailDTO userEmail = new MailDTO(email);

    int emailKey = service.createMailRegister(userEmail);
    jsonResult = "{\"emailKey\" : \"" + emailKey + "\"}";

    return jsonResult;
  }

}
