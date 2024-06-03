package com.example.realfisher.domain.user.DTO;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;
import org.springframework.stereotype.Component;

@Component
@Setter
@Getter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
public class MailDTO {
  private String receiver;
  private String title;
  private String content;

  public MailDTO(String receiver) {
    this.receiver = receiver;
  }

}
