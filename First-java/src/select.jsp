<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script src="../js/jquery-3.6.4.js"></script>
<script type="text/javascript">
 $(document).ready(function(){
	   //CSS,JQuery 선택자

	   // * : 전체 모든 대상
	   $('*').css('color','blue');
	   // 태그 : 특정 태그

	    // 아이디 : 특정 아이디를 가진 대상
	   $('#t1').css('color','green');
	    // 클래스 : 특정 클래스를 가진 대상
	   $('.t2').css('color','yellow');
	// $('input').css('color','pink');
	   $('.t3').css('color','red');
	   $('.t4').css('color','pink');

	   // 요소 속성탐색
	   $('input[type=text]').css('color','#999999');
	// $('input[type=password]').css('color','pink'); 밑의 코드와 동일
	   $('input[type^=p]').css('color','pink');

	 //  alert($('input[type=text]'));
     //  console.log($('input[type=text]'));
	   var obj = $('input[type=text]');
	   console.log(obj.val('321'));
	   console.log(obj.val());

	   $('.tt1').css('background','orange');
	   $('.tt2').css('background','yellow');
	   $('.tt3').css('background','orange');
	   $('.tt4').css('background','yellow');
	   $('.tt5').css('background','orange');

	   //  홀수
	   $('tr:odd').css('background','red');

	   // 짝수
	   $('tr:even').css('background','powderblue');


 });
</script>
<meta charset="UTF-8">
<!-- <style type="text/css">
   *{
    color:red;
    color:#666666;
   }
</style> -->
<title>Insert title here</title>
</head>
<body>

	<h1>선택자(selector).jsp</h1>

	<h2 id ="t1">제목1</h2>
	<h2 class="t2">제목2</h2>
	<h2 id ="t1">제목3</h2>

	<hr>

	아이디 : <input type="text" name="id" class="t3"> <br>
	비밀번호 : <input type="password" name="pw" class="t4"><br>

	<hr>

	<table border="1">
	  <tr class= "tt1">
	    <td>dd</td>
	    <td>dd</td>
	    <td>dd</td>
	  </tr>
	  <tr class= "tt2">
	    <td>dd</td>
	    <td>dd</td>
	    <td>dd</td>
	  </tr>
	  <tr class= "tt3">
	    <td>dd</td>
	    <td>dd</td>
	    <td>dd</td>
	  </tr>
	  <tr class= "tt4">
	    <td>dd</td>
	    <td>dd</td>
	    <td>dd</td>
	  </tr>
	  <tr class= "tt5">
	    <td>dd</td>
	    <td>dd</td>
	    <td>dd</td>
	  </tr>
	</table>

</body>
</html>