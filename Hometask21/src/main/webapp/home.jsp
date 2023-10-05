<%@ page import="java.util.List" %>
<%@ page import="org.tms.ht.domain.Device" %>
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
<ul>
<%

    Object devices = request.getAttribute("devices");

    if (devices != null) {
        List<Device> devicesList = (List<Device>) request.getAttribute("devices");
        for (Device device : devicesList) {
            out.println("<li>" + device.getType() + " " + device.getBrand() + "</li>");
        }
    }
%>
</ul>


</body>
</html>
