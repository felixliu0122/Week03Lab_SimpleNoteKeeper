<%-- 
    Document   : viewnote
    Created on : Oct 12, 2020, 8:02:32 PM
    Author     : 553582
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>--%>
<!DOCTYPE html>
<html>
        <a href="../../src/java/servlets/NoteServlet.java"></a>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Week 3 Lab - Simple Note Keeper - View Note</title>
    </head>
    <body>
        <h1>Simple Note Keeper!</h1>
        <h2>View Note</h2>
        <p>
            <b>Title: </b>
            ${Note.title}
        </p>
        <p>
            <b>Contents: </b>
            <br>
            ${Note.contents}
        </p>
        <a href="note?edit">Edit</a>
    </body>
</html>
