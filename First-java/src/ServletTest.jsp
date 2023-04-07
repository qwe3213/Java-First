<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>paramTestPro.jsp</h2>

	<%
	 request.setCharacterEncoding("UTF-8");
 	 String id = request.getParameter("id");
	 int age = Integer.parseInt(request.getParameter("age"));

	%>

     id :<%=id %><br>
     id(el) : ${id }<br>
     id(el) : ${param.id} <br>
     age : <%=age + 100 %><br>
     age(el) : ${param.age + 100}<br>
     <%

 	String menu1 = request.getParameter("menu");
 	String menu2 = request.getParameter("menu");
 	String[] menu = request.getParameterValues("menu");
     %>
     menu : <%=menu[0] %><br>
     menu2 : <%=menu[1] %><br>
     menu(el) : ${paramValues.menu[0] } <br>
     menu2(el) : ${paramValues.menu[1] } <br>
     <%
      String[] hobbys = request.getParameterValues("hobbys");
        if(hobbys !=null){
      for(int i = 0 ; i < hobbys.length; i++){
    	    %>
    	checkbox1(el) : ${paramValues.hobbys }<br>
    	    취미 <%=i%> : <%=hobbys[i] %>

    	    <%
      }
      }
      %>
       <h2>el표현식은 jsp 반복문을 통한 반복이 불가능. => JSTL - foreach문 사용</h2>
        취미 1: ${paramValues.hobbys[0] }
		취미 2: ${paramValues.hobbys[1] }
		취미 3: ${paramValues.hobbys[2] }
     <!-- el 표현식은 param데이터 자동으로 캐스팅(형변환) -->

</body>
</html>