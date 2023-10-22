<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="sp" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<a href="/home?lang=en">ENG</a>
<a href="/home?lang=ru">RUS</a>


<sp:message code="label.title"/>


<form action="/home" method="post">
    <input type="text" name="name" placeholder="name of book"> ${nameError} <br>
    <input type="number" name="pages" placeholder="pages"> ${pagesError} <br>
    <input type="submit" value="Add">
</form>

<ul>

    <c:forEach var="book" items="${books}">
        <li> ${book.name} - ${book.pages} </li>
    </c:forEach>

</ul>

</body>
</html>
