package com.example.realfisher.domain.user.DTO;

import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class LessorDTO {
  private long lessorKey;
  private String lessorId;
  private String lessorPw;
  private String lessorName;
  private String lessorEmail;
  private String lessorPhone;
  private boolean lessorIsDeleted;
  private String lessorRegDate;
  private String lessorBirth;
  private String lessorAddress;
  private Long borkerNumber;
  private int lessorAccount; //계좌번호
  private long registrationNum; // 건물 등본
  private long lessorCoin;

  public LessorDTO() {
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) return true;
    if (object == null || getClass() != object.getClass()) return false;

    LessorDTO lessorDTO = (LessorDTO) object;

    if (lessorKey != lessorDTO.lessorKey) return false;
    if (lessorIsDeleted != lessorDTO.lessorIsDeleted) return false;
    if (lessorAccount != lessorDTO.lessorAccount) return false;
    if (registrationNum != lessorDTO.registrationNum) return false;
    if (lessorCoin != lessorDTO.lessorCoin) return false;
    if (!Objects.equals(lessorId, lessorDTO.lessorId)) return false;
    if (!Objects.equals(lessorPw, lessorDTO.lessorPw)) return false;
    if (!Objects.equals(lessorName, lessorDTO.lessorName)) return false;
    if (!Objects.equals(lessorEmail, lessorDTO.lessorEmail)) return false;
    if (!Objects.equals(lessorPhone, lessorDTO.lessorPhone)) return false;
    if (!Objects.equals(lessorRegDate, lessorDTO.lessorRegDate))
      return false;
    if (!Objects.equals(lessorBirth, lessorDTO.lessorBirth)) return false;
    if (!Objects.equals(lessorAddress, lessorDTO.lessorAddress))
      return false;
    return Objects.equals(borkerNumber, lessorDTO.borkerNumber);
  }

  @Override
  public int hashCode() {
    int result = (int) (lessorKey ^ (lessorKey >>> 32));
    result = 31 * result + (lessorId != null ? lessorId.hashCode() : 0);
    result = 31 * result + (lessorPw != null ? lessorPw.hashCode() : 0);
    result = 31 * result + (lessorName != null ? lessorName.hashCode() : 0);
    result = 31 * result + (lessorEmail != null ? lessorEmail.hashCode() : 0);
    result = 31 * result + (lessorPhone != null ? lessorPhone.hashCode() : 0);
    result = 31 * result + (lessorIsDeleted ? 1 : 0);
    result = 31 * result + (lessorRegDate != null ? lessorRegDate.hashCode() : 0);
    result = 31 * result + (lessorBirth != null ? lessorBirth.hashCode() : 0);
    result = 31 * result + (lessorAddress != null ? lessorAddress.hashCode() : 0);
    result = 31 * result + (borkerNumber != null ? borkerNumber.hashCode() : 0);
    result = 31 * result + lessorAccount;
    result = 31 * result + (int) (registrationNum ^ (registrationNum >>> 32));
    result = 31 * result + (int) (lessorCoin ^ (lessorCoin >>> 32));
    return result;
  }

  @Override
  public String toString() {
    return "LessorDTO{" +
            "lessorKey=" + lessorKey +
            ", lessorId='" + lessorId + '\'' +
            ", lessorPw='" + lessorPw + '\'' +
            ", lessorName='" + lessorName + '\'' +
            ", lessorEmail='" + lessorEmail + '\'' +
            ", lessorPhone='" + lessorPhone + '\'' +
            ", lessorIsDeleted=" + lessorIsDeleted +
            ", lessorRegDate='" + lessorRegDate + '\'' +
            ", lessorBirth='" + lessorBirth + '\'' +
            ", lessorAddress='" + lessorAddress + '\'' +
            ", borkerNumber=" + borkerNumber +
            ", lessorAccount=" + lessorAccount +
            ", registrationNum=" + registrationNum +
            ", lessorCoin=" + lessorCoin +
            '}';
  }

  public long getLessorKey() {
    return lessorKey;
  }

  public void setLessorKey(long lessorKey) {
    this.lessorKey = lessorKey;
  }

  public String getLessorId() {
    return lessorId;
  }

  public void setLessorId(String lessorId) {
    this.lessorId = lessorId;
  }

  public String getLessorPw() {
    return lessorPw;
  }

  public void setLessorPw(String lessorPw) {
    this.lessorPw = lessorPw;
  }

  public String getLessorName() {
    return lessorName;
  }

  public void setLessorName(String lessorName) {
    this.lessorName = lessorName;
  }

  public String getLessorEmail() {
    return lessorEmail;
  }

  public void setLessorEmail(String lessorEmail) {
    this.lessorEmail = lessorEmail;
  }

  public String getLessorPhone() {
    return lessorPhone;
  }

  public void setLessorPhone(String lessorPhone) {
    this.lessorPhone = lessorPhone;
  }

  public boolean isLessorIsDeleted() {
    return lessorIsDeleted;
  }

  public void setLessorIsDeleted(boolean lessorIsDeleted) {
    this.lessorIsDeleted = lessorIsDeleted;
  }

  public String getLessorRegDate() {
    return lessorRegDate;
  }

  public void setLessorRegDate(String lessorRegDate) {
    this.lessorRegDate = lessorRegDate;
  }

  public String getLessorBirth() {
    return lessorBirth;
  }

  public void setLessorBirth(String lessorBirth) {
    this.lessorBirth = lessorBirth;
  }

  public String getLessorAddress() {
    return lessorAddress;
  }

  public void setLessorAddress(String lessorAddress) {
    this.lessorAddress = lessorAddress;
  }

  public Long getBorkerNumber() {
    return borkerNumber;
  }

  public void setBorkerNumber(Long borkerNumber) {
    this.borkerNumber = borkerNumber;
  }

  public int getLessorAccount() {
    return lessorAccount;
  }

  public void setLessorAccount(int lessorAccount) {
    this.lessorAccount = lessorAccount;
  }

  public long getRegistrationNum() {
    return registrationNum;
  }

  public void setRegistrationNum(long registrationNum) {
    this.registrationNum = registrationNum;
  }

  public long getLessorCoin() {
    return lessorCoin;
  }

  public void setLessorCoin(long lessorCoin) {
    this.lessorCoin = lessorCoin;
  }
}
