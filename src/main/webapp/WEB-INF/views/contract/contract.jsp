<%--
  Created by IntelliJ IDEA.
  User: comet
  Date: 2024-06-23
  Time: 오후 4:50
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
  <link rel="stylesheet" type="text/css" href="/css/contract.css">
</head>

<body>

<%--HEADER--%>
<header>
  <%@ include file="/WEB-INF/views/header/topBar.jsp" %>
</header>
<main>
  <div class="contract-cover">
    <div class="inner">
      <form action="/contract/startContract" method="post">
        소재지<br/>
        <input class="contract-input" type="text" name="address" id="address"><br/>
        토지 - 지목<br/>
        <input class="contract-input" type="text" name="land_type" id="land-type"><br/>
        건물 - 구조<br/>
        <input class="contract-input" type="text" name="building_structure" id="buildingstructure"><br/>
        건물 - 용도<br/>
        <input class="contract-input" type="text" name="building_usage" id="building-usage"><br/>
        임대할 부분<br/>
        <input class="contract-input" type="text" name="leased_part" id="leased-part"><br/>
        토지 면적 (m²)<br/>
        <input class="contract-input" type="text" name="land_area" id="land-area"><br/>
        건축물 면적 (m²)<br/>
        <input class="contract-input" type="text" name="building_area" id="building-area"><br/>
        임대할 부분 면적 (m²)<br/>
        <input class="contract-input" type="text" name="leased_area" id="leased-area"><br/>
        보증금<br/>
        <input class="contract-input" type="text" name="security_deposit" id="security-deposit"><br/>
        계약금<br/>
        <input class="contract-input" type="text" name="contract_deposit" id="contract-deposit"><br/>
        잔금<br/>
        <input class="contract-input" type="text" name="balance" id="balance"><br/>
        계약 시작일<br/>
        <input class="contract-input" type="date" name="lease_start_date" id="start-date"><br/>
        계약 종료일<br/>
        <input class="contract-input" type="date" name="lease_end_date" id="end-date"><br/>
        특약 사항<br/>
        <textarea class="contract-input" name="special_terms" id="special-terms"></textarea><br/>
        <br/>
        임대인<br/><br/>
        주소<br/>
        <input class="contract-input" type="text" name="landlord_address" id="landlord-address" value="${contractDTO.landlordAddress}"><br/>
        전자서명<br/>
        <input class="contract-input" type="text" name="landlord_key" id="landlord-key" maxlength="18" value="${contractDTO.landlordKey}"><br/>
        전화번호<br/>
        <input class="contract-input" type="text" name="landlord_phone_number" id="landlord-phone-number" value="${contractDTO.landlordPhoneNumber}"><br/>
        성 명<br/>
        <input class="contract-input" type="text" name="landlord_name" id="landlord-name" value="${contractDTO.landlordName}"><br/>
        <br/>
        임차인<br/><br/>
        주소<br/>
        <input class="contract-input" type="text" name="tenant_address" id="tenant-address" value="${contractDTO.tenantAddress}"><br/>
        전자서명<br/>
        <input class="contract-input" type="text" name="tenant_key" id="tenant-key" maxlength="18" value="${contractDTO.tenantKey}"><br/>
        전화번호<br/>
        <input class="contract-input" type="text" name="tenant_phone_number" id="tenant-phone-number" value="${contractDTO.tenantPhoneNumber}"><br/>
        성 명<br/>
        <input class="contract-input" type="text" name="tenant_name" id="tenant-name" value="${contractDTO.tenantName}"><br/>
        <br/>
        중개사<br/><br/>
        주소<br/>
        <input class="contract-input" type="text" name="office_address" id="office-address" value="${contractDTO.officeAddress}"><br/>
        상호명<br/>
        <input class="contract-input" type="text" name="office_name" id="office-name" value="${contractDTO.officeName}"><br/>
        사무소 등록번호<br/>
        <input class="contract-input" type="text" name="office_registNum" id="office-registNum" value="${contractDTO.officeRegistNum}"><br/>
        전화번호<br/>
        <input class="contract-input" type="text" name="office_number" id="office-number"><br/>
        대표자<br/>
        <input class="contract-input" type="text" name="represent_name" id="represent-name" value="${contractDTO.representName}"><br/>
        소속공인중개사<br/>
        <input class="contract-input" type="text" name="agent_name" id="agent-name" value="${contractDTO.agentName}"><br/>
        소속공인중개사 등록번호<br/>
        <input class="contract-input" type="text" name="agent_registNum" id="agent-registNum" value="${contractDTO.agentRegistNum}" maxlength="18"><br/>

        <input type="submit" value="계 약 하 기">
      </form>
    </div>
  </div>
</main>

</body>
</html>
