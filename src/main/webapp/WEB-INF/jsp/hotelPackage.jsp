<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/9/13/013
  Time: 20:32
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
    <link rel="Bookmark" type="image/x-icon" href="favicon.ico"/>
    <link rel="icon" type="image/x-icon" href="favicon.ico"/>
    <link rel="shortcut icon" type="image/x-icon" href="favicon.ico"/>
    <link rel="apple-touch-icon" href="favicon.ico"/>
    <link rel="stylesheet" type="text/css" href="images/style.css"/>
    <script src="https://cdn.bootcss.com/jquery/3.3.1/jquery.min.js"></script>
    <script type="text/javascript" src="images/hlh.js"></script>
</head>
<body>
<!--顶部通长-->
<div id="public-navbar">
    <!--居中容器-->
    <div class="layout_center layout_clear" style="overflow:visible">
        <!--左对齐内容-->
        <div class="layout_fl">
            你好，欢迎来到 婚礼汇
        </div>
        <ul class="layout_fr fl_li">
            <li>
                <div class="use-layout">
                    <a href="javascript:;"><span class="use-status">会员中心</span></a>
                    <div class="use-option" style="display: none">
                        <a href="usLogin.jsp" class="use-item" target="_parent">会员登录</a>
                        <a href="#" target="_parent">免费注册</a>
                    </div>
                    <i class="use-arrow page_icon"></i>
                </div></li>
            <li><span class="use-hr"></span></li>
            <li><a href="/queryCart?user_id=${sessionScope.user_id_ses}">我的购物车</a></li>
            <li><span class="use-hr"></span></li>
            <li>
                <div class="use-layout">
                    <a href="javascript:;"><span class="use-status">商户平台</span></a>
                    <div class="use-option" style="display: none;">
                        <a href="#" class="use-item" target="_parent">商户登录</a>
                        <a href="#" target="_parent">免费入驻</a>
                    </div>
                    <i class="use-arrow page_icon"></i>
                </div></li>
            <li><span class="use-hr"></span></li>
            <li><a href="#">联系我们</a></li>
        </ul>
        <!--右对齐内容-->
    </div>
</div>
<!--顶部LOGO 搜索 发布 联系-->
<div id="public-toolbar">
    <div class="layout_center layout_clear">
        <div class="page-logo layout_fl"><a href="#"><img src="images/logo.jpg" alt="婚礼汇"></a></div>
        <div class="page-search layout_fl">
            <div class="page-search-bar layout_clear">
                <div class="page-search-text layout_fl">
                    <input type="text" class="search-cover" placeholder="搜索产品或店铺">
                </div>
                <div class="page-search-btn layout_fl">
                    <input type="button" value="搜索" class="search-button">
                </div>
            </div>
            <ul class="page-search-key layout_fl fl_li">
                <li class="search-key-ous">大家都在搜：</li>
                <li><a href="#" target="_blank">酒店</a></li>
                <li><a href="#" target="_blank">婚庆用车</a></li>
                <li><a href="#" target="_blank">度假</a></li>
                <li><a href="#" target="_blank">婚纱租赁</a></li>
            </ul>
        </div>
        <div class="page-release layout_fl"><a href="#" target="_blank">立即发布需求</a></div>
        <div class="page-tels layout_fr">
            <span class="tel-show"> 全国免费咨询热线 </span>
            <span class="tel-pink">
                <strong>400-666-888</strong>
            </span>
        </div>
    </div>
</div>
<!--顶部导航条-->
<id id="page-middle-bar">
    <div class="layout_center layout_clear">
        <div class="button layout_fl">全部分类</div>
        <ul class="layout_clear layout_fl fl_li">
            <li><a href="/index">首页</a></li>
            <li><a href="/hotelPage?currentPage=0">婚宴场地</a></li>
            <li><a href="http://">婚纱摄影</a></li>
            <li><a href="http://">婚庆用车</a></li>
            <li><a href="http://">婚庆公司</a></li>
            <li><a href="http://">婚具租赁</a></li>
            <li><a href="http://">定制人员</a></li>
            <li><a href="http://">婚品商城</a></li>
            <li><a href="http://">蜜月度假</a></li>
        </ul>
    </div>
</id>
<!-- —————————————————————— 顶部结束 —————————————————————— -->

<!-- ——————————————————— 套餐页 A B 多场地  ——————————————————— -->
<div id="page-godMx">
    <div class="layout_center">
        <div class="path">
            <span class="root"><a href="/index">婚礼汇</a></span>
            <em>&gt;</em>
            <span class="root"><a href="/hotelPage?currentPage=0">婚宴场地</a></span>
            <em>&gt;</em>
            <span class="root"><a href="/hotelDetails?hotel_id=${hotel.hotel_id}">特色套餐</a></span>
            <em>&gt;</em>
            <a href="/hotelPackage?package_id=${hotelPackageDetails.package_id}&hotel_id=${hotel.hotel_id}" class="page cur">${hotelPackageDetails.package_name}</a>
        </div>
        <div id="gods-header" class="gods-header layout_clear" style="margin-top:0px;">
            <h2 class="gods-header-tit">${hotel.hotel_name}</h2>
            <div class="gods-header-fl layout_fl">
                <div class="gods-display-img" id="gods-display-img" data-imagelist="http://img.119hqw.com/img/GoodsWin/XqS58408837QL/LQY58408855zq.jpg||http://img.119hqw.com/img/GoodsWin/XqS58408837QL/pJY58408863oN.jpg||http://img.119hqw.com/img/GoodsWin/XqS58408837QL/Fqn58408868TO.jpg" data-imagename="1699元套餐">
                    <img src="http://img.119hqw.com/img/GoodsWin/XqS58408837QL/Fqn58408868TO.jpg" />
                </div>
                <div class="gods-display-list" id="gods-display-list">
                    <ul class="layout_clear fl_li" id="gods-imagelist">
                        <li class=""><img src="/images/${hotelPackageDetails.package_img1}" /></li>
                        <li class=""><img src="/images/${hotelPackageDetails.package_img2}" /></li>
                        <li class="win_current"><img src="/images/${hotelPackageDetails.package_img3}" /></li>
                    </ul>
                </div>
                <script> (function (o) { var div_img = document.getElementById('gods-display-img'); if (typeof o == 'undefined') { div_img.innerHTML = '未上传'; div_img.style.textAlign = 'center'; div_img.style.lineHeight = '316px'; } else { div_img.innerHTML = o.innerHTML; } })(document.getElementById('gods-imagelist').getElementsByTagName('li')[0]); </script>
                <div class="gods-attrid">
                    <span class="fl">商品编号：XqS58408837QL</span>
                    <span class="fr"><span class="gods-share"><i class="page_icon"></i>分享</span><span class="gods-follow" data-collect-goods="{CollectGoodsid:&quot;XqS58408837QL&quot;}" style="cursor:pointer;"><i class="page_icon page_icon"></i>收藏商品 </span></span>
                </div>
            </div>
            <div class="gods-header-cn layout_fl">
                <div class="gods-uhbasic">
                    <p class="gods-uhbasic-tit">${hotelPackageDetails.package_name}</p>
                    <p class="gods-uhbasic-stat">${hotelPackageDetails.package_content}</p>
                </div>
                <div class="gods-uhsale layout_clear">
                    <div class="gods-uhsale-fl layout_fl">
                        <div class="gods-uhprice-item">
                            <span class="gods-uhprice-label">原价</span>
                            <h4 id="MarkPrice">￥${hotelPackageDetails.package_price + 300}</h4>
                        </div>
                        <div class="gods-uhprice-item">
                            <span class="gods-uhprice-label">平台价</span>
                            <h2 id="price"><em class="gods-uhprice-str">￥</em><span class="goodsPrice">${hotelPackageDetails.package_price}</span></h2>
                        </div>
                    </div>
                    <div class="gods-uhsale-fr layout_fl">
                        <span>累计评价</span>
                        <h3>0</h3>
                    </div>
                </div>
                <div class="gods-pro">
                    <dl class="gods-pro-item layout_clear">
                        <dt class="gods-pro-label">
                            联系地址
                        </dt>
                        <dd class="gods-pro-param gods-pro-primary layout_fl">
                            ${hotel.hotel_tel}
                        </dd>
                    </dl>
                    <dl class="gods-pro-item layout_clear">
                        <dt class="gods-pro-label">
                            服务
                        </dt>
                        <dd class="gods-pro-param gods-pro-primary layout_fl">
                            由
                            <a href="" class="gods-pro-key1">${hotel.hotel_name}</a> 提供售后服务
                            <a href="javascript:;" class="gods-pro-key0">联系卖家</a>
                        </dd>
                    </dl>
                    <style> .check { border: 2px solid #fa638c !important; } .check span { color: #fa638c !important; } </style>
                    <dl class="gods-pro-item layout_clear">
                        <dt class="gods-pro-label gods-pro-clear0">
                            套餐类型
                        </dt>
                        <dd class="gods-pro-param gods-pro-primary layout_fl">
                            <ul class="gods-pro-list gods-pro-list0">
                                <li class="check" dada-sf-id="h41254dq" data-sku-id="oQJ58408908wE"><a href="javascript:;"><span>A款</span></a></li>
                                <li dada-sf-id="h41254dq" data-sku-id="YCL58408914Fl"><a href="javascript:;"><span>B款</span></a></li>
                            </ul>
                        </dd>
                    </dl>
                    <dl class="gods-pro-item layout_clear">
                        <dt class="gods-pro-label gods-pro-clear0">
                            婚宴场地
                        </dt>
                        <dd class="gods-pro-param gods-pro-primary layout_fl">
                            <ul class="gods-pro-list gods-pro-list0">
                                <c:forEach var="room" items="${rooms}">
                                    <c:choose>
                                        <c:when test="${room == rooms[0]}">
                                            <li class="check" dada-sf-id="j14fqf" data-sku-id="lGL58408921aI"><a href="javascript:;"><span>${room.room_name}</span></a></li>
                                        </c:when>
                                        <c:otherwise>
                                            <li dada-sf-id="j14fqf" data-sku-id="lGL58408921aI"><a href="javascript:;"><span>${room.room_name}</span></a></li>
                                        </c:otherwise>
                                    </c:choose>
                                </c:forEach>
                            </ul>
                        </dd>
                    </dl>
                    <dl class="gods-pro-item layout_clear">
                        <dt class="gods-pro-label gods-pro-clear2">
                            数量
                        </dt>
                        <dd class="gods-pro-param gods-pro-primary layout_fl">
                            <span class="gods-counter"><input type="text" class="gods-counter-text" id="packageNum" name="BuyCarNum" value="1" maxlength="3" min="1" />
                            <span class="gods-counter-btn"><span class="gods-counter-push page_icon" title="加" onclick="EditBuyNum('add')"></span><span class="gods-counter-reduce page_icon" title="减" onclick="EditBuyNum('cut')"></span></span><span class="gods-counter-outs">件</span><span class="gods-counter-num" id="stock">(库存99件)</span></span>
                        </dd>
                    </dl>
                    <dl class="gods-pro-item layout_clear">
                        <dt class="gods-pro-label">
                            服务承诺
                        </dt>
                        <dd class="gods-pro-param gods-pro-middle layout_fl">
                            正品保障 沟通预订 资金管理 满意后付款
                        </dd>
                    </dl>
                    <dl class="gods-pro-item layout_clear">
                        <dd class="gods-pro-param gods-pro-middle layout_fl">
                            <a href="javascript:;" data-type="buy-now" class="gods-pro-payfor">立即购买</a>
                            <a href="/addCart?currentTime=<%=new Date() %>" id="addPackage" data-type="add" class="gods-pro-payfor">
                            <span onclick="getPackageNum()">加入购物车</span>
                            </a>
                        </dd>
                    </dl>
                </div>
            </div>
            <div class="gods-header-fr layout_fl">
                <div class="gods-shop">
                    <div class="gods-shop-tit">${store.hotel_name}</div>
                    <div class="gods-shop-logo">
                        <img src="http://img.119hqw.com/img/seLogo/msF58469607Jg.jpg" style="width:100%;height: 100%;" />
                    </div>
                    <div class="gods-shop-go">
                        <a href="http://www.119hqw.com/store.php?seid=dWP57798753xC" class="cur">进入店铺</a>&nbsp;
                        <a href="javascript:;" data-seid="{CollectSeid:&quot;dWP57798753xC&quot;}">收藏店铺</a>
                    </div>
                </div>
                <div class="gods-aside-inset">
                    <img src="http://img.119hqw.com/img/WebsiteImg/qER49920125Kw.jpg" style="margin: auto;" />
                </div>
                <ul class="gods-other-list">
                    <li><a href="http://www.119hqw.com/store.php?seid=ccn54760154fg">
                        <div class="wrap">
                            <img src="http://img.119hqw.com/img/seLogo/LSN54767537nb.jpg" style="width:100%;" />
                            <span class="gods-inc"><span class="gods-inc-text" title="湘域中餐厅">湘域中餐厅</span></span>
                        </div></a></li>
                    <li><a href="http://www.119hqw.com/store.php?seid=XsT54860328Bd">
                        <div class="wrap">
                            <img src="http://img.119hqw.com/img/seLogo/Hbp54860401oB.jpg" style="width:100%;" />
                            <span class="gods-inc"><span class="gods-inc-text" title="中天大酒楼">中天大酒楼</span></span>
                        </div></a></li>
                </ul>
            </div>
        </div>
        <div id="gods-section" class="gods-section layout_clear">
            <div class="gods-grids-fl layout_fl">
                <div class="gods-aside-hd">
                    相似产品
                    <a href="javascript:;" class="layout_fr">更多</a>
                </div>
                <ul id="append" class="gods-aside-list">
                    <li><a href="GoodsMx.php?goodsid=QdX54584013QY">
                        <div class="gods-aside-img">
                            <img class="lazy" src="http://img.119hqw.com/img/GoodsIco/iQP54584096YB.jpg" data-original="http://img.119hqw.com/img/GoodsIco/iQP54584096YB.jpg" style="width: 100%; display: block;" />
                        </div>
                        <div class="gods-aside-dis">
                            <p class="gods-aside-price"><span>￥0.00</span></p>
                            <p class="gods-aside-text">大厅</p>
                        </div></a></li>
                    <li><a href="GoodsMx.php?goodsid=ler54515894yI">
                        <div class="gods-aside-img">
                            <img class="lazy" src="http://img.119hqw.com/img/GoodsIco/mOw54515946xV.jpg" data-original="http://img.119hqw.com/img/GoodsIco/mOw54515946xV.jpg" style="width: 100%; display: block;" />
                        </div>
                        <div class="gods-aside-dis">
                            <p class="gods-aside-price"><span>￥0.00</span></p>
                            <p class="gods-aside-text">大厅</p>
                        </div></a></li>
                    <li><a href="GoodsMx.php?goodsid=uEv54601164qv">
                        <div class="gods-aside-img">
                            <img class="lazy" src="http://img.119hqw.com/img/GoodsIco/TyG54601171Pr.jpg" data-original="http://img.119hqw.com/img/GoodsIco/TyG54601171Pr.jpg" style="width: 100%; display: block;" />
                        </div>
                        <div class="gods-aside-dis">
                            <p class="gods-aside-price"><span>￥0.00</span></p>
                            <p class="gods-aside-text">大厅</p>
                        </div></a></li>
                    <li><a href="GoodsMx.php?goodsid=GLx54598732tl">
                        <div class="gods-aside-img">
                            <img class="lazy" src="http://img.119hqw.com/img/GoodsIco/yxL54598863Gg.jpg" data-original="http://img.119hqw.com/img/GoodsIco/yxL54598863Gg.jpg" style="width: 100%; display: block;" />
                        </div>
                        <div class="gods-aside-dis">
                            <p class="gods-aside-price"><span>￥0.00</span></p>
                            <p class="gods-aside-text">大厅</p>
                        </div></a></li>
                    <li><a href="GoodsMx.php?goodsid=YKj54688158qS">
                        <div class="gods-aside-img">
                            <img class="lazy" src="http://img.119hqw.com/img/GoodsIco/tJJ54688344wT.jpg" data-original="http://img.119hqw.com/img/GoodsIco/tJJ54688344wT.jpg" style="width: 100%; display: block;" />
                        </div>
                        <div class="gods-aside-dis">
                            <p class="gods-aside-price"><span>￥0.00</span></p>
                            <p class="gods-aside-text">大厅</p>
                        </div></a></li>
                </ul>
            </div>
            <div class="gods-grids-fr layout_fl">
                <div class="gods-grids-swit">
                    <ul id="gods-swit-list" class="gods-swit-list layout_clear fl_li">
                        <li class="current"><a href="javascript:;">商品介绍</a></li>
                        <li class=""><a href="javascript:;">评价(0)</a></li>
                    </ul>
                </div>
                <div class="gods-swit-coloum" id="gods-swit-coloum">
                    <div class="gods-swit-uint" style="display: block;">
                        <div class="gods-gdx-img">
                            <p>
                                <img alt="" src="images/${hotelPackageDetails.package_menuA}" style="height:1280px; width:904px" />
                                <img alt="" src="images/${hotelPackageDetails.package_menuB}" style="height:1280px; width:904px" />
                            </p>
                        </div>
                    </div>
                    <div class="gods-swit-uint" style="display: none;">
                        <div class="gods-gdx-eval">
                            <span class="cos_span"><label><input type="radio" value="全部评论" name="comment_select" /><span class="gdx-eval-empty">全部评论(0)</span></label></span>
                            <span class="cos_span"><label><input type="radio" value="图片" name="comment_select" /><span class="gdx-eval-empty">图片(0)</span></label></span>
                            <span class="cos_span"><label><input type="radio" value="好评" name="comment_select" /><span class="gdx-eval-empty">好评(0)</span></label></span>
                            <span class="cos_span"><label><input type="radio" value="一般" name="comment_select" /><span class="gdx-eval-empty">一般(0)</span></label></span>
                            <span class="cos_span"><label><input type="radio" value="差评" name="comment_select" /><span class="gdx-eval-empty">差评(0)</span></label></span>
                        </div>
                        <div class="gdx-eval-wrap">
                            <ul class="gdx-eval-list">
                                <li>
                                    <div>
                                        当前没有评论。
                                    </div></li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div style="height:0"></div>
    </div>
</div>
<!-- —————————————————————— Jquery功能 —————————————————————— -->
<script type="text/javascript">

    Date.prototype.Format = function (fmt) {
        var o = {
            "M+": this.getMonth() + 1, //月份
            "d+": this.getDate(), //日
            "h+": this.getHours(), //小时
            "m+": this.getMinutes(), //分
            "s+": this.getSeconds(), //秒
            "S": this.getMilliseconds() //毫秒
        };
        if (/(y+)/.test(fmt)) {
            fmt = fmt.replace(RegExp.$1, (this.getFullYear() + "").substr(4 - RegExp.$1.length));
        }
        for (var k in o)
            if (new RegExp("(" + k + ")").test(fmt))
                fmt = fmt.replace(RegExp.$1, (RegExp.$1.length == 1) ? (o[k]) : (("00" + o[k]).substr(("" + o[k]).length)));
        return fmt;

    }

    var cart_time = "";
    var cart_name = "";
    var cart_type = "";
    var cart_place = "";
    var cart_price = "";
    var cart_count = "";
    var cart_hotelname = "";

    function post(){
        $.post("addCart.do",
            {'cart_time':cart_time,'cart_name':cart_name,'cart_type':cart_type,'cart_place':cart_place,
                'cart_price':cart_price,'cart_count':cart_count,'cart_hotelname':cart_hotelname
            },function(){

            });
    }

    $(function(){
        $("[data-type='add']").click(function(){
            cart_time = new Date().Format("yyyy-MM-dd hh:mm:ss");
            cart_name = $(".gods-uhbasic-tit").text();
            cart_type = $(".check[dada-sf-id='h41254dq']").text();
            cart_place = $(".check[dada-sf-id='j14fqf']").text();
            cart_price = $(".goodsPrice").text();
            cart_count = $(".gods-counter-text").val();
            cart_hotelname = $(".gods-shop-tit").text();
            post();
        });
    });

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
                <img src="images/QRcode.jpg"/>
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
<%--获取套餐数量--%>
<script type="text/javascript">
    function getPackageNum() {
        var url=document.getElementById("addPackage");
        var packageNum=document.getElementById("packageNum").value;
        var sendurl=url.getAttribute("href")+"&packageNum="+packageNum;
        url.href=sendurl;
    }
</script>
</body>
</html>
