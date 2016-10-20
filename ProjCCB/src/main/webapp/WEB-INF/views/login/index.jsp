<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
<link href="resources/css/bootstrap.css" rel="stylesheet"/>
</head>
<body>
	<br />
	<br />
	<form action="principal" method="get">
		<div class="col-md-3 col-md-offset-4">
			<h1>Login</h1>
			<br />
			<br />
			<div class="form-group">
				<label>Usuário</label> <input type="text" class="form-control">
			</div>
			<div class="form-group">
				<label>Senha</label> <input type="password" class="form-control">
			</div>
			<div class="form-group">
				<input type="submit" value="Login" class="btn btn-primary">
			</div>
		</div>
	</form>
	</div>
</body>
</html>