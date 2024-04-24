package com.example.realfisher.domain.contract.DTO;

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
public class ContractDTO {
  private String address;
  private String landType;
  private String buildingStructure;
  private String buildingUsage;
  private String leasedArea;
  private int area1;
  private int area2;
  private int area3;
  private long securityDeposit;
  private long contractDeposit;
  private long balance;
  private Timestamp leaseStartDate;
  private Timestamp leaseEndDate;
  private String specialTerms;
  private String landlordAddress;
  private long landlordESignature;
  private String landlordPhoneNumber;
  private String landlordName;
  private String tenantAddress;
  private long tenantESignature;
  private String tenantPhoneNumber;
  private String tenantName;
  private String realEstateAgentAddress;
  private long realEstateAgentESignature;
  private String realEstateAgentPhoneNumber;
  private String realEstateAgentName;
  private long realEstateAgentUniqueNumber;

}
