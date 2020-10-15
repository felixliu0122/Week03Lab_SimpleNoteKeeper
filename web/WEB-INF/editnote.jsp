<%-- 
    Document   : editnote
    Created on : Oct 12, 2020, 8:02:43 PM
    Author     : 553582
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>--%>
<!DOCTYPE html>
<html>
    <a href="../../src/java/servlets/HelloWorldServlet.java"></a>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Week 3 Lab - Simple Note Keeper - Edit Note</title>
    </head>
    <body>
        <h1>Simple Note Keeper!</h1>
        <form method="POST" action="note">
        <h2>Edit Note</h2>
        <p>
            <b>Title:</b>
            <input type="text" name="title" value="${Note.title}"></input>
        </p>
        <p>
            <b>Contents:</b>
            <textarea name="contents">${Note.contents}</textarea>
        </p>

        <p>
            <input type="submit" name="save" value="Save">
        </p>
        </form>
    </body>
</html>
