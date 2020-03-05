<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>

<html>

<head>
<title>Student Registration Form</title>
</head>

<body>

	<form:form action="processForm" modelAttribute="student" method="post">
		
		First Name: <form:input path="firstName" />
		<br>
		<br>
		Last Name: <form:input path="lastName" />
		<br>
		<br>
		
		Country:
		<form:select path="country">

			<%--
			 
			<form:option value="" label=""></form:option>
			<form:option value="Brazil" label="Brazil"></form:option>
			<form:option value="Ethiopia" label="Ethiopia"></form:option>
			<form:option value="Germany" label="Germany"></form:option>
			<form:option value="England" label="England"></form:option>
			<form:option value="France" label="France"></form:option>
			<form:option value="United States" label="United States"></form:option>
			
			instead of hard coding all these lists, we can populate the list from a java class (Student.java) as shown below.
			
			 --%>

			<form:options items="${student.countryList}" />

		</form:select>
		<br>
		<br>

		<!-- Radio button setup! -->
		Favorite Programming Languages: 
		
		Java <form:radiobutton path="favoriteLanguage" value="Java" />
		C# <form:radiobutton path="favoriteLanguage" value="C#" />
		PHP <form:radiobutton path="favoriteLanguage" value="PHP" />
		Ruby <form:radiobutton path="favoriteLanguage" value="Ruby" />
		<!-- we can populate these radio buttons items from a java class, see section 136 -->
		<br>
		<br>

		<!-- Check box setup! when we build check box buttons, if user selects multiple boxes, then we have to save these selected items
		in an array of Strings! -->

		<br>
		<br>
		
		Operating Systems:
		
		Linux <form:checkbox path="operatingSystems" value="Linux" /> 
			Mac OS <form:checkbox path="operatingSystems" value="Mac OS" /> 
				MS Windows <form:checkbox path="operatingSystems" value="MS Windows" />



		<br>
		<br>
		<input type="submit" value="submit">

	</form:form>


</body>
</html>
