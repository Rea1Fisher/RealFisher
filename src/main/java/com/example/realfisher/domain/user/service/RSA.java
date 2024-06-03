package com.example.realfisher.domain.user.service;

import javax.crypto.Cipher;
import java.security.*;
import java.util.Base64;

public class RSA {
  private final KeyPair keyPair;
  private PublicKey publicKey;
  private PrivateKey privateKey;
  private String encryptedText;
  private int decryptedNum;

  public RSA(int originalNum) throws Exception {
    this.keyPair = generateKeyPair();
    this.publicKey = keyPair.getPublic();
    this.privateKey = keyPair.getPrivate();
  }

  private static String encrypt(int num, PublicKey publicKey) throws Exception {
    String numberToString = Integer.toString(num);

    Cipher cipher = Cipher.getInstance("RSA");
    cipher.init(Cipher.ENCRYPT_MODE, publicKey);
    byte[] encryptedBytes = cipher.doFinal(numberToString.getBytes());

    return Base64.getEncoder().encodeToString(encryptedBytes);
  }

  private static int decrypt(String encryptedText, PrivateKey privateKey) throws Exception {
    Cipher cipher = Cipher.getInstance("RSA");
    cipher.init(Cipher.DECRYPT_MODE, privateKey);
    byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(encryptedText));
    String decryptedString = new String(decryptedBytes);

    return Integer.parseInt(decryptedString);
  }

  private static KeyPair generateKeyPair() throws NoSuchAlgorithmException {
    KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA");
    generator.initialize(512);
    return generator.generateKeyPair();
  }
}
