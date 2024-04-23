<%--
  Created by IntelliJ IDEA.
  User: comet
  Date: 2024-04-11
  Time: 오후 9:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
        <input class="button" type="button" value="SignUp">
      </li>
      <li>
        <input class="rev-button" type="button" value="Login">
      </li>
    </ul>
  </div>
</div>