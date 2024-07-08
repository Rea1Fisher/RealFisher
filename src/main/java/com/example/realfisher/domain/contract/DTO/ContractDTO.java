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
  private Integer landArea;
  private Integer buildingArea ;
  private Integer leasedArea ;
  private String leaseStartDate;
  private String leaseEndDate;
  private String specialTerms;

  private Long securityDeposit;
  private Long contractDeposit;
  private Long balance;

  private String landlordAddress;
  private Long landlordKey;
  private String landlordPhoneNumber;
  private String landlordName;

  private String tenantAddress;
  private Long tenantKey;
  private String tenantPhoneNumber;
  private String tenantName;

  private String officeAddress;
  private String officeName;
  private String officeRegistNum;
  private String officeNumber; //전화번호
  private String representName; // 대표자
  private String agentName; // 소속공인중개사
  private Long agentRegistNum; // 공인중개사 등록번호

  private Long contractNumber; // 기본키
  private Long preContract; // 이전 계약서


}
