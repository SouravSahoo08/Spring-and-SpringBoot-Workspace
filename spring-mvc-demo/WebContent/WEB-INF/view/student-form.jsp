<!-- For using Spring Form tag -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>

<head>
<title>Student Form</title>
</head>

<body>
	<h3>Enter your data</h3>
	<form:form action="processForm" modelAttribute="student">
	
		First Name : <form:input path="firstName" />
		<br>
		<br>
		Last Name : <form:input path="lastName" />
		<br>
		<br>
		<input type="submit" value="Submit" />

	</form:form>
</body>

</html>