package com.example.realfisher.domain.search.service;

import com.example.realfisher.domain.search.DAO.SearchDAO;
import com.example.realfisher.domain.search.DTO.RealEstateOfficeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

@Service
public class DataService {

  @Autowired
  SearchDAO dao;

  public int insertDatas() {
    ArrayList<RealEstateOfficeDTO> dataList = readData();
    return dao.insertDatas(dataList);
  }

  public ArrayList<RealEstateOfficeDTO> readData() {

    ArrayList<RealEstateOfficeDTO> dataList = new ArrayList<>();

    File file = new File("D:\\realEstateDatas.csv");

    BufferedReader br = null;
    String line = "";
    String[] strArr = null;
    RealEstateOfficeDTO realEstateOffice = null;

    try (FileInputStream fi = new FileInputStream(file);
         InputStreamReader is = new InputStreamReader(fi, "EUC-KR")) {
      br = new BufferedReader(is);
      br.readLine();
      while ((line = br.readLine()) != null) {

        strArr = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");


        if (strArr[2].equals("") || strArr[2].isEmpty()) continue;
        strArr[3]=strArr[3].replaceAll("\"","");
        realEstateOffice = new RealEstateOfficeDTO(
                strArr[0], strArr[1], strArr[2], strArr[3],strArr[6]
        );
//        System.out.println(realEstateOffice);
        dataList.add(realEstateOffice);
      }

    } catch (FileNotFoundException e) {

    } catch (IOException e) {

    } finally {
      try {
        if (br != null) br.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    return dataList;
  }

}
