<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Insert Data</h2>

   <div id="box">
    <form action="register" method="post">
        <label for="firstName">First Name:</label>
        <input type="text" name="firstname" required><br><br>
        
        <label for="lastName">Last Name:</label>
        <input type="text"  name="lastname" required><br><br>
        
        <label for="email">Email:</label>
        <input type="email"name="email"  style='margin-left:33px'required><br><br>
        
        <input type="submit" value="Submit">
        
        <input type="reset" value="Cancel">
    </form>
    
    </div>
</body>
</html>