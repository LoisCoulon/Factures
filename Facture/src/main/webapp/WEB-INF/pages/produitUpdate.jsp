<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Modification produit</title>
</head>
<body>
<div class="container">
<%@include file="menu.jsp" %>

<h1>Formulaire de modification</h1>

<form action="produits" method="post">
	<label for="libelleProduit">Libelle</label>
	<input type="text" name="libelleProduit"/>
	<input type="hidden" value="formUpdate" name="actionPost"/>
	
	<input type="submit" value="valider"/>

</form>
</div>
</body>
</html>