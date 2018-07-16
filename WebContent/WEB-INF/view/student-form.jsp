<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<title>Registration Form</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
		<!-- processForm mapping from StudentController and student from StudentController -->
					
					First name: <form:input path="firstName" />
		<br>
		<br>
					
					Last name: <form:input path="lastName" />

		<br>
		<br>
					
					Country: 
					<form:select path="country">
			<!--  spring calls student.getCountryoptions() in this bit -->
			<form:options items="${student.countryOptions}" />
		</form:select>
		<br>
		<br>
					Favourite Language:
					<form:radiobuttons path="favouriteLanguage" items ="${student.languageOptions}" />
					
					<!-- Java<form:radiobutton path="favouriteLanguage" value="Java"/>
					c£<form:radiobutton path="favouriteLanguage" value="c£"/>
					PHP<form:radiobutton path="favouriteLanguage" value="PHP"/>
					Ruby<form:radiobutton path="favouriteLanguage" value="Ruby"/> -->
		
		<br>
		<br>
					Operating Systems:
					Linux <form:checkbox path="operatingSystems" value="Linux"/>
					MAC OS <form:checkbox path="operatingSystems" value="MAC OS"/>
					MS Windows <form:checkbox path="operatingSystems" value="MS Windows"/>
		<br>
		<br>	
		
		<input type="submit" value="submit" />

	</form:form>


</body>
</html>