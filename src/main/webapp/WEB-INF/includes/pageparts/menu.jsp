<%--
  ~ Copyright (c) 2019 Parallax Inc.
  ~
  ~ Permission is hereby granted, free of charge, to any person obtaining a copy of this software
  ~ and associated documentation files (the “Software”), to deal in the Software without
  ~ restriction, including without limitation the rights to use, copy, modify, merge, publish,
  ~ distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the
  ~ Software is furnished to do so, subject to the following conditions:
  ~
  ~ The above copyright notice and this permission notice shall be included in all copies or
  ~ substantial portions of the Software.
  ~
  ~ THE SOFTWARE IS PROVIDED “AS IS”, WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
  ~ IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
  ~ FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
  ~ AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
  ~ LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
  ~ OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
  ~ SOFTWARE.
  --%>

<%--
    Document   : menu
    Created on : 4-nov-2015, 20:39:22
    Author     : Michel

    Display the horizontal menu across the top of the banner
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/includes/include.jsp"%>
<nav class="navbar navbar-default">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar-collapse">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" id="nav-logo" href="<url:getUrl url="/"/>">BlocklyProp</a>
        </div>
        <div class="collapse navbar-collapse" id="navbar-collapse">
            <%-- Projects and privacy notice links --%>
            <ul class="nav navbar-nav">
                <li>
                    <a href="<url:getUrl url="/projects.jsp"/>"><fmt:message key="menu.community_projects" /></a>
                </li>

                <%-- Include the user projects if the user is logged in --%>
                <shiro:authenticated>
                <li>
                    <a href="<url:getUrl url="/my/projects.jsp"/>"><fmt:message key="menu.my_projects" /></a>
                </li>
                </shiro:authenticated>

                <li>
                    <a href="<url:getUrl url="/projectcreate.jsp?lang=PROPC"/>"><fmt:message key="menu.newproject.title" /></a>
                </li>
                <li>
                    <a href="<url:getUrl url="/privacy-policy"/>"><fmt:message key="menu.privacy" /></a>
                </li>
            </ul>

            <%-- Register / Login / Help --%>
            <ul class="nav navbar-nav navbar-right">
                <%-- Menu items for an anonymous user --%>
                <shiro:notAuthenticated>
                <li>
                    <a href="<url:getUrl url="/login.jsp"/>"><fmt:message key="menu.login_and_register" /></a>
                </li>
                </shiro:notAuthenticated>

                <%-- Menu items for an authenticated user --%>
                <shiro:authenticated>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true">
                        <%-- Display logged in user email address --%>
                        <shiro:principal>&nbsp;</shiro:principal><span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="<url:getUrl url="/profile"/>"><fmt:message key="menu.profile" /></a></li>
               <%--     <li><a href="<url:getUrl url="/public/profile"/>"><fmt:message key="menu.public-profile" /></a></li> --%>
                        <li><a href="<url:getUrl url="/logout"/>"><fmt:message key="logout" /></a></li>
                    </ul>
                </li>
                </shiro:authenticated>

                <%-- Help link to the Learn reference section --%>
                <li><a href="https://learn.parallax.com/ab-blocks" target="_blank"><fmt:message key="menu.help" /></a></li>

                <%-- Set the launguage for the site
                <li class="navbar-text">
                    <form style="margin-bottom: 0;">
                        <select id="language" name="language" onchange="submit()">
                            <option value="en" ${language == 'en' ? 'selected' : ''}>English</option>
                        </select>
                    </form>
                </li>
                --%>
            </ul>
        </div>
    </div>
    
    <%-- Message of the Day goes here. --%>
    <div class="container-fluid" style="background:#FAE6A4; color:#8a6d3b; padding:10px; display: none;" id="message-of-the-day">
        <div class="row">
            <div class="col-sm-12" align="center">
                <a id="message-of-the-day-link" href="http://learn.parallax.com/node/1692" target="_blank" style="color:#8a6d3b;">
                    <span id="message-of-the-day-text"></span>
                </a>
            </div>
        </div>
    </div>
</nav>
