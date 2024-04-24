package com.example.realfisher.domain.user.DTO;

import lombok.*;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.util.Objects;

@Component
@Setter
@Getter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class LessorDTO {

  private long lessorKey;
  private String lessorId;
  private String lessorPw;
  private String lessorName;
  private String lessorEmail;
  private String lessorPhone;
  private boolean lessorIsDeleted;
  private Timestamp lessorRegDate;
  private Timestamp lessorBirth;
  private String lessorAddress;
  private Long borkerNumber;
  private long lessorAccount; //계좌번호
  private long registrationNum; // 건물 등본
  private long lessorCoin;


}