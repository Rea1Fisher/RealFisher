<%--
  Created by IntelliJ IDEA.
  User: comet
  Date: 2024-04-11
  Time: 오후 9:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--<%@ page session="false" %>--%>
<c:set var="loginInOutLink" value="${sessionScope.loginUser==null ? '/user/login' : '/user/logout'}" />
<c:set var="loginInOut" value="${sessionScope.loginUser==null ? 'LogIn' : 'LogOut'}" />
<c:set var="mySignOutLink" value="${sessionScope.loginUser==null ? '/user/signup' : '/user/mypage'}" />
<c:set var="mySign" value="${sessionScope.loginUser==null ? 'SignUp' : 'MyPage'}" />
<div class="header-cover">
  <div class="inner">
    <%--로고--%>
    <a href="/" class="logo">
      <img src="/images/logo.png" alt="realFish">
    </a>
    <p>RealFisher</p>
    <%--상단 버튼--%>
    <ul>
      <li>
        <a class="button" href="<c:url value='${mySignOutLink}'/>">${mySign}</a>
      </li>
      <li>
        <a class="button" href="<c:url value='${loginInOutLink}'/>">${loginInOut}</a>
      </li>
    </ul>
  </div>
</div>