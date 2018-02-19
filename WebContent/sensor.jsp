<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sensor Information</title>
<style type="text/css">
body {
    background-color: red;
}

label{
float: left;
width: 220px;
margin-left: 10px;
}
</style>
<script type="text/javascript">
 function addNew()
  {
    var i = 1;
    my_div.innerHTML = my_div.innerHTML +"<br><br><label>Sensor Number</label><input type='text' name='mytext'+ i><br><br><label>Time On</label><input type='text' name='mytext'+ i><br>"
  }
</script>
</head>
<body>
Enter Sensor Information
<form name="form" action="post">
<label>Sensor Number</label>
<input type="text" name=t1><br><br>
<label>Time On</label>
 <input type="text" name=t1><br>
<input type="button" value="Add" onClick="addNew()">
<div id="my_div"></div>
</form>
</body>
</html>