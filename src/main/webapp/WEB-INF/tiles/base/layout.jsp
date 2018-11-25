<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>  
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE>  
<html>  
<head>  

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">
<%-- <meta name="_csrf" content="${_csrf.token}"/> --%>
<%-- <meta name="_csrf_header" content="${_csrf.headerName}"/> --%>

<title>Clean Blog - Start Bootstrap Theme</title>

<!-- Bootstrap core CSS -->
<link href="/resources/startbootstrap-clean-blog-gh-pages/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

<!-- Custom fonts for this template -->
<link href="/resources/startbootstrap-clean-blog-gh-pages/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
<link href='https://fonts.googleapis.com/css?family=Lora:400,700,400italic,700italic' rel='stylesheet' type='text/css'>
<link href='https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>

<!-- Custom styles for this template -->
<link href="/resources/startbootstrap-clean-blog-gh-pages/css/clean-blog.min.css" rel="stylesheet"> 

<title><tiles:insertAttribute name="title" ignore="true"/></title>
<sec:csrfMetaTags/>
<script>
// 	var csrfParameter = $("meta[name='_csrf_parameter']").attr("content");
// 	var csrfHeader = $("meta[name='_csrf_header']").attr("content");
// 	var csrfToken = $("meta[name='_csrf']").attr("content");
	
// 	// using XMLHttpRequest directly to send an x-www-form-urlencoded request
// 	var ajax = new XMLHttpRequest();
// 	ajax.open("POST", "/responseEntity", true);
// 	ajax.setRequestHeader("Content-Type", "application/x-www-form-urlencoded data");
// 	ajax.send(csrfParameter + "=" + csrfToken + "&name=John");
	
// 	// using XMLHttpRequest directly to send a non-x-www-form-urlencoded request
// 	var ajax = new XMLHttpRequest();
// 	ajax.open("POST", "/responseEntity", true);
// 	ajax.setRequestHeader(csrfHeader, csrfToken);
// 	ajax.send();
	
// 	// using JQuery to send an x-www-form-urlencoded request
// 	var data = {};
// 	data[csrfParameter] = csrfToken;
// 	data["name"] = "John";
// 	$.ajax({
// 	    url: "responseEntity",
// 	    type: "POST",
// 	    data: data
// 	});
	
// 	// using JQuery to send a non-x-www-form-urlencoded request
// 	var headers = {};
// 	headers[csrfHeader] = csrfToken;
// 	$.ajax({
// 	    url: "responseEntity",
// 	    type: "POST",
// 	    headers: headers
// 	});



</script>

</head>  
<body>  
	<!-- cross site request forgery input -->
	<sec:csrfInput/>
    <!-- Bootstrap core JavaScript -->
    <script src="/resources/jquery/jquery-3.3.1.js"></script>
    <script src="/resources/startbootstrap-clean-blog-gh-pages/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

    <!-- Custom scripts for this template -->
    <script src="/resources/startbootstrap-clean-blog-gh-pages/js/clean-blog.min.js"></script>
	<tiles:insertAttribute name="nav"/>  
	<tiles:insertAttribute name="header"/>  
	<tiles:insertAttribute name="body"/>  
	<tiles:insertAttribute name="footer"/>  
</body>  
</html>