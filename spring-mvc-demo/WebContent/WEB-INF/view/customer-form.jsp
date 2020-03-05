<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<html>

<head>
<title>Customer Registration Form</title>
		<style>
			.error {color:red}
			.header{color:red}
		</style>
</head>

<body>

	<i Class="header" >Fill out the form. (*) means required!</i>
	<!-- class="header" is for styling purpose -->
	<br>
	<br>

	<form:form action="processForm" modelAttribute="customer">
	
		First Name: <form:input path="firstName" />
		<br>
		<br>
		
		Last Name (*): <form:input path="lastName" />
		<form:errors path="lastName" cssClass="error"></form:errors> <!-- this will display error message if customer doesn't follow
																	 required rules -->
		<br>
		<br>

		<input type="submit" value="submit" >

	</form:form>

</body>


</html>