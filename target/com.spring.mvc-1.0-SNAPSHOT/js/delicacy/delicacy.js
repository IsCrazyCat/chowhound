/**
 * Created by guojugnuang on 2017/10/17.
 */
delicacyList();
function delicacyList(){
    $.ajax({
        url:"/delicacy/delicacys",
        type:"POST",
        dataType:"JSON",
        data:{},
        success:function (data) {
            console.log(data);
        },
        error:function(data,type, err){
            alert("获取Delicacys错误");
            console.log(data.responseText);
            console.log("ajax错误类型："+type);
            console.log(err);
        }
    });
}