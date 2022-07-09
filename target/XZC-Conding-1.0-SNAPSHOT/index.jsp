
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

<body style="background: url('/images/LoginBg2.jpg') no-repeat; background-size: 100% auto">
<div id="app">
    <div id="login-box">
        <form action="checkUser" method="post">
            <h1>论文登陆系统</h1>
            <h1 id="checkBox" style="color:white;font-size:20px;">账户类型:

                <input type="radio" id="js" name="accountType" value="1"><label for="js">教师</label>

                <input type="radio" id="zr" name="accountType" value="2"><label for="zr">系主任</label>

                <input type="radio" id="xs" name="accountType" value="3"><label for="xs">学生</label>

                <input type="radio" id="jw" name="accountType" value="4"><label for="jw">教务人员</label>
            </h1>
            <div class="form">
                <div class="item">
                    <i class="fa fa-user-circle-o" aria-hidden="true"></i>
                    <input type="text" id="usernameBox" v-model="username" name="username" placeholder="用户名" required>
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
            <button type="submit" @click="sendMsg">登陆</button>
        </form>
    </div>
</div>

</body>

<script src="./js/vue.js"></script>
<script src="./js/axios-0.18.0.js"></script>
<script src="./plugins/element-ui/index.js"></script>
<script type="text/javascript" src="./js/jquery.min.js"></script>

<script type="text/javascript">
    let elementById = document.getElementById("checkBox");
    console.log(elementById.data)

    new Vue({
        el:"#app",
        data: {
            isInvoke: true,
            username:''
        },

        created(){
            this.loginSuccess();
        },

        methods:{
            loginSuccess(){
                if (this.isInvoke){
                    this.$message.success("登录成功!!!");
                    this.isInvoke = false;
                }
            },
            sendMsg(){
                let nameStr = this.username;
                localStorage.setItem("username", nameStr);

            }
        }

    });
</script>
</html>