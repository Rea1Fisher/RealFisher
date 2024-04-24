package com.example.realfisher.domain.contract.DTO;

import lombok.*;
import org.springframework.stereotype.Component;

@Component
@Setter
@Getter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class BuildingDTO {
  private long registrationNum;
  private long renterPrice;
  private long userKey;
}
