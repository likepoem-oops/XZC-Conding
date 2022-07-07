
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>西南大学论文管理系统登陆</title>
    <link rel="stylesheet" href="./css/landing.css">
</head>

<body>
<div id="app">
    <div id="login-box">
        <form action="LoginServlet" method="post">
            <h1>论文登陆系统</h1>
            <h1 style="color:white;font-size:20px;">账户类型:
                教师
                <input type="radio" id="js" name="accountType" value="教师">
                系主任
                <input type="radio" id="zs" name="accountType" value="系主任">
                学生
                <input type="radio" id="xs" name="accountType" value="学生">
                教务人员
                <input type="radio" id="jw" name="accountType" value="教务人员">
            </h1>
            <div class="form">
                <div class="item">
                    <i class="fa fa-user-circle-o" aria-hidden="true"></i>
                    <input type="text" id="usernameBox" name="username" placeholder="用户名" required>
                    <br>
                    <span id="errUsernameMessage" style="color: red; display: none;">用户名错误</span>
                </div>
                <div class="item">
                    <i class="fa fa-key" aria-hidden="true"></i>
                    <input type="password" id="passwordBox" name="password" placeholder="密码" required>
                    <br>
                    <span id="errPasswordMessage" style="color: red; display: none;">密码错误</span>
                </div>
            </div>
            <button type="submit">登陆</button>
        </form>
    </div>
</div>

<audio autoplay="autoplay" controls="controls" loop="loop" preload="auto" src="bgm.mp3"></audio>
</body>

<script src="./js/vue.js"></script>
<script src="./js/axios-0.18.0.js"></script>
<script src="./plugins/element-ui/index.js"></script>
<script type="text/javascript" src="./js/jquery.min.js"></script>

<script>
    new Vue({
        el:"#app",
        loginSuccess(){
            this.$message.success("登录成功!!!")
        }
    });
</script>
</html>