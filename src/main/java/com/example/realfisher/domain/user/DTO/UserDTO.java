package com.example.realfisher.domain.user.DTO;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
//import jakarta.persistence.Entity;
import lombok.*;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
@Component
@Setter
@Getter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
public class UserDTO {
  private long userKey;
  private String userId;
  private String userPw;
  private String userName;
  private String email;
  private String phone;
  private boolean isDeleted;
  private Timestamp regDate;
  private String birthday;
  private String gender;
  private String userAddress;
  private Long userAccount; //계좌번호
  private String brokerNumber; // 중개사 번호
  private String registrationNum; // 건물 등본
  private String whichParticipant; // 참여자 종류
}
