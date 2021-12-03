<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="customers" class="com.hccs.advweb.CustomerList"
		scope="session"></jsp:useBean>
	<%
	ArrayList<com.hccs.advweb.Customer> cusList = customers.getCusList();
		for (com.hccs.advweb.Customer customer : cusList) {
			//System.out.print(customer.getId()+customer.getName()+customer.getEmail()+customer.getPhone()+cus);
	%>
	<span>Name: <%=customer.getCusName()%>,</span>
	<span>Email: <%=customer.getCusEmail()%>,</span>
	<span>Message: <%=customer.getCusMessage()%>,</span>
	<span>Subject: <%=customer.getCusSubject()%>.</span></br>
	<%}%>
</body>
</html>