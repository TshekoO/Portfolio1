<?php include('config.php') ?>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>
            Onyx Real-Estate
        </title>
        <link rel = "stylesheet" href="style.css">
        <script src="https://kit.fontawesome.com/bea53ffddf.js" crossorigin="anonymous"></script>
    </head>
    <body class="index">
    <div id="header2">
    <img src="images/ONYX.jpg" class="logo">
        <div class="container">
      
            <div class="box form-box">

               <header>
                <center>Login</center>
               </header>
                 <form action="" method="post">
                   <div class="field input">
                    <label for="username">Username</label>
                    <input type="text" name="username" id="username" autocomplete="off"required>

                   </div>
                   <div class="field input">
                    <label for="password">Password</label>
                    <input type="password" name="password" id="password" autocomplete="off" required>

                   </div>
                   <div class="field">
                   
                    <button type="submit" class="btn" name="Login" value="Login" required>Login</button>
                   
                   </div>
                   <div class="links">
                    Do you have account? <a href="register.php">Sign Up</a>
                   </div>
                
      </form>
            </div>
         
            </div>
    </div>
    </body>
</html>