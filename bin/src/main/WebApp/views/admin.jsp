<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Page</title>
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
		<h3>This is Admin Page.</h3>
		<p>
			This page can be accessed by ony Admin not by others.
		</p>
		<hr>
		<a href="logout"><button type="button" class="btn btn-danger">Logout</button></a>
	</div>
</body>
</html>