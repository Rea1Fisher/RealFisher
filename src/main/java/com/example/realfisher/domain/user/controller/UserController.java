package com.example.realfisher.domain.user.controller;

import com.example.realfisher.domain.user.DTO.AgentDTO;
import com.example.realfisher.domain.user.DTO.LesseeDTO;
import com.example.realfisher.domain.user.DTO.LessorDTO;
import com.example.realfisher.domain.user.DTO.UserDTO;
import com.example.realfisher.domain.user.service.AgentService;
import com.example.realfisher.domain.user.service.LesseeService;
import com.example.realfisher.domain.user.service.LessorService;
import com.example.realfisher.domain.user.service.UserService;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/user")
public class UserController {
  @Autowired
  AgentService agentService;
  @Autowired
  LesseeService lesseeService;
  @Autowired
  LessorService lessorService;
  @Autowired
  UserService userService;

  @GetMapping("/login")
  public String login() {
    return "user/loginForm";
  }

  @PostMapping("/login")
  public String login(
          String id, String pw, boolean rememberId
          , HttpServletResponse ressponse, HttpSession session
  ) {

    UserDTO dto = userService.selectOneUser(id);
    System.out.println(id);
    String loginResult = "";
    String jsonResult = "";
    System.out.println(rememberId);

    if (dto == null) {
      loginResult = "아이디나 비밀번호를 확인해주세요.";
      jsonResult = "{\"login_result\": \"" + loginResult + "\" }";

    } else {
      if (dto.getPw().equals(pw)) {
        session.setAttribute("loginResult", dto);
        loginResult = "로그인 성공";
        jsonResult = "{\"login_result\": \"" + loginResult + "\" }";

        if (rememberId) {
          Cookie cookie = new Cookie("id", id);
          ressponse.addCookie(cookie);
        } else {
          Cookie cookie = new Cookie("id", id);
          cookie.setMaxAge(0);

          ressponse.addCookie(cookie);
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
  public String signup(UserDTO userDTO, Model model, HttpSession session) {
    return "user/signupForm";
  }

}
