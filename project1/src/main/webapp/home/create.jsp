<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Students Portal</title>
</head>
<body>
   
    <h2>Student Registeration</h2>
 <form action="create">

   
   <h3> Student Dept &nbsp; &nbsp; &nbsp;<input type="text" name="Dept"> </h3> 
   <h3> Student Name &nbsp; &nbsp; &nbsp; <input type="text" name="Name"> </h3> <br><br><br>
   &nbsp; &nbsp; <input type="submit" >
</form>


<br><br>
<br><br>
<br><br>
<h2>display Student data </h2>
 <form action="getstudent">
        Enter id &nbsp; &nbsp; <input type="text"  name="id">
        <br><br>
        <input type="submit" >
    </form>
    
<br><br>
<br><br>
<br><br>
<h2>delete Student data </h2>
 <form action="delete">
        Enter id &nbsp; &nbsp; <input type="text"  name="id">
        <br><br>
        <input type="submit" >
    </form>
   
<br><br>
<br><br>
<br><br>
<h2>update Student data </h2>
      <form action="update">

    <h3> Student roll &nbsp; &nbsp; &nbsp;<input type="text" name="roll"> </h3>
   <h3> Student Dept &nbsp; &nbsp; &nbsp;<input type="text" name="Dept"> </h3> 
   <h3> Student Name &nbsp; &nbsp; &nbsp; <input type="text" name="Name"> </h3> <br><br><br>
   &nbsp; &nbsp; <input type="submit" >
   
</body>
</html>