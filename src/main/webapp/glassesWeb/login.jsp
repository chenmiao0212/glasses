<%--
  Created by IntelliJ IDEA.
  User: 15927
  Date: 2018/2/5
  Time: 20:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"/>
    <meta name="renderer" content="webkit">
    <title>首页</title>
    <link rel="stylesheet" type="text/css" href="css/main.css" />
    <link rel="stylesheet" type="text/css" href="css/index.css" />
    <link rel="stylesheet" type="text/css" href="css/animate.css" />
    <link rel="stylesheet" type="text/css" href="css/footer.css" />
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">
    <script src="js/wow.min.js"></script>
    <script src="js/jquery-3.2.1.min.js"></script>
    <script src="js/main.js"></script>
    <style>
        .login-Method span:hover{
            font-weight: 700;
            color: #2D6BC3;
        }
        .login-active{
            font-weight: 700;
            color: #2D6BC3;
        }
        .login-name input{
            font-size: 14px;
            border: 0;
            height: 38px;
            width: 250px;
        }
        .login-pwd input{
            font-size: 14px;
            border: 0;
            height: 38px;
            width: 250px;
        }
        .login{
            width: 300px;
            margin: 0 auto;
            background-color: #2D6BC3;
            color: #FFFFFF;
            height: 30px;
            line-height: 30px;
            text-align: center;
            letter-spacing: 10px;
            margin-top: 40px;
            cursor:pointer;
        }

    </style>
</head>
<body>
<!--头部-->
<!--顶部菜单-->
<div class="top bg-F0F0F0 font-size-12">
    <div class="width-1190 margin-auto height-30">
        <div class="top_left ">
            <ul class="top_left_list height-30 line-height-30">
                <li>
                    <a class="hover-7a97c5 cursor">联系我们</a>
                </li>
                <li class="border-right-solid height-12 margin-top-10"></li>
                <li>
                    <a class="hover-7a97c5 cursor">关于我们</a>
                </li>
                <li class="border-right-solid height-12 margin-top-10"></li>
                <li>
                    <a class="hover-7a97c5 cursor">联系我们</a>
                </li>
                <li class="border-right-solid height-12 margin-top-10"></li>
                <li>
                    <a class="hover-7a97c5 cursor">联系我们</a>
                </li>
                <li>
                    <a class="hover-7a97c5 cursor">联系我们</a>
                </li>
            </ul>
        </div>
        <div class="top_right line-height-30">
            <span class="display-block float-left margin-right-10">你好，欢迎光临本网站！</span>
            <a href="login.html"><span class="display-block margin-right-10 float-left hover-7a97c5 cursor">登录</span></a>
            <a href="register.html"><span class="display-block float-left hover-7a97c5 cursor">注册</span></a>
        </div>
    </div>
</div>
<div class="width-1190 margin-auto height-120 position-relative">
    <div class="logo float-left position-absolute cursor">
        <a href="index.html"><img src="img/logo.png" width="120"></a>
    </div>
    <div class="search position-absolute">
        <div class="search-input">
            <input type="text"   class="sea_input"  >
            <span class="search_submit cursor">搜索</span>
        </div>
    </div>
</div>
<!--导航-->
<div class="menu margin-top-10">
    <div class="width-1190 height-40 margin-auto">
        <div class="nav-left cursor position-relative ">
            <span class="display-block height-40 line-height-40 font-size-14 float-left">全部商品分类</span>
            <i class="fa fa-list-ul margin-left-10 float-left "  style="font-size: 14px;margin-top: 13px"></i>
            <ul class="all position-absolute bg-theme display-none" >
                <li class="hover-list-item ">
                    <a class="display-block float-left width-190 height-50 " href="index.html">首页</a>
                    <i class="fa fa-chevron-right float-left margin-top-20 position-absolute " style="right: 40px"></i>
                    <div class="list-item-line"></div>
                </li>
                <li class="hover-list-item ">
                    <a class="display-block float-left width-190 height-50">彩瞳</a>
                    <i class="fa fa-chevron-right float-left margin-top-20 position-absolute " style="right: 40px"></i>
                    <div class="list-item-line"></div>
                </li>
                <li class="hover-list-item ">
                    <a class="display-block float-left width-190 height-50 " href="productlist.html">隐形眼镜</a>
                    <i class="fa fa-chevron-right float-left margin-top-20 position-absolute " style="right: 40px"></i>
                    <div class="list-item-line"></div>
                </li>
                <li class="hover-list-item ">
                    <a class="display-block float-left width-190 height-50">护理用品</a>
                    <i class="fa fa-chevron-right float-left margin-top-20 position-absolute " style="right: 40px"></i>
                    <div class="list-item-line"></div>
                </li>
                <li class="hover-list-item ">
                    <a class="display-block float-left width-190 height-50">框架眼镜</a>
                    <i class="fa fa-chevron-right float-left margin-top-20 position-absolute " style="right: 40px"></i>
                    <div class="list-item-line"></div>
                </li>
                <li class="hover-list-item ">
                    <a class="display-block float-left width-190 height-50">美妆个护</a>
                    <i class="fa fa-chevron-right float-left margin-top-20 position-absolute " style="right: 40px"></i>
                    <div class="list-item-line"></div>
                </li>
                <li class="hover-list-item ">
                    <a class="display-block float-left width-190 height-50">眼镜知识</a>
                    <i class="fa fa-chevron-right float-left margin-top-20 position-absolute " style="right: 40px"></i>
                    <div class="list-item-line"></div>
                </li>
                <li class="hover-list-item ">
                    <a class="display-block float-left width-190 height-50">积分商城</a>
                    <i class="fa fa-chevron-right float-left margin-top-20 position-absolute " style="right: 40px"></i>
                    <div class="list-item-line"></div>
                </li>
            </ul>
        </div>
        <ul class="nav-right">
            <li><a class="color-ffffff" href="index.html">首页</a></li>
            <li>彩瞳</li>
            <li><a class="color-ffffff" href="productlist.html">隐形眼镜</a></li>
            <li>护理用品</li>
            <li>框架眼镜</li>
            <li>美妆个护</li>
            <li>眼镜知识</li>
            <li>积分商城</li>
        </ul>
        <div class="clear-both"></div>
    </div>
</div>
<script src="js/jquery-3.2.1.min.js"></script>
<script>
    
</script>
<div class="height-500 " style="background:url('') no-repeat;width: 100%; ">
    <div class="width-1190 margin-auto height-500 padding-top-25" style="background-color: #F1F1F1">
        <div class="width-350 height-450 margin-auto bg-ffffff padding-top-10">
            <div class="padding-bottom-20 login-Method" style="border-bottom:1px solid #f4f4f4">
                <span class="display-inline-block font-size-18 text-center cursor login-active" style="width: 170px;border-right:1px solid #f4f4f4">账号登录</span>
                <span class="display-inline-block  font-size-18 text-center cursor" style="width: 170px">手机短信登录</span>
            </div>
            <div class="for1 margin-auto " style="margin-top: 40px">
                <div class="login-name height-40 width-300 margin-auto" style="border: 1px solid #bdbdbd">
                    <div class="height-40 float-left" style="width: 49px;border-right: 1px solid #bdbdbd"><i class="fa fa-user " style="font-size: 30px;padding-top: 5px;padding-left: 10px"></i></div>
                    <input type="text" placeholder="邮箱/用户名/已验证手机" style="">
                </div>
                <div class="login-pwd height-40 width-300 margin-auto" style="border: 1px solid #bdbdbd;margin-top: 40px">
                    <div class="height-40 float-left" style="width: 49px;border-right: 1px solid #bdbdbd"><i class="fa fa-unlock-alt " style="font-size: 30px;padding-top: 5px;padding-left: 10px"></i></div>
                    <input type="password" placeholder="密码" style="">
                </div>
                <div class="login">
                    <a>登录</a>
                </div>
            </div>
        </div>
    </div>
</div>
<!--底部-->
<div class="footer">
    <hr>
    <div class="width-1190 margin-auto">
        <div class="footer-menu padding-left-20">
            <ul class="display-block float-left font-size-14 margin-right-80 text-center">
                <h4>关于我们</h4>
                <li>公司简介</li>
                <li>诚聘英才</li>
                <li>媒体报道</li>
            </ul>
            <ul class="display-block float-left font-size-14 margin-right-80 text-center">
                <h4>新手指南</h4>
                <li>会员特权</li>
                <li>购物流程</li>
                <li>常见问题</li>
            </ul>
            <ul class="display-block float-left font-size-14 margin-right-80 text-center">
                <h4>配送与支付</h4>
                <li>发票抬头</li>
                <li>配送时效</li>
                <li>支付方式</li>
            </ul>
            <ul class="display-block float-left font-size-14 margin-right-80 text-center">
                <h4>服务保证</h4>
                <li>三包细则</li>
                <li>申请退款</li>
                <li>发票说明</li>
            </ul>
            <ul class="display-block float-left font-size-14 margin-right-80 text-center">
                <h4>帮助指南</h4>
                <li>找回密码</li>
                <li>快递查询</li>
                <li>联系我们</li>
            </ul>
            <div class="clear-both"></div>
        </div>
        <div class="clear-both"></div>
    </div>
    <div class="footer-info bg-242424 " >
        <div class="width-1190 margin-auto line-height-50">
            <div class="foot-logo float-left margin-top-10"><img src="img/logo.png" width="100" height="30"/></div>
            <div class="float-left margin-left-50">
                <span style="color: #959595">© 2005-2017 XXXX公司-时尚眼镜品牌 版权所有，并保留所有权利。公司地址：XXXXXXXXXXXXXXXXXX</span>
            </div>
            <div class="clear-both"></div>
        </div>
        <div class="width-1190 margin-auto " style="margin-top: 20px">
            <div class="links">
                <span class="display-block float-left font-size-12">友情链接:</span>
                <ul class="links-list">
                    <li><a class="hover-silver">百度一下</a></li>
                    <li><a class="hover-silver">百度一下</a></li>
                    <li><a class="hover-silver">百度一下</a></li>
                    <li><a class="hover-silver">百度一下</a></li>
                </ul>
            </div>
        </div>
        <div class="clear-both"></div>
    </div>
</div>
</body>
</html>
