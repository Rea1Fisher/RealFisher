package com.example.realfisher.domain.user.service;

import com.example.realfisher.domain.user.DTO.MailDTO;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import java.util.concurrent.ThreadLocalRandom;

@Service
@RequiredArgsConstructor
public class MailService {

  private final JavaMailSender javaMailSender;

  public int createMailRegister(MailDTO userEmail) {

    String senderEmail = "noreply@realfisher.com";

    int emailKey = ThreadLocalRandom.current().nextInt(10000000, 1000000000);

    MimeMessage mimeMessage = javaMailSender.createMimeMessage();

    String emailContent =
                       "<h1>안녕하세요. RealFihsher 입니다.</h1>"
                    +  "<h3>요청하신 인증 번호입니다.</h3>"
                    + "<h2>" + emailKey + "</h2>"
                    + "<div>해당 인증 번호를 인증번호 확인란에 기입해 주세요</div>";

    try {
      MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage,true,"UTF-8");
      messageHelper.setSubject("[RealFisher] 회원가입을 위한 이메일 인증");
      messageHelper.setTo(userEmail.getReceiver());
//      messageHelper.setFrom(senderEmail);
      messageHelper.setText(emailContent,true);
      javaMailSender.send(mimeMessage);
    } catch (Exception e) {
      e.printStackTrace();
      System.out.println("이메일 발송 에러");
    }
    return emailKey;
  }

}
