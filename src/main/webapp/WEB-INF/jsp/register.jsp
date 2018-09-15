<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/9/11/011
  Time: 23:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>婚礼汇让结婚更简单（原119婚庆网）</title>
    <meta name="keywords" content="婚礼汇,119婚庆网,办婚礼,重庆婚礼酒店,重庆婚庆,婚礼租车"/>
    <meta name="description"
          content="婚礼汇（原119婚庆网）是一家专业的婚礼服务平台，为消费者提供最具影响力的婚礼服务：婚礼公司、婚礼酒店、婚礼摄像、婚礼策划、婚礼跟妆、婚礼租车等婚礼行业信息，实用的婚礼攻略与经验交流尽在婚礼汇。"/>
    <link rel="Bookmark" type="image/x-icon" href="../../../resources/favicon.ico"/>
    <link rel="icon" type="image/x-icon" href="../../../resources/favicon.ico"/>
    <link rel="shortcut icon" type="image/x-icon" href="../../../resources/favicon.ico"/>
    <link rel="apple-touch-icon" href="../../../resources/favicon.ico"/>
    <link rel="stylesheet" type="text/css" href="../../images/style.css"/>
    <script src="https://cdn.bootcss.com/jquery/3.3.1/jquery.min.js"></script>
    <script type="text/javascript" src="../../images/hlh.js"></script>
    <script type="text/javascript" src="/js/ajaxPackage.js"></script>
    <script src="/js/jquery-3.2.1.min.js"></script>
</head>
<body>
<%--ajax注册校验--%>
<script type="text/javascript">
    function ajaxValidate(){
        /*使用自己封装的ajax*/
        // var user_tel=document.getElementById("user_tel").value;
        // ajax({
        //     url:"/ajaxValidate",
        //     method:"post",
        //     data:"user_tel="+user_tel,
        //     success:function(data){
        //         var msg=document.getElementById("validate");
        //         msg.innerHTML=data;
        //     }
        // });

        /*使用Jquery的ajax*/
        var user_tel=document.getElementById("user_tel").value;
        $.ajax({
            url:"/ajaxValidate",
            type:"post",
            data:"user_tel="+user_tel,
            contentType:"application/x-www-form-urlencoded",
            success: function(data){
                var msg=document.getElementById("validate");
                msg.innerHTML=data;
            }
            });
    }
</script>
<!-- —————————————————————— 顶部内容 —————————————————————— -->
<div id="public-toolbar">
    <div class="layout_center layout_clear">
        <div class="page-logo layout_fl">
            <a href="#">
                <img src="../../images/logo.jpg"></a>
        </div>
        <div class="page-tels layout_fr">
            <span class="tel-show">全国免费咨询热线</span>
            <span class="tel-pink">
        <strong>400-666-888</strong></span>
        </div>
    </div>
</div>
<!-- —————————————————————— 顶部结束 —————————————————————— -->
<div class="user-form" data-img-url="http://img.119hqw.com/img/WebsiteImg/JQK51845110Xc.jpg" style="background: url(../../images/JQK51845110Xc.jpg);">
    <div class="layout_center">
        <div class="user-form-wrap">
            <div class="user-form-wraps">
                <div class="user-form-item">
                    <strong class="user-form-title">会员注册</strong></div>
                <div id="validate" style="color: red">${msg}</div>
                <form data-form="userlogin" action="doregister" method="post" onsubmit="return checkInput()">
                    <div class="user-form-item">
                        <input class="user-input" name="user_tel" id="user_tel" onblur="ajaxValidate()" type="text" max="15" maxlength="15" placeholder="手机号"></div>
                    <div class="user-form-item">
                        <input class="user-input" name="password" id="password" type="password" max="15" maxlength="15" placeholder="密码"></div>
                    <div class="user-form-item">
                        <input class="user-input" name="repassword" type="password" max="15" maxlength="15" placeholder="确认密码"></div>
                    <div class="user-form-item">
                    </div>
                    <input type="hidden" name="url" value="<%=request.getHeader("Referer") %>">
                    <div class="user-form-item">
                        <input class="user-form-button" type="submit" value="注&nbsp;&nbsp;册" id="user-login" style="font-weight: bold;width: 330px">
                        <div class="msg">
                            <!--
						<%=request.getAttribute("msg") == null ? "" : request.getAttribute("msg") %>
						-->
                        </div>
                    </div>
                </form>

            </div>
        </div>
    </div>
</div>
<!-- —————————————————————— JS功能 —————————————————————— -->
<script type="text/javascript">
    function changeCode(obj){
        obj.src = "vcode.do?id=" + Math.random();
    }
</script>
<!-- —————————————————————— 底部内容 —————————————————————— -->
<div class="page-footer">
    <div class="layout_center">
        <div class="footer-list">
            <dl class="footer-item">
                <h3>新手上路</h3>
                <a href="#" target="_blank">
                    <dd>
                        <b></b>如何注册
                    </dd>
                </a>
                <a href="#" target="_blank">
                    <dd>
                        <b></b>如何登录
                    </dd>
                </a>
                <a href="#" target="_blank">
                    <dd>
                        <b></b>如何预订
                    </dd>
                </a>
                <a href="#" target="_blank">
                    <dd>
                        <b></b>购物流程
                    </dd>
                </a>
                <a href="#" target="_blank">
                    <dd>
                        <b></b>预订须知
                    </dd>
                </a>
            </dl>
            <dl class="footer-item">
                <h3>公司信息</h3>
                <a href="#" target="_blank">
                    <dd>
                        <b></b>关于我们
                    </dd>
                </a>
                <a href="#" target="_blank">
                    <dd>
                        <b></b>用户协议
                    </dd>
                </a>
                <a href="#" target="_blank">
                    <dd>
                        <b></b>隐私声明
                    </dd>
                </a>
                <a href="#" target="_blank">
                    <dd>
                        <b></b>商家入驻协议
                    </dd>
                </a>
                <a href="#" target="_blank">
                    <dd>
                        <b></b>安全需知
                    </dd>
                </a>
            </dl>
            <dl class="footer-item">
                <h3>合作联系</h3>
                <a href="#" target="_blank">
                    <dd>
                        <b></b>联系我们
                    </dd>
                </a>
                <a href="#" target="_blank">
                    <dd>
                        <b></b>招商加盟
                    </dd>
                </a>
                <a href="#" target="_blank">
                    <dd>
                        <b></b>商户平台
                    </dd>
                </a>
                <a href="#" target="_blank">
                    <dd>
                        <b></b>招聘信息
                    </dd>
                </a>
            </dl>
            <dl class="footer-item">
                <h3>帮助中心</h3>
                <a href="#" target="_blank">
                    <dd>
                        <b></b>忘记密码
                    </dd>
                </a>
                <a href="#" target="_blank">
                    <dd>
                        <b></b>常见问题
                    </dd>
                </a>
                <a href="#" target="_blank">
                    <dd>
                        <b></b>在线客服
                    </dd>
                </a>
                <a href="#" target="_blank">
                    <dd>
                        <b></b>如何上传产品
                    </dd>
                </a>
                <a href="#" target="_blank">
                    <dd>
                        <b></b>如何成为商家
                    </dd>
                </a>
            </dl>
            <div class="footer-mobile">
                <img src="../../images/QRcode.jpg"/>
                <h2>官方微信</h2>
            </div>
        </div>
        <div class="footer-data0" oncontextmenu="return false;">
            <a href="javascript:;"><i class="footer-ad0" title="可信网站身份验证"></i></a>
            <a href="javascript:;"><i class="footer-ad1" title="重庆网警备案"></i></a>
            <a href="javascript:;"><i class="footer-ad2" title="重庆工商行政管理"></i></a>
            <a href="javascript:;"><i class="footer-ad3" title="安全联盟认证"></i></a>
        </div>
        <div class="footer-data1">
            友情链接：
            <a href="https://www.baidu.com/" target="\&quot;_blank\&quot;">百度</a>
            <em>|</em>
            <a href="https://www.taobao.com/" target="\&quot;_blank\&quot;">淘宝</a>
        </div>
        <div class="footer-data2">
            版权归朝蓬商贸公司所有 &nbsp;&nbsp;
            <a href="http://www.miitbeian.gov.cn" target="_blank">渝ICP备14001673号</a>
        </div>
    </div>
</div>
<%--表单验证--%>
<script type="text/javascript">
    function checkInput() {
        var user_tel=document.getElementById("user_tel").value;
        var password=document.getElementById("password").value;
        if(user_tel==null){
            alert("电话号码不能为空");
            return false;
        }
        if(password==null){
            alert("密码不能为空");
            return false;
        }
        if(!/^1[35678]\d{9}$/.test(user_tel)){
            alert("电话号码格式错误");
            return false;
        }if(!/^\w{6,12}$/.test(password)){
            alert("密码格式错误");
            return false;
        }
        return true;
    }
</script>
</body>
</html>
