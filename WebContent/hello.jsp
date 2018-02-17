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
<form name="insertinfo" action="login" method="post">
<p>Please Enter the following Information <br><br><br> 
<label>Activity Name </label>
<input type="text" name="activity" class="boxes"> <br><br>
<label>Patient Name </label>         
<input type="text" name="name" class="boxes"> <br><br>
<label>Age</label>
<input type ="text" name="age" class="boxes"> <br><br>
<label>Number of Sensors On</label>
<input type ="text" name="sensors" class="boxes"> <br><br>
<label>Start time</label>
<input type ="text" name="stime"  class="boxes"> <br><br>
<label>Stop time </label>
<input type ="text" name="stoptime" class="boxes" > <br><br><br>
<input type ="submit" value="Submit">
</p>
</form>
</body>
</html>