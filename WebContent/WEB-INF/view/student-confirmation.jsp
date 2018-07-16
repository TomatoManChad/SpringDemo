<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
	<html>
		<head>
			<title>Confirmation</title>
		</head>
		<body>
		<!-- spring will call getters eg. student.getFirstName -->
		The Student is confirmed: ${student.firstName} ${student.lastName} 
		<br>
		Country: ${student.country} 
		<br>
		Favourite Language: ${student.favouriteLanguage}
		<br>
		Operating Systems: 
			<ul>
				<c:forEach var = "temp" items="${student.operatingSystems}">
				<li>
				${temp}
				</li>
				</c:forEach>
			</ul>
		
		</body>
		</html>