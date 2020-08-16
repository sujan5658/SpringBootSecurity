<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Public Page 2</title>
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
		<h3>Public Page 2</h3>
		<p>
			This is second public page which can be accessed by all users.<br>
			Even he/she doesnot have any role. he/she can access this page.
		</p>
	</div>
</body>
</html>