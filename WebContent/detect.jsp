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

.divider{
    width:10px;
    height:auto;
    display:inline-block;
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
<div id ="header">
 <h2>Behavior Change Detection</h2>
</div>
<div id="content">
<form name="detectinfo" action="http://localhost:8080/Trail/DetectServlet" method="post">
<label>Enter Patient Name </label>         
<input type="text" name="pname" class="boxes"> <br><br>
<label>Identify Method</label>  <br>
<input type="checkbox" name="type" value="RuLSIF">RuLSIF <br>
<input type="checkbox" name="type" value="sw-PCAR">sw-PCAR <br>
<input type="checkbox" name="type" value="Virtual Classifier">Virtual Classifier <br><br>
<div style="text-align: left"> 
<input type ="submit" value="Submit">
<div class="divider"/>
<a href="home.jsp"><input type="button" name="cancel" value="Cancel" /></a>
</div>
</form>
</div>
</body>
</html>