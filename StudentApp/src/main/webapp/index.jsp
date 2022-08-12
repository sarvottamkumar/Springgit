<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="register">
Enter Name<input type="text" name="name"><br>
Enter Id<input type="text" name="studentid"><br>
Enter City<input type="text" name="city"><br>


Choose Langauge<select name="language">
<option value="select">------select---</option>
<option value="java">Java</option>
<option value="jsp">Jsp</option>
<option value="spring">Spring</option>
<option value="Hibernet">Hibernet</option>

</select><br>

Hobby <input type="checkbox" value="music" name="hobby">Music
<input type="checkbox" value="dance" name="hobby">Dance
<input type="checkbox" value="sports" name="hobby">Sports
<input type="checkbox" value="reading" name="hobby">Reading

<input type="submit" value="Register"><br>

</form>



</body>
</html>