package com.example.realfisher.domain.transaction.DTO;

import lombok.*;
import org.springframework.stereotype.Component;

@Component
@Setter
@Getter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class UserAccount {
  private long userAccount;
  private long balance;
  private boolean isCredit;
  private boolean isDeposit;
  private long userKey;

}
