<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String title = (String)request.getAttribute("mytitle");
out.print("Title is : "+title+"<br>");
out.print("Author name is : "+request.getAttribute("author")+"<br>");
out.print("Category is : "+request.getAttribute("category")+"<br>");

Integer bookId =(Integer)request.getAttribute("bookId");
out.print("Book id is : "+bookId+"<br>");

Double price = (Double)request.getAttribute("price");
out.print("Price of the book is : "+price+"<br>");
%>

</body>
</html>