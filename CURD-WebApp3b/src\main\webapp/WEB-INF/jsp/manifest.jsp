<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/includes.jsp" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="UTF-8">
<title>Manifest Dashboard</title>
</head>
<body>
<h1>Manifest Data</h1>
<form:form action="manifest.do" method="POST" commandName="manifest">
<table>
<caption></caption>
	<tr>
		<td>ManifestId</td>
		<td><form:input path="id" /></td>
	</tr>
	<tr>
		<td>OID:</td>
		<td><form:input path="oid" /></td>
	</tr>
	<tr>
		<td>PID:</td>
		<td><form:input path="pid" /></td>
	</tr>
	<tr>
		<td>MerchantId</td>
		<td><form:input path="merchantId" /></td>
	</tr>
	<tr>
		<td>MerchantStatus</td>
		<td><form:input path="manifestStatus" /></td>
	</tr>
	<tr>
		<td>RunnerId</td>
		<td><form:input path="runnerId" /></td>
	</tr>
	<tr>
		<td>RunnerName</td>
		<td><form:input path="runnerName" /></td>
	</tr>
	<tr>
		<td colspan="2">
			<input type="submit" name="action" value="Add" />
			<input type="submit" name="action" value="Edit" />
			<input type="submit" name="action" value="Delete" />
			<input type="submit" name="action" value="Search" />
		</td>
	</tr>
</table>
</form:form>
<br>

<table border="1">
	<tr>Id</tr>
	<tr>OID</tr>
	<tr>PID</tr>
	<tr>MerchantId</tr>
	<tr>ManifestStatus</tr>
	<tr>RunnerId</tr>
	<tr>RunnerName</tr>
	<c:forEach items="${manifestList}" var="manifest">
		<tr>
			<td>${manifest.id}</td>
			<td>${manifest.oid}</td>
			<td>${manifest.pid}</td>
			<td>${manifest.merchantId}</td>
			<td>${manifest.manifestStatus}</td>
			<td>${manifest.runnerId}</td>
			<td>${manifest.runnerName}</td>
		</tr>
	</c:forEach>
</table>

</body>
</html>