<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring Boot</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/bootstrap.min.css" />
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/popper.min.js"></script>
</head>
<body>
	<%@ include file="includes/navbar.jsp"%>
	<div class="container">
		<h3>Spring Boot Security With Page Authentication.</h3>
		<p>This is the demo about spring boot security.<br>
		 Which describes how to authenticate pages to different user according to their ROLE.</p>
	</div>
</body>
</html>