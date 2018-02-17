<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Detect Behaviour Change</title>
<style type = "text/css">
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

body {
    background-color: yellow;
}

</style>
</head>
<body>
<form name="detectinfo" action="patientLogin" method="post">
<label>Enter Patient Name </label>         
<input type="text" name="name" class="boxes"> <br><br>
<label>Identify Method</label>  <br>
<input type="checkbox" name="type" value="RuLSIF">RuLSIF <br>
<input type="checkbox" name="type" value="sw-PCAR">sw-PCAR <br>
<input type="checkbox" name="type" value="Virtual Classifier">Virtual Classifier <br><br>
<input type ="submit" value="Detect">
</form>

</body>
</html>