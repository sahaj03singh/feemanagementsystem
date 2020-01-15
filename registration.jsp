<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign Up</title>
<link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css">
<link rel="stylesheet" type="text/css" href="css/styles.css">
<style>
body{
background-image:url("resources/images/back.jpg");
background-repeat: no-repeat;
background-size:cover;
}

</style>
</head>
<body>
<nav class="navbar navbar-inverse navbar-fixed-top">
  <div class="container">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="index.jsp"><span class="glyphicon glyphicon-time" aria-hidden="true"></span>Fee Management</a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-nav-demo">
      <ul class="nav navbar-nav">
        <li><a href="#">About</a></li>
        <li><a href="#">Contact</a></li>
         </ul>
        <ul class="nav navbar-nav navbar-right">
        <li><a href="registration.jsp"><span class="glyphicon glyphicon-user" aria-hidden="true"></span> Sign Up</a></li>
        <li><a href="login.jsp"><span class="glyphicon glyphicon-log-in" aria-hidden="true"></span> Login</a></li>
      </ul>
     </div>
  </div>
</nav>

	<div class="container">
	<div>
<h1> <span aria-hidden="true"></span>FEE MANAGEMENT</h1>
</div>
		<div class="row">
			<div class="col-md-4 col-sm-4 col-xs-12"></div>
			<div class="col-md-4 col-sm-4 col-xs-12">
			
			
				<!-- form start -->
			
			
				<form class="form-horizontal" action="UserController" method="get">
				<input type="hidden" name="command" value="ADD" />
				<div class="form-group"> 
				<label for="inputUserid" class="col-sm-2 control-label"></label>
    <div class="col-sm-10">
       <% 
              String str=(String)request.getAttribute("msg");
            %><%
              if(str!=null){
            	%> 
            	  <h4 style="color: red;">  <%=str%></h4>
            	  <%
              }
              %>
    </div>
				
              </div>
  <div class="form-group">

    <label for="inputUserid" class="col-sm-3 control-label">User_ID</label>
    <div class="col-sm-9">
      <input type="text" name="userId" class="form-control" id="inputUserid" placeholder="User ID or Email" required="required">
    </div>
  </div>
  <div class="form-group">
    <label for="inputPassword" class="col-sm-3 control-label">Password</label>
    <div class="col-sm-9">
      <input type="password" name="password" class="form-control" id="inputPassword" placeholder="Password" required="required" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters">
    </div>
  </div>
  <div class="form-group">
    <label for="inputFirstName" class="col-sm-3 control-label">First_Name</label>
    <div class="col-sm-9">
      <input type="text" name="name" class="form-control" id="inputName" placeholder=" Name" required="required" pattern="[A-Za-z]{3,}" title="Must contain at least 3 or more characters">
    </div>
  </div>
  
  
  <div class="form-group">
    <label for="inputContact" class="col-sm-3 control-label">Contact</label>
    <div class="col-sm-9">
      <input type="text" name="contact" class="form-control" id="inputContact" placeholder="Contact" required="required">
    </div>
  </div>
  
  
  
  <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
      <button type="submit" class="btn btn-success btn-block">Sign Up</button>
    </div>
  </div>
</form>
			</div>
			<div class="col-md-4 col-sm-4 col-xs-12"></div>

		</div>
	</div>

	<script src="https://code.jquery.com/jquery-3.2.1.js"></script>
	
	<script type="text/javascript"
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
		<script src="js/custom.js"></script>
</body>
</html>