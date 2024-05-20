<?php include('config.php') ?>
<!DOCTYPE html>
<html lang="en">
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
                Sign Up
               </header>
                 <form action="" method="post">
                   <div class="field input">
                    <label for="username">Username</label>
                    <input type="text" name="username" value="<?php echo $username; ?>"autocomplete="off"  required>

                   </div>
                   <div class="field input">
                    <label for="email">Email</label>
                    <input type="email" name="email" value="<?php echo $email; ?>" autocomplete="off" required>

                   </div>
                
              
                <div class="field input">
                 <label for="phone">Phone-Number</label>
                 <input type="text" name="phone" value="<?php echo $age; ?>" autocomplete="off" required>

                </div>
        
        
            <div class="field input">
             <label for="password">Password</label>
             <input type="password" name="password" id="password" autocomplete="off"  required>

            </div>
                   <div class="field">
                
                    <button type="submit" class="btn" name="Register" value="Register" required>Register</button>
                   </div>
                   <div class="links">
                    Already a member? <a href="index.php">Sign In</a>
                   </div>
                   </form>
                </div>
                
                
            </div>   
    
        </div>
    </body>
</html>