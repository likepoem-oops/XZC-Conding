
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<html lang="zh-CN">
<head>
    <meta http-equiv="content-type" content="text/html" charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <link rel="stylesheet" href="./css/style.css">
</head>
<body>
<form action="${pageContext.request.contextPath}/logins" method="post">
    <div class="box">
        <h2>Login</h2>
        <div class="input-box">
            <label>账号</label>
            <label>
                <input type="text" id="input_username" name="username"/>
            </label>
            <br>
            <span class="err-info" id="errName" style="display: none">用户名错误</span>
        </div>
        <div class="input-box">
            <label>密码</label>
            <label>
                <input type="password" id="input_password" name="password"/>
            </label>
            <br>
            <span class="err-info" id="errPwd" style="display: none">用户名错误</span>
        </div>
        <div class="btn-box">
            <a href="#">忘记密码?</a>
            <div>
                <button>登录</button>
                <button>注册</button>
            </div>
        </div>
    </div>
</form>

<script type="text/javascript">
    let nameBox = document.getElementById("input_username");
    let passwordBox = document.getElementById("input_password");
    nameBox.onblur = function () {
        if (nameBox.value.trim().length < 4 || nameBox.value.trim().length > 10){
            document.getElementById("errName").style.display = "";
        }else {
            document.getElementById("errName").style.display = "none";
        }
    }

    passwordBox.onblur = function () {
        if (passwordBox.value.trim().length < 4 || passwordBox.value.trim().length > 10){
            document.getElementById("errPwd").style.display = "";
        }else {
            document.getElementById("errPwd").style.display = "none";
        }
    }



</script>
</body>
</html>