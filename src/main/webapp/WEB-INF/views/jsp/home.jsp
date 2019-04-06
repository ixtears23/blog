<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<head>
<!-- <meta http-equiv='Content-Type' content='text/html; charset=UTF-8' /> 왜 씀 ? -->
<title>home</title>
</head>
<body>
	<form name="csrf" method="post">
	<input type="hidden"
	    name="${_csrf.parameterName}"
	    value="${_csrf.token}"/>
	</form>
	
	<!-- Main Content -->
	<div class="container">
	  <div class="row">
	    <div class="col-lg-8 col-md-10 mx-auto">
	      <div class="post-preview">
	        <a href="">
	          <h2 class="post-title">
	          	${serverTime}
	            Man must explore, and this is exploration at its greatest
	          </h2>
	          <h3 class="post-subtitle">
	            Problems look mighty small from 150 miles up
	          </h3>
	        </a>
	        <p class="post-meta">Posted by
	          <a href="">Start Bootstrap</a>
	          on September 24, 2018</p>
	      </div>
	      <hr>
	      <div class="post-preview">
	        <a href="post">
	          <h2 class="post-title">
	            I believe every human has a finite number of heartbeats. I don't intend to waste any of mine.
	          </h2>
	        </a>
	        <p class="post-meta">Posted by
	          <a href="#">Start Bootstrap</a>
	          on September 18, 2018</p>
	      </div>
	      <hr>
	      <div class="post-preview">
	        <a href="post.html">
	          <h2 class="post-title">
	            Science has not yet mastered prophecy
	          </h2>
	          <h3 class="post-subtitle">
	            We predict too much for the next year and yet far too little for the next ten.
	          </h3>
	        </a>
	        <p class="post-meta">Posted by
	          <a href="#">Start Bootstrap</a>
	          on August 24, 2018</p>
	      </div>
	      <hr>
	      <div class="post-preview">
	        <a href="post.html">
	          <h2 class="post-title">
	            Failure is not an option
	          </h2>
	          <h3 class="post-subtitle">
	            Many say exploration is part of our destiny, but it`s actually our duty to future generations.
	          </h3>
	        </a>
	        <p class="post-meta">Posted by
	          <a href="#">Start Bootstrap</a>
	          on July 8, 2018</p>
	      </div>
	      <hr>
	      <!-- Pager -->
	      <div class="clearfix">
	        <a class="btn btn-primary float-right" href="#">Older Posts &rarr;</a>
	      </div>
	    </div>
	  </div>
	</div>
	
	<script>
		"use strict";
	
		$(function() {
			
			
			var csrf = $("meta[name='_csrf']").attr("content");
			var csrfHeader = $("meta[name='_csrf_header']").attr("content");
			
			
			$(".post-title").click(function(e) {
				e.preventDefault();
				
			})
			
			
		})
		
		
		function sendBody() {
			
			var options = {
					type: "POST",
					url: "/responseBody",
					data: { params: { param: "파람스값", params: "파람스값"} },
					contentType: "application/json",
					success: function(res) {
						console.log(res);
					}
			};
			
			$.ajax(options);
			
		}
		
		function sendEntity() {
			
			var options = {
					method: "GET",
					url: "/responseEntity",
					data: { param: "파람스값", params: "파람스값"},
					success: function(res) {
						console.log(res);
					}
			};
			
			$.ajax(options);
		}
	
	</script>
</body>