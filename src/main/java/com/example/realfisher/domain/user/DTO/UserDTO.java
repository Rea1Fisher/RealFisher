package com.example.realfisher.domain.user.DTO;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
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
  private String Id;
  private String Pw;
  private String Name;
  private String Email;
  private String Phone;
  private boolean isDeleted;
  private Timestamp regDate;
  private Timestamp birth;
  private String userAddress;
  private Long borkerNumber;
  private long userAccount; //계좌번호
  private long registrationNum; // 건물 등본
  private long fishCoin;
  private boolean isAgent;
  private boolean isLessee;
  private boolean isLessor;

}
