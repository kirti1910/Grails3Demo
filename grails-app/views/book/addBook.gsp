<%--
  Created by IntelliJ IDEA.
  User: ttnd
  Date: 3/5/17
  Time: 5:25 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>

    <meta name="layout" content="main">
</head>

<body>

<g:form action="saveBook" controller="book">

    <label>Name</label>   <g:textField name="name"></g:textField><br>
    <label>Price</label>     <g:textField name="price"></g:textField> <br>

    <g:submitButton name="submit" value="Add new Book"/>


</g:form>



</body>
</html>