<%--
  Created by IntelliJ IDEA.
  User: PULSE GL76
  Date: 11/1/2025
  Time: 1:20 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="springForm" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="springform" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <springForm:form modelAttribute="student" action="process-form">
        <springForm:input path="firstName" />
        <springForm:input path="lastName" />
        <springForm:select path="country">
            <springForm:options items="${countryOptions}" />
        </springForm:select>
        <br><br>
            Favorite Language:
            Java <springForm:radiobutton path="favoriteLanguage" value="java"/>
            PHP <springForm:radiobutton path="favoriteLanguage" value="php"/>
            RUBY <springForm:radiobutton path="favoriteLanguage" value="ruby"/>

        <br><br>
        <input type="submit" value="submit">
    </springForm:form>
</body>
</html>
