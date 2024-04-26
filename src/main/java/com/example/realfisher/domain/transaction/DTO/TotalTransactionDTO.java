package com.example.realfisher.domain.transaction.DTO;

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
public class TotalTransactionDTO {

  private long userAccount;
  private Timestamp transactionTime;
  private long amount;
  private String transactionType;
  private long userKey;
  private long SenderReceiverAccount;

}
