<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/9/14/014
  Time: 9:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
    <link rel="stylesheet" type="text/css" href="images/buyCar.css"/>
    <script src="https://cdn.bootcss.com/jquery/3.3.1/jquery.min.js"></script>
    <script type="text/javascript" src="images/hlh.js"></script>
    <script type="text/javascript" src="images/usData.js"></script>
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
                        <a href="/welcome" class="use-item" target="_parent">会员登录</a>
                        <a href="/register" target="_parent">免费注册</a>
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
<div id="page_Auser">
    <div class="layout_center layout_clear">
        <div id="us_fl" class="layout_fl">
            <div class="us_uint">
                <h4 class="us_uint_menu"></h4>
                <ul class="us_uint_list">
                    <li class="cur"><a href="javascript:;">我的婚礼汇</a></li>
                </ul>
            </div>
            <div class="us_uint">
                <h4 class="us_uint_menu"></h4>
                <ul class="us_uint_list">
                    <li class=""><a href="http://www.119hqw.com/user/usCollect.php">我的收藏</a></li>
                </ul>
            </div>
            <div class="us_uint">
                <h4 class="us_uint_menu">我的订制</h4>
                <ul class="us_uint_list">
                    <li class=""><a href="http://www.119hqw.com/user/usDemand.php">需求发布</a></li>
                    <li class=""><a href="http://www.119hqw.com/user/usOrder.php?type=all">我的订单</a></li>
                    <li class="cur"><a href="/queryCart?user_id=${sessionScope.user_id_ses}">我的购物车</a></li>
                </ul>
            </div>
            <div class="us_uint">
                <h4 class="us_uint_menu">我的账户</h4>
                <ul class="us_uint_list">
                    <li class=""><a href="http://www.119hqw.com/user/user.php">个人信息</a></li>
                    <li class=""><a href="http://www.119hqw.com/user/usSafe.php">账户安全</a></li>
                    <li class=""><a href="http://www.119hqw.com/user/usAddress.php">收货地址</a></li>
                </ul>
            </div>
        </div>
        <div id="us_fr" class="layout_fl">
            <div class="us_ChildPage us_adjust_padding2 us2_PageUint2">
                <h4 class="us_ChildHead">我的购物车</h4>
                <div class="us_buycar">
                    <ul class="us_buycar_wrap">
                        <c:forEach var="cart" items="${carts}">
                            <li data-buy-list="11565596596859">
                                <div class="layout_clear">
                                    <div class="us_buycar_check layout_fl">
                                        <input type="checkbox" name="check" checked="true" switchbuycar="11565596596859" onclick="clickPrice()" />
                                    </div>
                                    <div class="us_unit_table layout_fl">
                                        <div class="us_order_line">
                                            <span>${cart.cart_time}</span>
                                            <span>订单号：11565596596859</span>
                                            <span></span>
                                        </div>
                                        <table>
                                            <tbody>
                                            <tr>
                                                <td><span class="cos_span">商品信息</span></td>
                                                <td><span class="cos_span">套餐类型/婚宴场地</span></td>
                                                <td><span class="cos_span">单价</span></td>
                                                <td><span class="cos_span">数量</span></td>
                                                <td><span class="cos_span">总金额</span></td>
                                                <td><span class="cos_span">操作</span></td>
                                            </tr>
                                            <tr>
                                                <td>
                                                    <div class="img">
                                                        <img src="http://www.119hqw.com/img/GoodsIco/cuH58409152gh.jpg" style="width:100px;" />
                                                        <span>${cart.cart_name}</span>
                                                    </div></td>
                                                <td><span class="cos_span">套餐类型：${cart.cart_type}</span><span class="cos_span">婚宴场地：${cart.cart_place}</span></td>
                                                <td><span class="cos_span" style="display:block">
                <ins></ins></span><span class="cos_span price">${cart.cart_price}0</span></td>
                                                <td>
    <span class="cos_span">
        <span class="amont_line">
        	<span class="amont_line_btn amont_line_reduce sub" data-buy-cut="11565596596859" data-type="buycar">-</span>
            <span class="amont_line_text" data-buy-num="11565596596859" name="BuyCarNum">${cart.cart_count}</span>
            <span class="amont_line_btn amont_line_push add" data-buy-add="11565596596859" data-type="buycar">+</span>
        </span>
    </span>
                                                </td>
                                                    <%-- <td><span class="cos_span"><span class="amont_line"><span class="amont_line_btn amont_line_reduce" data-buy-cut="11565596596859" data-type="buycar">-</span><span class="amont_line_text" data-buy-num="11565596596859" >${scart.cart_count}</span><span class="amont_line_btn amont_line_push" data-buy-add="11565596596859" data-type="buycar" onclick="EditBuyNum('add')">+</span></span></span></td> --%>
                                                <td><span class="cos_span"><em class="keyword-pink" data-price-id="11565596596859" id="total_price">${cart.cart_count * cart.cart_price}</em></span></td>
                                                <td><span class="cos_span"><a href="javascript:;" data-collect-goods="{CollectGoodsid:&quot;ujx58409137Gd&quot;}">移入收藏夹</a>/<a href="/deleteCart?cart_id=${cart.cart_id}&user_id=${cart.user_id}" data-buy-del="11565596596859">删除</a></span></td>
                                            </tr>
                                            </tbody>
                                        </table>
                                    </div>
                                </div></li>
                        </c:forEach>
                    </ul>
                </div>
                <div class="us_bottom_bar layout_clear">
                    <div class="us_buycar_check layout_fl">
                        <input type="checkbox" checked="true" name="checkAll" id="BuyCarCheckAll" style="margin-top: 24px"/>
                    </div>
                    <div class="us_buycar_state layout_fl">
                        <span class="cos_span"><a href="javascript:;">全选</a></span>
                        <span class="cos_span"><a href="/clearCart?user_id=${carts[0].user_id}" id="DeleteAll">清空购物车</a></span>
                    </div>
                    <div class="us_buycar_buy layout_fr">
                        <span class="cos_span">已选择<span id="BuyCarBalance"></span>件商品</span>
                        <span class="cos_span">总价：<em class="keyword-pink" id="AllPrice">￥3698.00</em></span>
                        <a href="http://www.119hqw.com/user/usPay.php" class="us_button">去结算</a>
                    </div>
                </div>
            </div>
        </div>
        <div style="height:0"></div>
    </div>
</div>
<!-- —————————————————————— Jquery功能 —————————————————————— -->
<script type="text/javascript">


    //计算总价
    function calcPrice(){
        var sum = 0;
        //获得所有name为check的选中状态的复选框,对其进行遍历
        $("[name='check']:checkbox:checked").each(function(){
            //获得该复选框同一行的总价文字
            var price = $(this).parent().parent().find("#total_price").text();
            sum += parseInt(price);
        });
        //显示到总价格标签中
        $("#AllPrice").text(sum);
    }
    //网页加载后
    $(function(){
        //调用计算总价
        calcPrice();
        //给name为checkAll的复选框添加点击事件
        $("[name='checkAll']:checkbox").click(function(){
            //找到所有name为check的复选框，将checked属性设置为和该复选框一样
            $("[name='check']:checkbox").prop("checked",$(this).prop("checked"));
            calcPrice();
        });
        //点击商品的复选框后重新计算价格
        $("[name='check']:checkbox").click(function(){
            calcPrice();
        });

        //给所有的+号添加点击事件
        $(".add").click(function(){
            //获得数量文字
            var num = parseInt($(this).prev("span").text());
            if(num < 10){
                //更新数量
                $(this).prev("span").text(num+1);
                //获得单价
                var total_price = $(this).parent().parent().parent().parent().find(".price").text() * (num + 1);
                //更新同一行的总价
                $(this).parent().parent().parent().parent().find("#total_price").text(total_price);
                //更新所有商品总价
                calcPrice();
            }
        });
        //给所有的-号添加点击事件
        $(".sub").click(function(){
            //获得数量文字
            var num = parseInt($(this).next("span").text());
            if(num > 1){
                //更新数量
                $(this).next("span").text(num-1);
                //获得单价
                var total_price = $(this).parent().parent().parent().parent().find(".price").text() * (num - 1);
                //更新同一行的总价
                $(this).parent().parent().parent().parent().find("#total_price").text(total_price);
                //更新所有商品总价
                calcPrice();
            }
        });

        /*

        //给所有的+号添加点击事件
        $(".add").click(function(){
            //获得数量文字
            var num = parseInt($(this).prev("span").text());
            if(num < 10){
                //更新数量
                $(this).prev("span").text(num+1);
                //获得单价
                var total_price = $(this).parent().parent().find(".price").text() * (num + 1);
                //更新同一行的总价
                $(this).parent().parent().find(".total_price").text(total_price);
                //更新所有商品总价
                calcPrice();
            }
        });
        //给所有的-号添加点击事件
        $(".sub").click(function(){
            //获得数量文字
            var num = parseInt($(this).next("span").text());
            if(num > 1){
                //更新数量
                $(this).next("span").text(num-1);
                //获得单价
                var total_price = $(this).parent().parent().find(".price").text() * (num - 1);
                //更新同一行的总价
                $(this).parent().parent().find(".total_price").text(total_price);
                //更新所有商品总价
                calcPrice();
            }
        });
        //给name为pay的button添加点击事件
        $("[name='pay']:button").click(function(){
            var jsons = new Array();
            var i = 0;
            //遍历所有被选中的商品
            $("[name='check']:checkbox:checked").each(function(){
                var id = $(this).parent().parent().find(".id").text();
                var name = $(this).parent().parent().find(".name").text();
                var price = $(this).parent().parent().find(".price").text();
                var num = $(this).parent().parent().find(".num").text();
                var total = $(this).parent().parent().find(".total_price").text();
                //向数组添加JSON对象
                jsons[i++] = {"id":id,"name":name,"price":price,"num":num,"total":total};
            });
            //JSON.stringify是将json数组转换为字符串
            alert(JSON.stringify(jsons));
        }); */
    });

    /* (function($){
        window.M={
            cutBuyCar:function(id,type,pay){
                $.post(CONFIG.root + 'library/usData.php?action=single_buycar_price',{BuycarId:id,type:type,pay:pay},function(data){
                    if(data.flag == 2){
                        $("#AllPrice").text('￥'+data.money);
                        $("[data-price-id="+id+"]").text(data.buycarMoney);
                        $("[data-buy-num="+id+"]").text(data.num);
                    }else{
                        base.success(data.warn);
                    }
                },"json");
            }
        }
    })(jQuery);
    //添加
    $(document).on('click','[data-buy-add]',function(){
        M.cutBuyCar($(this).attr('data-buy-add'),'add',$(this).attr('data-type'));
    });
    //减少
    $(document).on('click','[data-buy-cut]',function(){
        M.cutBuyCar($(this).attr('data-buy-cut'),'cut',$(this).attr('data-type'));
    }); */
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
</body>
</html>
