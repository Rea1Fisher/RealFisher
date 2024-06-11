let input_pw = document.getElementById('signup-userpw');
let input_pw_re = document.getElementById('signup-userpw-re');
let submit_btn = document.getElementById('submit');

let emailKey;
let is_email_checked = false;

/*id 중복 체크*/
$('#id-check-button').on('click', function () {
  $.ajax({
    type: 'post',
    url: '/user/id_check',
    data: {'userId': $('#signup-userid').val()},
    dataType: 'json',
    success: function (response) {
      // 아이디 중복
      if (response.idCheckResult === "아이디 중복") {
        alert("아이디가 중복되었습니다. 다른 아이디를 사용해주세요.");
        $('#signup-userid').focus();
      } else if ($('#signup-userid').val().length === 0) {
        alert("아이디를 입력해주세요.");
        $('#signup-userid').focus();
      } else {
        alert("사용 가능한 아이디입니다.");
        $('#signup-username').focus();
      }
    }
  })
});

/*인증메일 전송*/
$('#email-check-button').on('click', function () {

  if ($('#email').val().length === 0) alert("이메일 주소를 입력해주세요.");
  else {
    $.ajax({
      type: 'post',
      url: '/user/email_check',
      data: {'email': $('#email').val()},
      dataType: 'json',
      success: function (response) {
        emailKey = response.emailKey;
      }
    })
  }
});

/*인증 번호 확인*/
$('#email-auth-check-button').on('click', function () {
  if ($('#email-check-num').val() != emailKey) alert("인증번호가 다릅니다.");
  else {
    alert("인증이 완료되었습니다.");
    is_email_checked = true;
  }
});

/*우편 번호*/
$('#address-search-button').on('click', function () {
  new daum.Postcode({
    oncomplete: function (data) {
      $('#address-number').val(data.zonecode);
      $('#address-street').val(data.roadAddress);
    }
  }).open();
});

/* 회원가입 형식 체크 */
submit_btn.addEventListener('click', function (ev) {

  let phoneRegex = new RegExp("01[016789]-[^0][0-9]{2,3}-[0-9]{3,4}");
  let pwRegex = /^.*(?=^.{8,15}$)(?=.*\d)(?=.*[a-zA-Z])(?=.*[!@#$%^&+=]).*$/;
  let agentLessorRegex = /^[0-9]+$/;
  let is_agent_checked = document.getElementById('agent').checked;
  let is_lessor_checked = document.getElementById('lessor').checked;


  if ($('#signup-userid').val().length === 0) {
    alert("아이디를 입력해주세요.");
    $("#signup-userid").focus();
    ev.preventDefault(); // submit의 기본동작을 막기
  } else if ($('#signup-userpw').val().length === 0) {
    alert("비밀번호를 입력해주세요.");
    $("#signup-userpw").focus();
    ev.preventDefault();
  } else if ($('#signup-userpw-re').val().length === 0) {
    alert("비밀번호를 재입력해주세요.");
    $("#signup-userpw-re").focus();
    ev.preventDefault();
  } else if ($('#phone').val().length === 0) {
    alert("휴대폰 번호를 입력해주세요.");
    $("#phone").focus();
    ev.preventDefault();
  } else if ($('#email').val().length === 0) {
    alert("이메일을 입력해주세요.");
    $("#email").focus();
    ev.preventDefault();
  } else if (is_email_checked === false) {
    alert("이메일 인증을 완료해주세요.");
    $("#email-check-num").focus();
    ev.preventDefault();
  } else if ($('#birthday').val().length === 0) {
    alert("생년월일을 입력해주세요.");
    $("#birthday").focus();
    ev.preventDefault();
  } else if ($('#gender').val().length === 0) {
    alert("성별을 입력해주세요.");
    $("#gender").focus();
    ev.preventDefault();
  } else if ($('#address-number').val().length === 0) {
    alert("우편번호를 입력해주세요.");
    $("#address-number").focus();
    ev.preventDefault();
  } else if ($('#address-street').val().length === 0) {
    alert("도로명주소를 입력해주세요.");
    $("#address-street").focus();
    ev.preventDefault();
  } else if ($('#address-specific').val().length === 0) {
    alert("상세주소를 입력해주세요.");
    $("#address-specific").focus();
    ev.preventDefault();
  } else if (!pwRegex.test($('#signup-userpw').val())) { // 비밀번호 형식에 맞지 않는 경우
    alert("올바른 비밀번호 형식을 지켜주세요.");
    $('#signup-userpw').focus();
    ev.preventDefault();
  } else if (input_pw.value !== input_pw_re.value) { // 재확인 비밀번호랑 다른 경우
    alert("같은 비밀번호를 입력해주세요.");
    $('#signup-userpw-re').focus();
    ev.preventDefault();
  } else if (!phoneRegex.test($('#phone').val())) {
    alert("핸드폰 번호를 010-XXXX-XXXX 의 형식으로 입력해주세요.");
    $('#phone').focus();
    ev.preventDefault();
  } else if (is_agent_checked && !agentLessorRegex.test($('#agent_number').val())) {
    alert('중개사 자격번호에 번호만 입력해주세요.');
    $('#agent_number').focus();
    ev.preventDefault();
  } else if (is_agent_checked && !$('#agent_number').val()) {
    alert('소속공인중개사무소 \"-\"를 포함하여 번호를 입력해주세요');
    $('#agent_number').focus();
    ev.preventDefault();
  } else if (is_lessor_checked && !agentLessorRegex.test($('#lessor_number').val())) {
    alert('건물 등록번호에 번호만 입력해주세요.');
    $('#lessor_number').focus();
    ev.preventDefault();
  } else if (!agentLessorRegex.test($('#user-account').val())) {
    alert('계좌번호에 번호만 입력해주세요');
    $('#user-account').focus();
    ev.preventDefault();
  }


});

/* 거래 참여 방식 */
// $('#agent').on('checked', function () {
//   $('#agent-toggle').toggle();
// })
// $('#lessor').on('checked', function () {
//   $('#lessor-toggle').toggle();
// })
$('input[name="whichParticipant"]').on('change', function() {
  // 모든 토글 요소를 숨김
  $('#agent-toggle, #lessor-toggle').hide();

  // 선택된 라디오 버튼에 해당하는 토글 요소를 표시
  if ($('#agent').is(':checked')) {
    $('#agent-toggle').show();
  } else if ($('#lessor').is(':checked')) {
    $('#lessor-toggle').show();
  }
});

// 페이지 로드 시 초기 상태 설정
$('input[name="whichParticipant"]:checked').trigger('change');