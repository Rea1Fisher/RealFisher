package com.example.realfisher.domain.user.DTO;

import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class AgentDTO {
  private long agentKey;
  private String agentId;
  private String agentPw;
  private String agentName;
  private String agentEmail;
  private String agentPhone;
  private boolean agentIsDeleted;
  private String agentRegDate;
  private String agentBirth;
  private String agentAddress;
  private long borkerNumber;
  private int agentAccount; //계좌번호
  private long agentCoin;

  public AgentDTO() {
  }

  @Override
  public String toString() {
    return "AgentDTO{" +
            "agentKey=" + agentKey +
            ", agentId='" + agentId + '\'' +
            ", agentPw='" + agentPw + '\'' +
            ", agentName='" + agentName + '\'' +
            ", agentEmail='" + agentEmail + '\'' +
            ", agentPhone='" + agentPhone + '\'' +
            ", agentIsDeleted=" + agentIsDeleted +
            ", agentRegDate='" + agentRegDate + '\'' +
            ", agentBirth='" + agentBirth + '\'' +
            ", agentAddress='" + agentAddress + '\'' +
            ", borkerNumber=" + borkerNumber +
            ", agentAccount=" + agentAccount +
            ", agentCoin=" + agentCoin +
            '}';
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) return true;
    if (object == null || getClass() != object.getClass()) return false;

    AgentDTO agentDTO = (AgentDTO) object;

    if (agentKey != agentDTO.agentKey) return false;
    if (agentIsDeleted != agentDTO.agentIsDeleted) return false;
    if (borkerNumber != agentDTO.borkerNumber) return false;
    if (agentAccount != agentDTO.agentAccount) return false;
    if (agentCoin != agentDTO.agentCoin) return false;
    if (!Objects.equals(agentId, agentDTO.agentId)) return false;
    if (!Objects.equals(agentPw, agentDTO.agentPw)) return false;
    if (!Objects.equals(agentName, agentDTO.agentName)) return false;
    if (!Objects.equals(agentEmail, agentDTO.agentEmail)) return false;
    if (!Objects.equals(agentPhone, agentDTO.agentPhone)) return false;
    if (!Objects.equals(agentRegDate, agentDTO.agentRegDate))
      return false;
    if (!Objects.equals(agentBirth, agentDTO.agentBirth)) return false;
    return Objects.equals(agentAddress, agentDTO.agentAddress);
  }

  @Override
  public int hashCode() {
    int result = (int) (agentKey ^ (agentKey >>> 32));
    result = 31 * result + (agentId != null ? agentId.hashCode() : 0);
    result = 31 * result + (agentPw != null ? agentPw.hashCode() : 0);
    result = 31 * result + (agentName != null ? agentName.hashCode() : 0);
    result = 31 * result + (agentEmail != null ? agentEmail.hashCode() : 0);
    result = 31 * result + (agentPhone != null ? agentPhone.hashCode() : 0);
    result = 31 * result + (agentIsDeleted ? 1 : 0);
    result = 31 * result + (agentRegDate != null ? agentRegDate.hashCode() : 0);
    result = 31 * result + (agentBirth != null ? agentBirth.hashCode() : 0);
    result = 31 * result + (agentAddress != null ? agentAddress.hashCode() : 0);
    result = 31 * result + (int) (borkerNumber ^ (borkerNumber >>> 32));
    result = 31 * result + agentAccount;
    result = 31 * result + (int) (agentCoin ^ (agentCoin >>> 32));
    return result;
  }

  public long getAgentKey() {
    return agentKey;
  }

  public void setAgentKey(long agentKey) {
    this.agentKey = agentKey;
  }

  public String getAgentId() {
    return agentId;
  }

  public void setAgentId(String agentId) {
    this.agentId = agentId;
  }

  public String getAgentPw() {
    return agentPw;
  }

  public void setAgentPw(String agentPw) {
    this.agentPw = agentPw;
  }

  public String getAgentName() {
    return agentName;
  }

  public void setAgentName(String agentName) {
    this.agentName = agentName;
  }

  public String getAgentEmail() {
    return agentEmail;
  }

  public void setAgentEmail(String agentEmail) {
    this.agentEmail = agentEmail;
  }

  public String getAgentPhone() {
    return agentPhone;
  }

  public void setAgentPhone(String agentPhone) {
    this.agentPhone = agentPhone;
  }

  public boolean isAgentIsDeleted() {
    return agentIsDeleted;
  }

  public void setAgentIsDeleted(boolean agentIsDeleted) {
    this.agentIsDeleted = agentIsDeleted;
  }

  public String getAgentRegDate() {
    return agentRegDate;
  }

  public void setAgentRegDate(String agentRegDate) {
    this.agentRegDate = agentRegDate;
  }

  public String getAgentBirth() {
    return agentBirth;
  }

  public void setAgentBirth(String agentBirth) {
    this.agentBirth = agentBirth;
  }

  public String getAgentAddress() {
    return agentAddress;
  }

  public void setAgentAddress(String agentAddress) {
    this.agentAddress = agentAddress;
  }

  public long getBorkerNumber() {
    return borkerNumber;
  }

  public void setBorkerNumber(long borkerNumber) {
    this.borkerNumber = borkerNumber;
  }

  public int getAgentAccount() {
    return agentAccount;
  }

  public void setAgentAccount(int agentAccount) {
    this.agentAccount = agentAccount;
  }

  public long getAgentCoin() {
    return agentCoin;
  }

  public void setAgentCoin(long agentCoin) {
    this.agentCoin = agentCoin;
  }
}
