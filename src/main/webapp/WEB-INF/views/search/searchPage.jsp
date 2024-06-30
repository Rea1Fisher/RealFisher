<%--
  Created by IntelliJ IDEA.
  User: comet
  Date: 2024-06-03
  Time: 오후 7:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <jsp:include page="/WEB-INF/views/settings/head.jsp"/>

  <link rel="stylesheet" type="text/css" href="/css/common.css">
  <link rel="stylesheet" type="text/css" href="/css/header.css">
  <link rel="stylesheet" type="text/css" href="/css/main.css">
</head>
<body>

<%--HEADER--%>
<header>
  <%@ include file="/WEB-INF/views/header/topBar.jsp" %>
</header>

<br>
<c:forEach var="office" items="${officeInfo}">
  <div style="border: 1px solid olivedrab; text-align: center">
    <a class="office-info" href="/search/${office.registrationNum}">
      <div>${office.officeName}</div>
      <div>${office.registrationNum}</div>
      <div>${office.representative}</div>
      <div>${office.officeAddress}</div>
      <div>${office.regDate}</div>
    </a>
  </div>

  <br/>
</c:forEach>

</div>

</body>
</html>
