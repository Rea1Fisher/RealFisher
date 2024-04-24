package com.example.realfisher.domain.search.DTO;

import lombok.*;
import org.springframework.stereotype.Component;

@Component
@Setter
@Getter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class RealEstateOfficeDTO {
  private long officeKey;
  private long brokerRegistrationNum;
  private String officeAddress;
  private String representative;
  private String officeName;
}
