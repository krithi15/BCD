<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert Information</title>
<style type ="text/css">
label{
float: left;
width: 220px;
margin-left: 10px;
}

.boxes{
width: 15em;
}

.divider{
    width:10px;
    height:auto;
    display:inline-block;
}

input, textarea{
width: 200px;
margin-bottom: 5px;
}

.heading{
 margin-left: 5px;
}

body {
    background-color: lightblue;
}
</style>
</head>
<body>
<div id ="header">
 <h2>Behavior Change Detection</h2>
</div>
<div id="form_info" >
<form name="insertinfo" action="http://localhost:8080/Trail/insertServlet" method="post">
<p>Please Enter the following Information <br><br><br> 
<label>Activity Name </label>
<input type="text" name="activity" class="boxes"> <br><br>
<label>Patient Name </label>         
<input type="text" name="pname" class="boxes"> <br><br>
<label>Age</label>
<input type ="text" name="age" class="boxes"> <br><br>
<label>Number of Sensors On</label>
<input type ="text" name="sensors" class="boxes"> <br><br>
<label>Start time</label>
<input type ="text" name="stime"  class="boxes"> <br><br>
<label>Stop time </label>
<input type ="text" name="stoptime" class="boxes" > <br><br><br>
<div style="text-align: left"> 
<a href="sensor.jsp"><input type ="submit" value="Submit"></a>
<div class="divider"/>
<a href="home.jsp"><input type="button" name="cancel" value="Cancel" /></a>
</div>
</p>
</form>
</div>
</body>
</html>