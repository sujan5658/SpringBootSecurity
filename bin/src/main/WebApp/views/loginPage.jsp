<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/bootstrap.min.css" />
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/popper.min.js"></script>
<style type="text/css">
body {
	background-color: #8000ff;
}
</style>
</head>
<body>
	<c:if test="${not empty SPRING_SECURITY_LAST_EXCEPTION.message}">
		${SPRING_SECURITY_LAST_EXCEPTION.message}
	</c:if>
	<c:remove var = "param.error" scope = "session" />
	<div class="container" style="padding: 20px">
		<form action="loginPage" method="post">
			<div class="card" style="width: 18rem; margin: auto">
				<img src="${pageContext.request.contextPath}/images/login.jpg"
					class="card-img-top" alt="Login">
				<div class="card-body">
					<div class="form-group">
						<label for="userName">User Name :</label> <input type="text"
							class="form-control" name="username" placeholder="User Name" />
					</div>
					<div class="form-group">
						<label for="userPass">Password :</label> <input type="password"
							name="password" class="form-control" placeholder="*******" />
					</div>
				</div>
				<div class="card-footer">
					<button type="submit" class="btn btn-primary">Login</button>
				</div>
			</div>
		</form>
	</div>
</body>
</html>