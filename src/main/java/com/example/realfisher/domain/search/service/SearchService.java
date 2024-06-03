package com.example.realfisher.domain.search.service;

import com.example.realfisher.domain.search.DAO.SearchDAO;
import com.example.realfisher.domain.search.DTO.RealEstateOfficeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchService {
  @Autowired
  SearchDAO searchDAO;


  public List<RealEstateOfficeDTO> searchOffice(String keyword) {
    return searchDAO.searchOffice(keyword);
  }
}
