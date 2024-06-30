package com.example.realfisher.domain.contract.DTO;

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
public class ContractDTO {
  private String address;
  private String landType;
  private String buildingStructure;
  private String buildingUsage;
  private String leasedPart;
  private int landArea;
  private int buildingArea ;
  private int leasedArea ;
  private Timestamp leaseStartDate;
  private Timestamp leaseEndDate;
  private String specialTerms;

  private long securityDeposit;
  private long contractDeposit;
  private long balance;

  private String landlordAddress;
  private long landlordKey;
  private String landlordPhoneNumber;
  private String landlordName;

  private String tenantAddress;
  private long tenantKey;
  private String tenantPhoneNumber;
  private String tenantName;

  private String officeAddress;
  private String officeName;
  private String officeRegistNum;
  private String officeNumber; //전화번호
  private String representName; // 대표자
  private String agentName; // 소속공인중개사
  private String agentRegistNum; // 공인중개사 등록번호

  private long contractNumber; // 기본키
  private long preContract; // 이전 계약서


}
