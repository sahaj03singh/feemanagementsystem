<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
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
<title>UPDATE RECORDS</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
<link rel="stylesheet" type="text/css" href="css/add_student_style.css">
<style>
body{
background-image: url("image1/3.jpg");
background-repeat:no-repeat;
background-size:cover;
 text-align: center;
}

table,th,td{
border-collapse: collapse;
height:30px;
width:500px;
font-size:20px;
margin:50px 50px 50px 390px;
color:black;
font-weight:bold;
font-style:italic;
}
h2
{
color:black;
}
h1,h3
{
color:black;
}
</style>
</head>
<body>
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
<h1>Update Student</h1>
<form action="StudentController" method="get">
<input type="hidden" name="COMMAND" value="UPDATE">
<input type="hidden" name="rollNo" value="${STUDENT.rollNo}">
<table>
<tbody>
<tr>
<td><label>Student Name</label></td>
<td><input type="text" name="name" value="${STUDENT.name}"></td>
</tr>

<tr>
<td><label>EMAIL</label></td>
<td><input type="text" name="email" value="${STUDENT.email}"></td>
</tr>
<tr>
<td><label>DUE</label></td>
<td><input type="text" name="due" value="${STUDENT.due}"></td>
</tr>
<tr>
<td><label></label></td>
<td><input type="submit" value="save" class="save"></td>
</tr>
</tbody>
</table>

</form>
<a href="StudentController">Back to List</a>
</div>
</body>
</html>