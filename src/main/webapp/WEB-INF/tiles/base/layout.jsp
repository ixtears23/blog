<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>  
<!DOCTYPE>  
<html>  
<head>  

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

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
</head>  
<body>  
    <!-- Bootstrap core JavaScript -->
    <script src="/resources/startbootstrap-clean-blog-gh-pages/vendor/jquery/jquery.min.js"></script>
    <script src="/resources/startbootstrap-clean-blog-gh-pages/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

    <!-- Custom scripts for this template -->
    <script src="/resources/startbootstrap-clean-blog-gh-pages/js/clean-blog.min.js"></script>
	<tiles:insertAttribute name="nav"/>  
	<tiles:insertAttribute name="header"/>  
	<tiles:insertAttribute name="body"/>  
	<tiles:insertAttribute name="footer"/>  
</body>  
</html>