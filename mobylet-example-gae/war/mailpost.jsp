<%@page pageEncoding="UTF-8"%>
<%@taglib prefix="m" uri="http://taglibs.mobylet.org/" %>
<%@page import="org.mobylet.mail.MobyletMailer"%>
<%@page import="org.mobylet.mail.message.*"%>
<html>
<head>
<title>mobylet-example - Hello World!</title>
</head>
<body>
<div>Mail-Sended</div>
<%
	try {
    	MobyletMessage message = MobyletMailer.createMessage(request.getParameter("address"));
    	MessageBody body = new MessageBody();
    	body.setHtml("<html><body>テストHTML</body></html>");
    	body.setText(request.getParameter("body"));
    	message.from("s.takeuchi.leihauoli@gmail.com")
    		.subject(request.getParameter("subject"))
    		.setBody(body);
    	MobyletMailer.send(message);
	} catch (Exception e) {
		throw new ServletException(e);
	}

%>
</body>
</html>