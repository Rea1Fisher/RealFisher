<%--
  Created by IntelliJ IDEA.
  User: comet
  Date: 2024-04-26
  Time: 오후 12:26
  To change this template use File | Settings | File Templates.
  class : -
  id : -
  name : camel case

--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="false" %>
<html>
<head>
  <jsp:include page="/WEB-INF/views/settings/head.jsp"/>

  <link rel="stylesheet" type="text/css" href="/css/common.css">
  <link rel="stylesheet" type="text/css" href="/css/header.css">
  <link rel="stylesheet" type="text/css" href="/css/loginForm.css">

  <script defer src="/js/login.js"></script>
</head>

<body>

<header>
  <%@ include file="/WEB-INF/views/header/topBar.jsp" %>
</header>

<div class="login-cover">

  <div class="title"><p>RealFisher 로그인</p></div>
  <div class="login-cover">
    <div class="id">
      <div class="text"></div>
      <input class="login-input" id="login-userid" value="${cookie.id.value}" name="userId" type="text" placeholder="ID"
             required maxlength="25">
    </div>

    <div class="pw">
      <div class="text"></div>
      <input class="login-input" id="login-userpw" name="userPw" type="password" placeholder="Password" required
             maxlength="25">
    </div>
  </div>

  <div class="check-cover">
    <input id="remember-id" type="checkbox" name="rememberId" <%--${empty cookie.id.value ? "":"checked"--%>}/>&nbsp;아이디
    저장
  </div>

  <div class="login-button">
    <input id="login-button" type="button" value="로그인">&nbsp;&nbsp;
    <div class='idpw-cover'>
      <input id="id-search-button" type="button" value="아이디 찾기">
      <input id="pw-search-button" type="button" value="비밀번호 찾기">
    </div>
  </div>

</div>

</body>
</html>
