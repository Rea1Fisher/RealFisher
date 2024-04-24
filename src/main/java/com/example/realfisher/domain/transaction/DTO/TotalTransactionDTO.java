package com.example.realfisher.domain.transaction.DTO;

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
public class TotalTransactionDTO {

  private long userAccount;
  private Timestamp transactionTime;
  private long amount;
  private String transactionType;
  private long userKey;
  private long SenderReceiverAccount;

}
