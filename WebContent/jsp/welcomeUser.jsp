<%@page import ="com.bov.* ,java.util.*"%>
<!--  Import the files that you want to use -->
<html>
<body>
<jsp:include page="/common/header.jsp"></jsp:include>
Today is <%=new Date() %>
Hello <%=session.getAttribute("user") %>  <br></br>

<%=  com.bov.helper.JspTester.greeting("Junaid")%>

Your Account  Number is <%=session.getAttribute("accountNumber") %>

Your user name is <%=session.getAttribute("s") %>

your password is <%=session.getAttribute("passcode") %>

</body>

</html>