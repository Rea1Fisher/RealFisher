<%--
  Created by IntelliJ IDEA.
  User: comet
  Date: 2024-04-11
  Time: 오후 8:29
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
  <link rel="stylesheet" type="text/css" href="/css/main.css">
</head>
<body>

<%--HEADER--%>
<header>
  <%@ include file="/WEB-INF/views/header/topBar.jsp" %>
</header>

<%--MAIN--%>
<main>
  <%@ include file="/WEB-INF/views/main/main.jsp" %>
</main>

</body>
</html>
