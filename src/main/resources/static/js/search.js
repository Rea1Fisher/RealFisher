document.getElementById('search-icon').addEventListener('click',function () {
  var keywordInput = document.getElementById('keyword');
  var keyword = keywordInput.value.trim();
  keywordInput.value = keyword;  // 트림된 값을 다시 input 필드에 저장합니다.
  document.getElementById('search-form').submit();

})