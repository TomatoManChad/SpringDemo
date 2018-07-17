<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>

<html>
<head>
<title>Customer Registration Form</title>

<style>
.error {
	color: red
}
</style>
</head>

<body>
<h2>Customer Form</h2>
<hr>
	<i>Fill out Form. Asterisk(*) means required field.</i>
	<br>
	<br>
	<form:form action="processForm" modelAttribute="customer"> <!-- procressForm used in CustomerController -->
		<!-- modelAttribute is the java class "customer" -->
			First name: <form:input path="firstName" />
		<br>
		<br>
			Last name: (*)<form:input path="lastName" /> <!-- path is the variable in customer java class -->
		<form:errors path="lastName" cssClass="error" />
		<br>
		<br>
			Free passes: <form:input path="freePasses"/>
			<form:errors path="freePasses" cssClass="error" />
		<br>
		<br>
			PostCode: <form:input path="postCode"/>
			<form:errors path="postCode" cssClass="error" />
		<br>
		<br>
		<input type="submit" value="Submit" />
	</form:form>


</body>
</html>