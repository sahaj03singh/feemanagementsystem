<!DOCTYPE html>
<html lang="en">
<head>
	<title>Login</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->	
	<link rel="icon" type="image/png" href="image\favicon.ico"/>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href
	
	="CSS\bootstrap.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="css/font-awesome.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="css/material-design-iconic-font.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="CSS\animate.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="CSS\hamburgers.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="CSS\animsition.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="CSS\select2.min.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="CSS\daterangepicker.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="CSS\util.css">
	<link rel="stylesheet" type="text/css" href="CSS\main.css">
<!--===============================================================================================-->
</head>
<body>
	
	<div class="limiter">
		<div class="container-login100" style="background-image: url('image1/image_5.jpg');">
			<div class="wrap-login100">
				<form class="loginform" action="UserController" method="get">
				<input type="hidden" name="COMMAND" value="USER" />
				<div class="form-group"> 
				 <% 
              String str=(String)request.getAttribute("msg");
            %><%
              if(str!=null){
            	%> 
            	  <h4 style="color: green;">  <%=str%></h4>
            	  <%
              }
              %>
				</div>
					<span class="login100-form-logo">
						<i class="zmdi zmdi-landscape"></i>
					</span>

					<span class="login100-form-title p-b-34 p-t-27">
						Log in
					</span>

					<div class="wrap-input100 validate-input" data-validate = "Enter userId">
						<input class="input100" type="text" name="userId" placeholder="UserId">
						<span class="focus-input100" data-placeholder="&#xf207;"></span>
					</div>

					<div class="wrap-input100 validate-input" data-validate="Enter password">
						<input class="input100" type="password" name="password" placeholder="Password">
						<span class="focus-input100" data-placeholder="&#xf191;"></span>
					</div>

			

					<div class="container-login100-form-btn">
						<button class="login100-form-btn">
							Login
						</button>
					</div>

				</form>
			</div>
		</div>
	</div>
	

	<div id="dropDownSelect1"></div>
	
<!--===============================================================================================-->
	<script src="js\jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
	<script src="js\animsition.min.js"></script>
<!--===============================================================================================-->
	<script src="js\popper.js"></script>
	<script src="js\bootstrap.min.js"></script>
<!--===============================================================================================-->
	<script src="js\select2.min.js"></script>
<!--===============================================================================================-->
	<script src="js\moment.min.js"></script>
	<script src="js\daterangepicker.js"></script>
<!--===============================================================================================-->
	<script src="js\countdowntime.js"></script>
<!--===============================================================================================-->
	<script src="js\main1.js"></script>

</body>
</html>