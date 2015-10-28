<html>
<head>
<title>Login</title>
</head>
<body>
<h1>Login</h1>
Please enter your username and password
<form action="<%=request.getContextPath()%>/loginsubmit" method="POST">
<p>Username: <input type="text" name="username" length="40">
<p>Password: <input type="password" name="password" length="40">
<p><input type="submit" value="Submit">
</form>
</body>
</html>