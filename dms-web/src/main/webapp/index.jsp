<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<body>
	<h1>Upload File</h1>
	<form action="rest/request/data-attachment" method="post"
		enctype="multipart/form-data">

		<p>
			<input type="text" name="text1" value="text default">
		<p>
			<input type="text" name="text2" value="a&#x03C9;b">
		<p>
			<input type="file" name="file1">
		<p>
			<input type="file" name="file2">
		<p>
			<button type="submit">Submit</button>
	</form>
</body>

</html>

