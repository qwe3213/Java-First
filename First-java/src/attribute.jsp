<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="../js/jquery-3.6.4.js"></script>
<script type="text/javascript">
 $(function(){
	 var c = $('h2').css('color');
	 var arr = ['red','yellow','pink'];
	// $('h2').css('color',arr[2]);

	 $('h2').css('color',function(idx){
		  // alert("func!" + idx) 3번 출력됨
		  // 배열의 컬러로 각각 변경

		  return arr[idx];
	 });

//	 $('h2').css('color',"yellow");
//	 $('h2').css('background',"black");

	 // 체이닝 기법 (선호도 낮음)
	 $('h2').css('color',"yellow").css('background',"black");

	 // 속성을 한번에 여러개 적용
	 $('h2').css({
		 'color': 'blue',
	     'background' : 'black'
	 });
	 // 배경 - 검정, 글자색 - 배열 colArr 색으로 지정
       $('h2').css({
 		 'color': function(idx){
 			 return arr[idx];
 		 },
	     'background' : 'black'
	 });

 });
 </script>
</head>
<body>
	<h1>속성사용.jsp</h1>

	<h2> head - 0</h2>
	<h2> head - 1</h2>
	<h2> head - 2</h2>
	<h2> head - 3</h2>
</body>
</html>