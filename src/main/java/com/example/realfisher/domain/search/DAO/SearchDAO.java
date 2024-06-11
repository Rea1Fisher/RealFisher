package com.example.realfisher.domain.search.DAO;

import com.example.realfisher.domain.search.DTO.RealEstateOfficeDTO;
import com.example.realfisher.domain.search.DTO.ReviewDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@Mapper
public interface SearchDAO {

  int insertDatas(ArrayList<RealEstateOfficeDTO> dataList);

  List<RealEstateOfficeDTO> searchOffice(String keyword);

  RealEstateOfficeDTO searchRN(String registrationNum);

  ReviewDTO searchReview(String registrationNum);
}
