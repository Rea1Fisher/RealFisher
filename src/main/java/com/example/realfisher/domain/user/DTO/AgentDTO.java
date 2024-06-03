package com.example.realfisher.domain.user.DTO;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
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
@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
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
  private long brokerNumber; // 중개사 번호
  private long agentAccount; //계좌번호



}