/**
 * Created by wangtonghe on 2016/1/16.
 * 管理后台管理页面
 */
$(function(){

    $(".sidebar .nav-sidebar li").eq(0).find("a").addClass("active");

    //初始化页面
    $(".sidebar .nav-sidebar li").each(function () {
        if($(this).find("a").hasClass("active")){
            var choice=$(this).attr("class");
            $(".container-fluid .main > div").each(function(){
                if($(this).hasClass(choice)){
                    $(this).show().siblings().hide();
                    $.getScript("js/"+choice+".js",function(){
                    });
                }
            })
        }
    });


    //单击左侧菜单，显示对应页面
    $(".sidebar .nav-sidebar li").on('click',"a",function(){
        $(this).addClass("active").siblings().removeClass("active");
        var choice=$(this).parent().attr("class");
        $(".container-fluid .main > div").each(function(){
            if($(this).hasClass(choice)){
                $(this).show().siblings().hide();
                //$("script[src='js/*-manager.js']").remove();
                $.getScript("js/"+choice+".js",function(){});
            }
        })


    });


});