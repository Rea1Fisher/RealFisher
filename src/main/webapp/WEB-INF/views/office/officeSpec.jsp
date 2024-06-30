<%--
  Created by IntelliJ IDEA.
  User: comet
  Date: 2024-06-23
  Time: 오후 4:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <jsp:include page="/WEB-INF/views/settings/head.jsp"/>

  <link rel="stylesheet" type="text/css" href="/css/common.css">
  <link rel="stylesheet" type="text/css" href="/css/header.css">
</head>

<body>

<%--HEADER--%>
<header>

  <%@ include file="/WEB-INF/views/header/topBar.jsp" %>
</header>

<main>
  <div>
    <p><strong>Office Name:</strong> ${officeInfo.officeName}</p>
    <p><strong>Registration Number:</strong> ${officeInfo.registrationNum}</p>
    <p><strong>Representative:</strong> ${officeInfo.representative}</p>
    <p><strong>Office Address:</strong> ${officeInfo.officeAddress}</p>
    <p><strong>Registration Date:</strong> ${officeInfo.regDate}</p>
  </div>

  <br>
  <form action="/contract" method="post">
    <input type="hidden" name="office_name" value="${officeInfo.officeName}">
    <input type="hidden" name="office_representName" value="${officeInfo.representative}">
    <input type="hidden" name="office_address" value="${officeInfo.officeAddress}">

    <input type="submit" value="Go to Contract">
  </form>

</main>


</body>
</html>
