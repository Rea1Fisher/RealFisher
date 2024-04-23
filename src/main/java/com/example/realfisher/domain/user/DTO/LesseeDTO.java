package com.example.realfisher.domain.user.DTO;

import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class LesseeDTO {
  private long lesseeKey;
  private String lesseeId;
  private String lesseePw;
  private String lesseeName;
  private String lesseeEmail;
  private String lesseePhone;
  private boolean lesseeIsDeleted;
  private String lesseeRegDate;
  private String lesseeBirth;
  private String lesseeAddress;
  private int lesseeAccount; //계좌번호
  private long lesseeCoin;

  public LesseeDTO() {
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) return true;
    if (object == null || getClass() != object.getClass()) return false;

    LesseeDTO lesseeDTO = (LesseeDTO) object;

    if (lesseeKey != lesseeDTO.lesseeKey) return false;
    if (lesseeIsDeleted != lesseeDTO.lesseeIsDeleted) return false;
    if (lesseeAccount != lesseeDTO.lesseeAccount) return false;
    if (lesseeCoin != lesseeDTO.lesseeCoin) return false;
    if (!Objects.equals(lesseeId, lesseeDTO.lesseeId)) return false;
    if (!Objects.equals(lesseePw, lesseeDTO.lesseePw)) return false;
    if (!Objects.equals(lesseeName, lesseeDTO.lesseeName)) return false;
    if (!Objects.equals(lesseeEmail, lesseeDTO.lesseeEmail)) return false;
    if (!Objects.equals(lesseePhone, lesseeDTO.lesseePhone)) return false;
    if (!Objects.equals(lesseeRegDate, lesseeDTO.lesseeRegDate))
      return false;
    if (!Objects.equals(lesseeBirth, lesseeDTO.lesseeBirth)) return false;
    return Objects.equals(lesseeAddress, lesseeDTO.lesseeAddress);
  }

  @Override
  public int hashCode() {
    int result = (int) (lesseeKey ^ (lesseeKey >>> 32));
    result = 31 * result + (lesseeId != null ? lesseeId.hashCode() : 0);
    result = 31 * result + (lesseePw != null ? lesseePw.hashCode() : 0);
    result = 31 * result + (lesseeName != null ? lesseeName.hashCode() : 0);
    result = 31 * result + (lesseeEmail != null ? lesseeEmail.hashCode() : 0);
    result = 31 * result + (lesseePhone != null ? lesseePhone.hashCode() : 0);
    result = 31 * result + (lesseeIsDeleted ? 1 : 0);
    result = 31 * result + (lesseeRegDate != null ? lesseeRegDate.hashCode() : 0);
    result = 31 * result + (lesseeBirth != null ? lesseeBirth.hashCode() : 0);
    result = 31 * result + (lesseeAddress != null ? lesseeAddress.hashCode() : 0);
    result = 31 * result + lesseeAccount;
    result = 31 * result + (int) (lesseeCoin ^ (lesseeCoin >>> 32));
    return result;
  }

  @Override
  public String toString() {
    return "LesseeDTO{" +
            "lesseeKey=" + lesseeKey +
            ", lesseeId='" + lesseeId + '\'' +
            ", lesseePw='" + lesseePw + '\'' +
            ", lesseeName='" + lesseeName + '\'' +
            ", lesseeEmail='" + lesseeEmail + '\'' +
            ", lesseePhone='" + lesseePhone + '\'' +
            ", lesseeIsDeleted=" + lesseeIsDeleted +
            ", lesseeRegDate='" + lesseeRegDate + '\'' +
            ", lesseeBirth='" + lesseeBirth + '\'' +
            ", lesseeAddress='" + lesseeAddress + '\'' +
            ", lesseeAccount=" + lesseeAccount +
            ", lesseeCoin=" + lesseeCoin +
            '}';
  }

  public long getLesseeKey() {
    return lesseeKey;
  }

  public void setLesseeKey(long lesseeKey) {
    this.lesseeKey = lesseeKey;
  }

  public String getLesseeId() {
    return lesseeId;
  }

  public void setLesseeId(String lesseeId) {
    this.lesseeId = lesseeId;
  }

  public String getLesseePw() {
    return lesseePw;
  }

  public void setLesseePw(String lesseePw) {
    this.lesseePw = lesseePw;
  }

  public String getLesseeName() {
    return lesseeName;
  }

  public void setLesseeName(String lesseeName) {
    this.lesseeName = lesseeName;
  }

  public String getLesseeEmail() {
    return lesseeEmail;
  }

  public void setLesseeEmail(String lesseeEmail) {
    this.lesseeEmail = lesseeEmail;
  }

  public String getLesseePhone() {
    return lesseePhone;
  }

  public void setLesseePhone(String lesseePhone) {
    this.lesseePhone = lesseePhone;
  }

  public boolean isLesseeIsDeleted() {
    return lesseeIsDeleted;
  }

  public void setLesseeIsDeleted(boolean lesseeIsDeleted) {
    this.lesseeIsDeleted = lesseeIsDeleted;
  }

  public String getLesseeRegDate() {
    return lesseeRegDate;
  }

  public void setLesseeRegDate(String lesseeRegDate) {
    this.lesseeRegDate = lesseeRegDate;
  }

  public String getLesseeBirth() {
    return lesseeBirth;
  }

  public void setLesseeBirth(String lesseeBirth) {
    this.lesseeBirth = lesseeBirth;
  }

  public String getLesseeAddress() {
    return lesseeAddress;
  }

  public void setLesseeAddress(String lesseeAddress) {
    this.lesseeAddress = lesseeAddress;
  }

  public int getLesseeAccount() {
    return lesseeAccount;
  }

  public void setLesseeAccount(int lesseeAccount) {
    this.lesseeAccount = lesseeAccount;
  }

  public long getLesseeCoin() {
    return lesseeCoin;
  }

  public void setLesseeCoin(long lesseeCoin) {
    this.lesseeCoin = lesseeCoin;
  }
}
