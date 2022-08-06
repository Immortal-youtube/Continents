
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>WebScrapers</title>
</head>
<body>
<h1>WebScrapers</h1>
<hr>
<p>${error}</p>
<form method="post" action="/">
    <label>Enter the link: </label>
    <input type="text" id="link" name="link">
    <br>
    <label>Enter the Search Query: </label>
    <input type="text" id="query" name="query">
    <br>
    <button type="submit">Submit</button>
</form>
<h2>Result: </h2>
</body>
</html>
