<%--
    Document   : login
    Created on : 24-mei-2015, 18:41:02
    Author     : Michel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="WEB-INF/includes/include.jsp"%>

<html>
    <head>
        <link type="text/css" rel="stylesheet" href="<c:url value="/resources/style.css"/>" />
        <link rel="stylesheet" href="<c:url value="/resources/bootstrap/core/css/bootstrap.min.css"/>" />
        <link rel="stylesheet" href="<c:url value="/resources/bootstrap/plugins/bootstrap-table.min.css"/>" />
        <script src="<c:url value="/resources/jquery-1.11.3.min.js"/>" ></script>
        <script src="<c:url value="/resources/bootstrap/plugins/bootstrap-table.min.js"/>" ></script>
    </head>
    <body>

        <h2>Hello <shiro:principal/></h2>

        <table data-toggle="table" data-url="<c:url value="/rest/sharedproject/list"/>" data-side-pagination="server" data-pagination=true" data-search="true">
            <thead>
                <tr>
                    <th data-field="name">Name</th>
                    <th data-field="description">Description</th>
                    <th data-field="type">Type</th>
                </tr>
            </thead>
        </table>

    </body>
</html>