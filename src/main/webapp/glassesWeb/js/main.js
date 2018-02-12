/*文档加载完成执行*/
$(document).ready(function () {
    $("#all-p").click(function () {
        $(".all").slideToggle("slow");
    });
    $(".pro-item").hover(function(){
        $(this).find(".pro-info").slideDown("slow");
    },function() {
        $(this).find(".pro-info").slideUp("slow");
    })
});