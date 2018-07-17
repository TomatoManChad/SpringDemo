<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<title>Customer Confirmation</title>
</head>
<body>
	<h2>Customer Confirmed</h2>
	<hr>
	The customer is confirmed: ${customer.firstName} ${customer.lastName}
	<br>
	<br>
	Free passes: ${customer.freePasses}
	<br>
	<br>
	PostCode: ${customer.postCode}
	<br>
	<br>
	Course Code: ${customer.courseCode}
	<br>
	<br>
	<a href="/spring-mvc-demo"> go to home</a>
	<br>
	<br>
</body>
</html>