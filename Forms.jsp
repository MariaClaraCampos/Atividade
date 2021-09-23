<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dados Pessoais</title>
</head>
<body>
	<h2>Formulário de Dados Pessoais:</h2>
	<form action="ServletForms1"  method="post">
	Nome: <input type="text" name="nome"/><br>
	Sobrenome: <input type="text" name="sobrenome"><br>
	CPF: <input type="text" name="CPF"><br>
	Telefone: <input type="text" name="telefone"><br>
	Email: <input type="email" name="email"><br>
	Estado Civil: <input type="text" name="estado civil"><br>
	<br><h5>Antes de enviar confira se seus dados estão corretos.</h5><br>
	<input type="submit" value="Enviar"/> 	
	
	</form>
</body>
</html>
