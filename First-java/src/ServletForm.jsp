<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <h1>paramTest.jsp</h1>

   <h2>EL(Expression Language) : 표현식 언어 </h2>

   <%-- JSP 표현식<%= %>, out.print(); 대체하는 표현방식 --%>

   <%--   ${변수 / 연산 / 객체.변수 / 객체['변수']} --%>
   <!-- EL표현식 내장객체 : pageScope, requestScope,sessionScope,applicationScope
                            param,paramValues,header,headerValues,
                            cookie,initParam, pageContext
    -->
    <form action="paramTestPro.jsp" method="post">
      ID : <input type = "text" name ="id"><br>
      AGE : <input type="text" name="age"><br>
      Menu : <input type="text" name="menu"><br>
      Menu2 : <input type="text" name="menu"><br>

      <input type="checkbox" name="hobbys" value="게임">게임
      <input type="checkbox" name="hobbys" value="요리">요리
      <input type="checkbox" name="hobbys" value="운동">운동
       <input type="submit" value="전송">
    </form>




</body>
</html>