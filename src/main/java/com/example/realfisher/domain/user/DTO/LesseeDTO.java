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
public class LesseeDTO {
  private long lesseeKey;
  private String lesseeId;
  private String lesseePw;
  private String lesseeName;
  private String lesseeEmail;
  private String lesseePhone;
  private boolean lesseeIsDeleted;
  private Timestamp lesseeRegDate;
  private Timestamp lesseeBirth;
  private String lesseeAddress;
  private long lesseeAccount; //계좌번호
  private long lesseeCoin;

}
