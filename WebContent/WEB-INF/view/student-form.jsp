<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
	<html>
		<head>
			<title>Registration Form</title>
		</head>
		<body>
				<form:form action = "processForm" modelAttribute="student"> <!-- processForm mapping from StudentController and student from StudentController -->
					
					First name: <form:input path="firstName"/>
					<br><br>
					
					Last name: <form:input path="lastName"/>
					
					<br><br>
					
					<input type ="submit" value ="submit" />
					
				</form:form>


		</body>
	</html>