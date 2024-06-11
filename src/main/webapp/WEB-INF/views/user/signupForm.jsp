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
  <link rel="stylesheet" type="text/css" href="/css/signupForm.css">

  <script defer src="/js/signup.js"></script>
  <script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
</head>
<body>

<header>
  <%@ include file="/WEB-INF/views/header/topBar.jsp" %>
</header>

<div class="signup-cover">

  <div class="title"><p>RealFisher 회원가입</p></div>
  <form action="/user/signup" method="post">
    <div class="in-cover">
      <div>
        아이디<br/>
        <input class="signup-input" type="text" name="userId" id="signup-userid">
        &nbsp;<input class="signup-button" id="id-check-button" type="button" value="아이디 중복 체크" style="margin-right: 20px"><br/><br/>
      </div>

      이름<br/>
      <input class="signup-input" type="text" name="userName" id="signup-username"><br/>
      비밀번호 (8자리 이상, 문자 숫자 특수기호 포함)<br/>
      <input class="signup-input" id="signup-userpw" type="password" name="userPw"><br/>
      비밀번호 재확인<br/>
      <input class="signup-input" id="signup-userpw-re" type="password"><br/>
      핸드폰 번호 (01X-XXXX-XXXX 형식)<br/>
      <input class="signup-input" type="tel" name="phone" id="phone"><br/>

      <div>
        e-mail<br/>
        <input class="signup-input" type="email" name="email" id="email">
        &nbsp;<input class="signup-input" type="button" id="email-check-button" value="인증번호 요청"><br/>
      </div>

      <div>
        인증번호<br/>
        <input class="signup-input" type="text" name="userKey" id="email-check-num">
        &nbsp;<input class="signup-input" type="button" id="email-auth-check-button" value="인증번호 확인"><br/>
      </div>

      <div>
        계좌번호<br/>
        <input class="signup-input" type="text" name="userAccount" id="user-account" maxlength="18">
      </div>

      <div>
        생년월일<br/>
        <input type="date" name="birthday" id="birthday">
      </div>

      성별<br/>
      <select name="gender" id="gender">
        <option value="M">남자</option>
        <option value="F">여자</option>
      </select>
      <br/>

      거래 참여 방식<br/>
      <input id="agent" type="radio" value="agent" name="whichParticipant"><label for="agent">중개인</label>
      <input id="lessee" type="radio" value="lessee" name="whichParticipant" checked><label for="lessee">임차인</label>
      <input id="lessor" type="radio" value="lessor" name="whichParticipant"><label for="lessor">임대인</label>
      <br/>

      <div id="agent-toggle" style="display: none">
        중개사 자격번호 <input type="text" id="agent_number" name="brokerNumber" maxlength="18"><br>
        소속공인중개사무소 <input type="text" id="registration_num" name="registrationNum" maxlength="99">
      </div>

      <div id="lessor-toggle" style="display: none">
        건물 등록번호 <input type="text" id="lessor_number" name="registrationNum" maxlength="18">
      </div>

      <div style="margin:2px 0;">
        주소<br/>
        <input class="signup-input" type="text" name="addressNumber" id="address-number" placeholder="우편번호">
        &nbsp;<input class="signup-input" type="button" id="address-search-button" value="우편번호찾기"><br/>
      </div>
      <input class="signup-input" type="text" name="addressStreet" id="address-street" placeholder="도로명주소"><br>
      <input class="signup-input" type="text" name="addressSpecific" id="address-specific" placeholder="상세주소" maxlength="20"><br>
    </div>

    <br/>

    <div class="submit-cover">
      <input type="submit" value="회 원 가 입"  id="submit">
    </div>

  </form>

</div>


</body>
</html>
