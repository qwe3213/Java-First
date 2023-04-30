<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="../js/jquery-3.6.4.js"></script>
<script type="text/javascript">
 $(document).ready(function(){
	   // html() - 해당요소의 값을 가져오기,
	   // text() -
	   var h = $('h2').html();
	   var t = $('h2').text();

	   // 화면에 내용 출력(기존내용 변경)
	 //  $('h2').html("ITWILL");

	   $('h2').text("BUSAN");


	//   $('div').html(" <h3>ITWILL BUSAN</h3>");
	  // $('div').text("ITWILL BUSAN2");

	  // html 태그를 출력할때 html 태그를 적용해서 출력해주고,
	  // text는 단순 텍스트 출력

	  // 기존의 내용 + 변경내용 적용 가능
	   /* $('div').html(function(i,txt){
		  //	alert(txt);
		    return "<h3>" + txt+ " itwill busan " +"</h3>";
	   });
	   */
	  // append() , prepend()

	  $('div').append(function(idx){

		  return idx;
	  });

	   //	  $('div').prepend("$$$$$");

	   //
//	   $('tr').append("<tr><td>홍길동</td><td>부산</td><td>남</td></tr>");

	   /* for(var i = 0 ; i < 5;  i ++){
	   $('table').append("<tr><td>홍길동</td><td>부산</td><td>남</td></tr>");

	   } */

	     // JSON 형태
	     // [] 배열, {} 객체

	   var data = [
		   {'name':'학생1','address':'부산','gender':'남'},
		   {'name':'학생2','address':'울산','gender':'여'},
		   {'name':'학생3','address':'대구','gender':'남'},
		   {'name':'학생4','address':'서울','gender':'여'},
		   {'name':'학생5','address':'대전','gender':'남'}
		   ];
      // alert(data[0].name);
	  // $.each(대상, function);
	  // $대상.each(function);
	  // => 선택한 여러개의 요소를 순차적으로 접근
	  $.each(data,function(idx,obj){
          // alert("!");
	    var tmp = "";
	    tmp += "<tr>";
	    tmp += "<td>"+obj.name+"</td>" ;    //  tmp += "<td>"+data[idx].name+"</td>" ;
	    tmp += "<td>"+obj.address+"</td>" ; // tmp += "<td>"+data[idx].address+"</td>" ;
	    tmp += "<td>"+obj.gender+"</td>" ; // /tmp += "<td>"+data[idx].gender+"</td>" ;
	    tmp += "</tr>" ;
	      //  console.log(obj);
//	      $('table').append("<tr><td>"+obj.name+"</td><td>"+obj.address+"</td><td>"+obj.gender+"</td></tr>");
	      $('table').append(tmp);

	  });
	  $('img').css('width','150');

	   setInterval(() => {

	  $('.imgDiv').append($('img').first());

	    }, 1000);



 });
 </script>
</head>
<body>

	<h1>속성조작메서드.jsp</h1>

    <h2> head - 0</h2>
    <h2> head - 1</h2>
    <h2> head - 2</h2>

    <hr>
    <div> 00000 -  </div>
    <div> 00000 -  </div>
    <div> 00000 -  </div>

    <hr>
    <table border="1">
      <tr>
       <td>이름</td>
       <td>지역</td>
       <td>성별</td>
      </tr>

    </table>

      <hr>

      <div class="imgDiv">

      <img src="../img/altar.jpg" >
      <img src="../img/building.jpg" >
      <img src="../img/cat.jpg" >

      </div>





</body>
</html>