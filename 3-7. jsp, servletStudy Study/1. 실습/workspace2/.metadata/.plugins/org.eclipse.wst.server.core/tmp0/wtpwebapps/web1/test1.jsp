<%@ page contentType="text/html; charset=utf-8"%>
<%!
	int global = 100;
	public int method(int num){
		int local = num;
		return local+global;
	}	
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>test.jsp</title>
</head>
<body>
<%= 3+4 %> <br>
<%= "jdk"+8 %> <br>
global변수 값 : <%= global %> <br>
method(3)호출 결과 : <%= method(3) %> <br>
<hr>
<%
	out.print((3+4)+"<br>");
	out.print("jdk"+8+"<br>");
	out.print("global변수 값:"+global+"<br>");
	out.print("method(5)호출 결과 :"+method(5)+"<br>");
%>
</body>
</html>