<%--
    Document   : projects
    Created on : 24-mei-2015, 18:41:02
    Author     : Michel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/includes/include.jsp"%>

<html>
    <head>
        <meta name="base" content="<url:getUrl url="/"/>">
        <%@ include file="/WEB-INF/includes/pageparts/head/basic.jsp"%>
    </head>
    <body>

        <%@ include file="/WEB-INF/includes/pageparts/menu.jsp"%>

        <%@ include file="/WEB-INF/servlet/help/menu.jsp"%>

        <div class="container">
            <div class="row">
                <div class="col-md-12">

                    <%
                        Boolean notFound = (Boolean) request.getAttribute("help-not-found");
                        if (notFound != null && notFound) {
                    %>
                    <h2><fmt:message key="help.not-found" /></h2>
                    <% }
                        Boolean invalidPath = (Boolean) request.getAttribute("help-invalid-path");
                        if (invalidPath != null && invalidPath) {
                    %>
                    <h2><fmt:message key="help.invalid-path" /></h2>
                    <% }%>

                </div>
            </div>
        </div>

        <%@ include file="/WEB-INF/includes/pageparts/footer.jsp"%>

    </body>
</html>