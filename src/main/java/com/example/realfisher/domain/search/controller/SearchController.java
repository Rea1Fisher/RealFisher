package com.example.realfisher.domain.search.controller;

import com.example.realfisher.domain.search.DTO.RealEstateOfficeDTO;
import com.example.realfisher.domain.search.service.DataService;
import com.example.realfisher.domain.search.service.SearchService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@Slf4j
public class SearchController {

  @Autowired
  DataService dataService;
  @Autowired
  SearchService searchService;

  @GetMapping("/search")
  public ModelAndView search(String keyword, HttpServletRequest request, HttpSession session) {
    ModelAndView mv = new ModelAndView();
    // keyword와 정확히 일치하는 공인중개사사무소
    if (keyword.isEmpty()) {
      mv.addObject("noneKeyword", "\"" + keyword + "\"" + "에 대한 검색결과가 없습니다.");
    } else {
      List<RealEstateOfficeDTO> list = searchService.searchOffice(keyword);
      mv.addObject("officeInfo", list);
      for (int i = 0; i < list.size(); i++) {
        log.info("RealEstateOfficeDTO : {}", list.get(i));
      }
    }
    mv.setViewName("searchPage");
    return mv;
  }

  @ResponseBody
  @RequestMapping("/insert_datas")
  public String datasInsertToDB() {
    int result = dataService.insertDatas();
    String string = "";
    if (result != 0) string = "완료";
    else string = "미완료";
    return string;
  }
}
