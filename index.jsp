<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>Aplikasi Penjualan Batik</title>
    <script type="text/javascript" src="config/jquery.min.js"></script>
    <link href="config/bootstrap.min.css" rel="stylesheet" type="text/css">
    <script type="text/javascript" src="config/bootstrap.min.js"></script>
    <script type="text/javascript" src="config/setting.js"></script>
    <style type="text/css"> 
        body {
        margin: 180px auto;
    }
    
    </style>
    </head>
     <body class="col-5">
         <form method="post" action="Login?proses=login" class="table-bordered col-15 shadow p-3 mb-5 bg-white rounded">
         <div>
         <h1 class="text-center text-secondary">Login Aplikasi</h1>
         </div>
     </br>
  <div class="form-group row ">
    <label for="Username" class="col-sm-2 col-form-label">Username</label>
    <div class="col-sm-10">
    <input type="text" name="username" id="username" class="form-control" placeholder="Username" required="" autofocus="">
    </div>
  </div>
  <div class="form-group row">
    <label for="Password" class="col-sm-2 col-form-label">Password</label>
    <div class="col-sm-10">
      <input type="password" name="password" class="form-control" id="inputPassword"  placeholder="Password" >
    </div>
  </div>
     <center>
     <div>
             <td><input class="btn btn-primary col-5" type="submit" value="Login" /></td> 
              <td><input class="btn btn-danger col-5" type="reset" value="Reset" /></td>
     </div>
         </center>
</form>
     

</body>
</html>
