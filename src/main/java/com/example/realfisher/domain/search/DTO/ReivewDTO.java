package com.example.realfisher.domain.search.DTO;

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
public class ReivewDTO {
  private long officeKey;
  private String review;
  private long userKey;
  private Timestamp writeTime;
}
