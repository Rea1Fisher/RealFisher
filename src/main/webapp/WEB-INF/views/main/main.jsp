<%--
  Created by IntelliJ IDEA.
  User: comet
  Date: 2024-04-12
  Time: 오전 12:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script defer src="/js/search.js"></script>

<div class="main-cover">

  <div class="inner">
    <p>
      부동산 계약 RealFisher와<br/>
      쉽고 안전하게
    </p>

    <div class="btn-cover">
      <input id="a-button" class="a-button" type="button" value="for agent">
      <input id="t-button" class="t-button" type="button" value="for tenant">
    </div>

    <form id="search-form" name="searchForm" action="/search" autocomplete="off">
    <div class="search-cover">
      <div class="background">
        <div class="in-cover">
          <div class="category">All</div>
          <i class="fa-solid fa-play fa-rotate-90" style="color: #333333;"></i>
          <div class="line" style="margin-left: 20px"></div>
          <input class="search-text" id="keyword" name="keyword" type="text" placeholder="search here..." required maxlength='25'/>

          <i id="search-icon" class="fa-solid fa-magnifying-glass" style="color: #333333;"></i>
        </div>
      </div>

    </div>
    </form>

  </div>


</div>