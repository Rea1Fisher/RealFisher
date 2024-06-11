package com.example.realfisher.domain.search.DTO;

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
public class RealEstateOfficeDTO {
  private String registrationNum;
  private String officeName;
  private String representative;
  private String officeAddress;
  private String regDate;
}
