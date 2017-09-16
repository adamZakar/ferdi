<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.zakar.ferdaus.controller.WelcomeController" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ferdaus Mommand</title>
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>
	<link rel="stylesheet" href="resources/css/style.css">

</head>
<body>

<div class="header_default fixed">
	<div class="container">
		<span><img src="resources/images/hu.jpg" width=20px action=/hu/></span>
		<span><img src="resources/images/en.jpg" width=20px action=/en /></span>
		<span><img src="resources/images/pa.jpg" width=20px action=/pa/></span>
		<span><img src="resources/images/ur.jpg" width=20px action=/ur/></span>
		<span><img src="resources/images/pe.jpg" width=20px action=/pe/></span>
	</div>
	<div>
		<span><c:out value="${services}"></c:out> </span>
		<span><c:out value="${references}"></c:out> </span>
		<span><c:out value="${inquiry}"></c:out> </span>
		<span><c:out value="${contact}"></c:out> </span>
	</div>
</div>
<div class="entry-header clearfix">
	<div class="container">
		<c:out value="${header_text}"></c:out>
	</div>
</div>
<img src="resources/images/image.jpg" width=500px/>
</body>
</html>