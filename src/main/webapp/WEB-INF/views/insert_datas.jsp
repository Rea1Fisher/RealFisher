<%--
  Created by IntelliJ IDEA.
  User: comet
  Date: 2024-05-10
  Time: 오후 11:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
  <title>데이터 저장</title>
</head>
<script type="text/javascript">
  window.onload = function () {
    $.ajax({
      url: 'insert_datas',
      success: function (response) {
        $('#result').text(response.toString());
      }
    })
  };
</script>
<body>
<h1 id="result"></h1>

</body>
</html>
