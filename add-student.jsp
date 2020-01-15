<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
 <meta charset="utf-8">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">  
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    
    <link href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700" rel="stylesheet">

    <link rel="stylesheet" href="css2/open-iconic-bootstrap.min.css">
    <link rel="stylesheet" href="css2/animate.css">
    
    <link rel="stylesheet" href="css2/owl.carousel.min.css">
    <link rel="stylesheet" href="css2/owl.theme.default.min.css">
    <link rel="stylesheet" href="css2/magnific-popup.css">

    <link rel="stylesheet" href="css2/aos.css">

    <link rel="stylesheet" href="css2/ionicons.min.css">

    <link rel="stylesheet" href="css2/bootstrap-datepicker.css">
    <link rel="stylesheet" href="css2/jquery.timepicker.css">

    
    <link rel="stylesheet" href="css2/flaticon.css">
    <link rel="stylesheet" href="css2/icomoon.css">
    <link rel="stylesheet" href="css2/style.css">
<style>
form {
    display: inline-block;
}
body{
background-image: url("image1/3.jpg");
background-repeat:no-repeat;
background-size:cover;
 text-align: center;
}
table,th,td{
border-collapse: separate;
  border-spacing: 15px;
height:30px;
width:500px;
font-size:20px;
color:black;
font-style:italic;
font-weight:bold;
}
h2
{
color:black;
}
h1
{
color:white;
margin:60px 50px 50px 50px;
}

</style>
<title>ADD STUDENT</title>
</head>
<body>
<% response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate"); %>
<nav class="navbar navbar-expand-lg navbar-dark ftco_navbar bg-dark ftco-navbar-light" id="ftco-navbar">
    <div class="container">
      <a class="navbar-brand" href="home.jsp"><i class="flaticon-university"></i>Genius <br><small>University</small></a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#ftco-nav" aria-controls="ftco-nav" aria-expanded="false" aria-label="Toggle navigation">
        <span class="oi oi-menu"></span> Menu
      </button>

      <div class="collapse navbar-collapse" id="ftco-nav">
        <ul class="navbar-nav ml-auto">
          <li class="nav-item active"><a href="home.jsp" class="nav-link">Home</a></li>
          <li class="nav-item"><a href="about.jsp" class="nav-link">About</a></li>
          <li class="nav-item"><a href="course.jsp" class="nav-link">Fee Structure</a></li>
          <li class="nav-item cta"><a href= "UserController?COMMAND=LOGOUT" class="nav-link"><span>LOG OUT</span></a></li>
      </ul>
      </div>
    </div>
  </nav>


<div id="container">
<h3><b>Add Student</b></h3>
<form action="StudentController" method="get">
<input type="hidden" name="COMMAND" value="ADD">
<table>
<tbody>
<tr>
<td><label>Name</label></td>
<td><input type="text" name="name" required="required" placeholder="student name"></td>
</tr>

<tr>
<td><label>Password</label></td>
<td><input type="password" name="password" required="required" placeholder="password"></td>
</tr>

<tr>
<td><label>Email</label></td>
<td><input type="text" name="email" required="required" placeholder="email"></td>
</tr>

<tr>
<td><label>Sex</label></td>
<td><input type="radio" name="sex" value="M" required="required">male
<input type="radio" name="sex" value="F" required="required" >female</td>
</tr>

<tr>
<td><label>Course</label></td>
<td><select name="course">
<option>CSE</option>
<option>Mechanical </option>
<option>Electronic </option>
<option>Electrical </option>
<option>Civil </option>
<option>Architecture</option>
<option>BCA</option>
<option>BBA</option>
<option>B.Com</option>
<option>B.Pharma</option>
</select></td>
</tr>

<tr>
<td><label>Fee</label></td>
<td><input type="text" name="fee" required="required"></td>
</tr>

<tr>
<td><label>Paid</label></td>
<td><input type="number" name="paid" required="required"></td>
</tr>

<tr>
<td><label>Contact</label></td>
<td><input type="number" name="contact" required="required"></td>
</tr>

<tr>
<td><label></label></td>
<td><input type="submit" value="Submit" class="save"></td>
</tr>
</tbody>
</table>
</form>
</div>

 <div class="col-md-4">
            <div class="ftco-footer-widget mb-4">
             
              </div>
            </div>
          
          <footer class="ftco-footer ftco-bg-dark ftco-section img" style="background-image: url(images/bg_2.jpg); background-attachment:fixed;">
    	<div class="overlay"></div>
      <div class="container">
        <div class="row mb-5">
          <div class="col-md-3">
            <div class="ftco-footer-widget mb-4">
              <h2><a class="navbar-brand" href="index.html"><i class="flaticon-university"></i>Genius <br><small>University</small></a></h2>
              <ul class="ftco-footer-social list-unstyled float-md-left float-lft mt-5">
                <li class="ftco-animate"><a href="https://www.twitter.com"><span class="fa fa-twitter"></span> </a></li>
                <li class="ftco-animate"><a href="https://www.facebook.com"><span class="fa fa-facebook"></span></a></li>
                <li class="ftco-animate"><a href="https://www.instagram.com"><span class="fa fa-instagram"></span></a></li>
              </ul>
            </div>
          </div>
        
          <div class="col-md-2">
             <div class="ftco-footer-widget mb-4 ml-md-4">
              <h2 class="ftco-heading-2">Site Links</h2>
              <ul class="list-unstyled">
         
                <li><a href="#" class="py-2 d-block">About</a></li>
                <li><a href="#" class="py-2 d-block">FeeStructure</a></li>
                
              </ul>
            </div>
          </div>
          <div class="col-md-3">
            <div class="ftco-footer-widget mb-4">
            	<h2 class="ftco-heading-2">Have a Questions?</h2>
            	<div class="block-23 mb-3">
	              <ul>
	                <li><span class="icon icon-map-marker"></span><span class="text">203 Fake St. Mountain View, San Francisco, California, USA</span></li>
	                <li><a href="#"><span class="icon icon-phone"></span><span class="text">7018467883</span></a></li>
	                <li><a href="#"><span class="icon icon-envelope"></span><span class="text">shreyakatoch11@gmail.com</span></a></li>
	              </ul>
	            </div>
            </div>
          </div>
        </div>
        <div class="row">
          <div class="col-md-12 text-center">

          
          </div>
        </div>
      </div>
    </footer>
    
  

 
  

  <!-- loader -->
  <div id="ftco-loader" class="show fullscreen"><svg class="circular" width="48px" height="48px"><circle class="path-bg" cx="24" cy="24" r="22" fill="none" stroke-width="4" stroke="#eeeeee"/><circle class="path" cx="24" cy="24" r="22" fill="none" stroke-width="4" stroke-miterlimit="10" stroke="#F96D00"/></svg></div>


  <script src="js2/jquery.min.js"></script>
  <script src="js2/jquery-migrate-3.0.1.min.js"></script>
  <script src="js2/popper.min.js"></script>
  <script src="js2/bootstrap.min.js"></script>
  <script src="js2/jquery.easing.1.3.js"></script>
  <script src="js2/jquery.waypoints.min.js"></script>
  <script src="js2/jquery.stellar.min.js"></script>
  <script src="js2/owl.carousel.min.js"></script>
  <script src="js2/jquery.magnific-popup.min.js"></script>
  <script src="js2/aos.js"></script>
  <script src="js2/jquery.animateNumber.min.js"></script>
  <script src="js2/bootstrap-datepicker.js"></script>
  <script src="js2/jquery.timepicker.min.js"></script>
  <script src="js2/scrollax.min.js"></script>
  <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBVWaKrjvy3MaE7SQ74_uJiULgl1JY0H2s&sensor=false"></script>
  <script src="js2/google-map.js"></script>
  <script src="js2/main.js"></script>
    
  </body>
</html>