<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Form</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"
	integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N"
	crossorigin="anonymous">
<style>
/* CSS styles for the registration form container */
.registration-container {
	width: 600px;
	margin: 0 auto;
	padding: 20px;
	border: 2px solid #ccc;
	border-radius: 10px;
	background-color: #f9f9f9;
}
/* CSS styles for the heading */
.registration-heading {
	text-align: center;
}
/* CSS styles for input fields */
.input-field {
	width: 100%;
	padding: 8px;
	margin: 5px 0;
	box-sizing: border-box;
}
</style>
</head>
<body>

	<div class="registration-container">

		<h2 class="registration-heading">Registration Details</h2>
		<p>
			<strong>First Name:</strong> ${param.firstname}
		</p>
		<p>
			<strong>Last Name:</strong> ${param.lastname}
		</p>
		<p>
			<strong>Email:</strong> ${param.email}
		</p>
		<p>
			<strong>Mobile Number:</strong> ${param.mobile}
		</p>
		<p>
			<strong>Address:</strong> ${param.address}
		</p>
		<p>
			<strong>Branch:</strong> ${param.branch}
		</p>
		<p>
			<strong>Year:</strong> ${param.year}
		</p>
		<p>
			<strong>Percentage:</strong> ${param.percentage}
		</p>
	</div>
	<div class="registration-container">
		<h2 class="registration-heading">Registration Form</h2>
		<form name="frm" action="index" method="post">
			<label for="firstname">First Name:</label> <input type="text"
				id="firstname" name="firstname" class="input-field" required><br>
			<label for="lastname">Last Name:</label> <input type="text"
				id="lastname" name="lastname" class="input-field" required><br>
			<label for="email">Email:</label> <input type="email" id="email"
				name="email" class="input-field" required><br> <label
				for="mobile">Mobile Number:</label> <input type="tel" id="mobile"
				name="mobile" class="input-field" required><br> <label
				for="address">Address:</label>
			<textarea id="address" name="address" class="input-field" required></textarea>
			<br> <label for="branch">Branch:</label> <input type="text"
				id="branch" name="branch" class="input-field" required><br>
			<label for="year">Year:</label> <input type="text" id="year"
				name="year" class="input-field" required><br> <label
				for="percentage">Percentage:</label> <input type="text"
				id="percentage" name="percentage" class="input-field" required><br>
			<input type="submit" class="btn btn-outline-primary" value="Register"
				name="register">
		</form>
	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"
		integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct"
		crossorigin="anonymous"></script>
</body>
</html>
