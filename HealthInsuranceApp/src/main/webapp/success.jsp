<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.healthapp.model.Plan"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%--<% Plan plan = (Plan) request.getAttribute("plan"); %>
PlanName<%= plan.getPlanName() %> <br>
Category<%= plan.getCategory() %> <br>
Brand<%= plan.getBrand() %> <br>
Coverage<%= plan.getCategory() %>
SumInsured<%= plan.getSumInsured() %> --%>

<h1> Using expression language </h1>
PlanName :- ${plan.planName} <br>
Category :- ${plan.category } <br>
Brand :- ${plan.brand} <br>
SumInsured :- ${plan.sumInsured} <br>
Coverage :- ${plan.coverage} <br>

</body>
</html>