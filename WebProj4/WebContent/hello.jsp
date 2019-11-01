<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>HelloStruts</title>
</head>
<body>
<h1>HelloStruts2!</h1>
<br>
<h3><s:property value="result"/></h3>
<br>

<table>
<tr>
  <th>USERID</th>
  <th>USERNAME</th>
  <th>PASSWORD</th>
  <th>RESULT</th>
</tr>
<s:iterator value="helloStrutsDTOList">
<tr>
  <td><s:property value="userId"/></td>
  <td><s:property value="userName"/></td>
  <td><s:property value="password"/></td>
  <td><s:property value="result"/></td>
</tr>
</s:iterator>
</table>

</body>
</html>
