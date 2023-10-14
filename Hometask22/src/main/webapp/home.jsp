<%@ page import="java.util.List" %>
<%@ page import="org.tms.ht.domain.Device" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <Title>Title</Title>
</head>
<body>

<h1>Devices list:</h1>
<hr>
<h2>Add device:</h2>

<form action="/add" method="post">
    Type:<input type="text" name="typeToAdd"><br><br>
    Brand:<input type="text" name="brandToAdd"><br>
    <input type="submit" value="add">
</form>

<hr>
<h2>Search device by brand:</h2>
<form action="/search" method="post">
    Device brand: <input type="text" name="brandToSearch"><br>
    <input type="submit" VALUE="search">
</form>

<c:forEach items="${devices}" var="device">

    <form action="/delete" method="post">
    <li>
        Type: ${device.type} - Brand: ${device.brand}
        <input type="hidden" name="deleteById" value="${device.uuid}">
        <input type="submit" value="delete">
    </li>
    </form>

</c:forEach>

</body>
</html>
