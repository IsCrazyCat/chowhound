/**
 * Created by guojunguang on 2017/8/14
 */
function login() {
    var username = $("#username").val();
    var password = $("#password").val();
    if(username==""||password==""){
        alert("用户名或密码不能为空");
    }else{
        $.ajax({
            url : "/login/login",
            data:{
                "name":username,
                "password":password
            },
            dataType:"json",
            type:"POST",
            success: function (data) {
                if (data.code=="0000"){
                    alert("成功");
                    window.location.href = "/index/index";
                } else {
                    alert("登录名或密码错误，登录失败");
                }
            },
            error:function(data,type, err){
                alert("登录错误");
                console.log(data.responseText);
                console.log("ajax错误类型："+type);
                console.log(err);
            }
        });
    }

}
