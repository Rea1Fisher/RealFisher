package com.example.realfisher.domain.user.DTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
public class AgentDTO {

  private long agentKey;
  private String agentId;
  private String agentPw;
  private String agentName;
  private String agentEmail;
  private String agentPhone;
  private boolean agentIsDeleted;
  private Timestamp agentRegDate;
  private Timestamp agentBirth;
  private String agentAddress;
  private long borkerNumber;
  private long agentAccount; //계좌번호
  private long agentCoin;



}