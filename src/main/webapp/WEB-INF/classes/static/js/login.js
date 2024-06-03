/*enter -> 로그인*/
$('.login-cover').keydown(function (e) {
  if (e.keyCode === 13) $("#login-button").click();
})
/*로그인*/
$("#login-button").on('click', function (ev) {

  if ($('#login-userid').val().length === 0 || $('#login-userpw').val().length === 0) {
    alert("아이디/비밀번호를 입력해 주세요.");
  } else {
    $.ajax({
      type: 'post',
      url: '/user/login',
      data: {
        'id': $('#login-userid').val(),
        'pw': $('#login-userpw').val(),
        'rememberId': $('#remember-id').prop('checked')
      },
      dataType: 'json',
      success: function (response) {
        if (response.loginResult === "로그인 성공") {
          alert(response.loginResult);
          window.location.href = "/";
        } else {
          alert(response.loginResult);
        }
      },
      error: function (request, e) {
        alert("코드=" + request.status + " 메세지=" + request.responseText + " 오류=" + e);
      }

    })
  }
})
$('#id-search-button').on('click', function () {
  location.href = "findId";
})
$('#pw-search-button').on('click', function () {
  location.href = "findPw";
})
