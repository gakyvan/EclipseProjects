<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="y"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CRM</title>
</head>
<body>
	<div id="wrapper">
		<div id="header">CRM - Customer Relationship Manager</div>
	</div>
	<div id="container">
		<div id="content">
			<table>
				<thead>
					<tr>
						<th>First Name</th>
						<th>Last Name</th>
						<th>E-mail Address</th>
					</tr>
				</thead>
				<tbody>
					<y:forEach var="cst" items="${customers}">
						<tr>
							<td>${cst.firstName}</td>
							<td>${cst.lastName }</td>
							<td>${cst.emailAddress}</td>
						</tr>
					</y:forEach>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>