<%--
  Created by IntelliJ IDEA.
  User: Ádám
  Date: 2017. 09. 15.
  Time: 21:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head lang="hu">
    <title><c:out value="${registration}"></c:out></title>
    <link rel="stylesheet" href="/resources/css/registration.css" />
    <link href="https://fonts.googleapis.com/css?family=Caveat+Brush|Lobster" rel="stylesheet">
    <meta name="viewport" content="width=device-width">
</head>
<body>
<div class="logoDiv">
    <h1><c:out value="${inquiry_header}"></c:out> </h1>
</div>

<div id="outerdiv">
    <form id="registrationform" onsubmit="return onsub()">
        <div>
            <input id="lastName" placeholder="Vezetéknév" class="textinput" required autofocus />
        </div>
        <div>
            <input id="firstName" placeholder="Keresztnév" class="textinput" required />
        </div>
        <div>
            <input id="firstEmail" placeholder="e-mail cím" class="eamilinput" required min="3" />
            @
            <input id="lastEmail" placeholder="gmail.com" class="eamilinput" required />
        </div>
        <div>
            <input id="phone" placeholder="Telefonszám" class="textinput" />
        </div>
        <div>
            <select id="education">
                <option value="default"> Iskolai végzettség</option>
                <option value="a">Főiskola/Egyetem</option>
                <option value="b">Érettségi</option>
                <option value="c">Egyéb</option>
            </select>

        </div>

        <div>

            <select id="firstLanguage" class="eamilinput">
            <option value="default"><c:out value="${select_language}"></c:out></option>
            <option value="en"><c:out value="${en}"></c:out></option>
            <option value="pa"><c:out value="${pa}"></c:out></option>
            <option value="ur"><c:out value="${ur}"></c:out></option>
            <option value="pe"><c:out value="${pe}"></c:out></option>
            <option value="hu"><c:out value="${hu}"></c:out></option>
            </select>

            <select id="secondLanguage" class="eamilinput">
                <option value="default"><c:out value="${select_language}"></c:out></option>
                <option value="en"><c:out value="${en}"></c:out></option>
                <option value="pa"><c:out value="${pa}"></c:out></option>
                <option value="ur"><c:out value="${ur}"></c:out></option>
                <option value="pe"><c:out value="${pe}"></c:out></option>
                <option value="hu"><c:out value="${hu}"></c:out></option>
            </select>


            <select id="englishLevel">
                <option value="default">Angol nyelvtudás</option>
                <option value="a">Alapfok</option>
                <option value="b">Középfok</option>
                <option value="c">Felsőfok</option>
            </select>
        </div>
        <div>

            <select id="age">
                <option value="default">Életkor</option>
                <option value="a">18-25 év</option>
                <option value="b">26-35 év</option>
                <option value="c">35 év felett</option>
            </select>
        </div>
        <div>
            <input type="checkbox" checked id="newsLetter" />
            <label for="newsLetter"> Hírlevél feliratkozás </label>
        </div>
        <div id="submitdiv">
            <input type="submit" id="submit" value="Regisztrálok" />
        </div>
    </form>
</div>
<div class="logoDivPic">
    <img src="resources/images/yellowroad-logo-white.png" align="left" />

</div>
<script src="https://code.jquery.com/jquery-3.1.1.js"></script>
<script src="resources/javascript/registration.js"></script>
</body>
