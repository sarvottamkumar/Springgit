<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.policyapp.model.Policy"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<% Policy policy = (Policy) request.getAttribute("policy"); %>
Policy Name : <%= policy.getPolicyName() %> <br>
Policy Number : <%= policy.getPolicyNumber() %> <br>
Premium : <%= policy.getPremium() %> <br>
Type : <%= policy.getType() %>   <br>
Category : <%= policy.getCategory() %> <br>
Duration : <%= policy.getDuration() %> <br>
Brand : <%= policy.getBrand() %> <br>
Coverage : <%= policy.getCategory() %><br>
SumInsured : <%= policy.getSumInsured() %><br>

</body>
</html>