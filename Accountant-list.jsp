<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
<title>Accountant List</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
<style>
#div1{
float:right;
margin:40px 0px 0px 0px;
}
body{
background-image: url("image1/3.jpg");
background-repeat:no-repeat;
background-size:cover;
 text-align: center;
}

table,th,td{
border-collapse:collapse;
border:3px solid black;
height:30px;
width:1000px;
font-size:20px;
margin:50px 50px 50px 130px;
color:black;
}
h2
{
color:black;
}
h1,h3,b
{
color:black;
}
</style>
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

<div id="wrapper">
</div>
<div id="container">
<div id="content">
 <!--  add a search box  -->
 <div id="div1">
<form action="StudentController" method="GET">
 <input type="hidden" name ="COMMAND" value="SEARCH"/>
 <b>Search Records:</b><input type="text" name="theSearchStudent"/>
 <input type ="submit" value="Search" class="add-student-button"/>
 </form>
 </div>
  <h1>LIST OF STUDENTS</h1>
<table>
<tr>
<th>RollNo</th>
<th>Name</th>
<th>Email</th>
<th>Course</th>
<th>Sex</th>
<th>Fee</th>
<th>Paid</th>
<th>Due</th>
<th>Contact</th>
<th>Action</th>
</tr>
<c:forEach var="tempStudent" items="${STUDENT_LIST}">
<c:url var="updateLink" value="StudentController">
<c:param name="COMMAND" value="LOAD"/>
<c:param name="rollNo" value="${tempStudent.rollNo}"/>
<c:url var="deleteLink" value="StudentController">
<c:param name="COMMAND" value="DELETE"/>
<c:param name="rollNo" value="${tempStudent.rollNo}"/>
</c:url>
</c:url>
<tr>

<td> ${tempStudent.rollNo}</td>
<td> ${tempStudent.name}</td>
<td> ${tempStudent.email}</td>
<td> ${tempStudent.course}</td>
<td> ${tempStudent.sex}</td>
<td> ${tempStudent.fee}</td>
<td> ${tempStudent.paid}</td>
<td> ${tempStudent.due}</td>
<td> ${tempStudent.contact}</td>
<td ><a href="${ updateLink}">Update</a>|<a href="${ deleteLink}">Delete</a></td>
</tr>
</c:forEach>
</table><br>
<form action="add-student.jsp">
<input type="submit" value="Add Student" class="add-student-button">
</form>

</div>
</div>
</body>
</html>