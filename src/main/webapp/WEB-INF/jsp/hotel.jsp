<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/9/12/012
  Time: 10:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>婚宴场地</title>
    <link href="css/wedding-4.css" rel="stylesheet"/>
    <link rel="icon" href="images/favicon.ico" />
    <!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"
            integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
</head>
<script type="text/javascript">
    function lastPage() {
        var lastPage=document.getElementById("lastPage");
        var currentPage=${hotelPages.currentPage};
        if(currentPage==0){
            lastPage.disabled=true;
        }else{
            window.location.href="/hotelPage?currentPage="+(currentPage-1);
        }
    }

    function nextPage() {
        var lastPage=document.getElementById("lastPage");
        var currentPage=${hotelPages.currentPage};
        var pageCount=${hotelPages.pageCount};
        if(currentPage==pageCount-1){
            lastPage.disabled=true;
        }else{
            window.location.href="/hotelPage?currentPage="+(currentPage+1);
        }

    }

</script>
<body>

<div id="public-navbar">
    <div class="layout_center layout_clear" style="overflow:visible">
        <div class="layout_fl">你好，欢迎来到 婚礼汇</div>
        <ul class="layout_fr fl_li">
            <li>
                <div class="use-layout">
                    <a>
                        <span class="use-status">会员中心</span>
                    </a>
                    <div class="use-option" style="display:none">
                        <a>会员登录</a>
                        <a>免费注册</a>
                    </div>
                    <i class="use-arrow page_icon"></i>
                </div>
            </li>
            <li>
                <span class="use-hr"></span>
            </li>
            <li>
                <a href="/queryCart?user_id=${sessionScope.user_id_ses}">我的购物车</a>
            </li>
            <li>
                <span class="use-hr"></span>
            </li>
            <li>
                <div class="use-layout">
                    <a>
                        <span class="use-status">商户平台</span>
                    </a>
                    <div class="use-option" style="display: none;">
                        <a>商户登录</a>
                        <a>免费入驻</a>
                    </div>
                    <i class="use-arrow page_icon"></i>
                </div>
            </li>
            <li>
                <span class="use-hr"></span>
            </li>
            <li>
                <a>联系我们</a>
            </li>
        </ul>
    </div>
</div>

<div id="public-toolbar" class="hidden_active">
    <div class="layout_center layout_clear">
        <div class="page-logo layout_fl"><a><img src="images/rxT54692503vu.jpg"></a></div>
        <div class="page-search layout_fl">
            <div class="page-search-bar layout_clear">
                <div class="page-search-text layout_fl">
                    <input type="text" class="search-cover" placeholder="搜索产品或店铺">
                </div>
                <div class="page-search-btn layout_fl">
                    <input type="button" value="搜索" class="search-button">
                </div>
            </div>
            <ul class="page-search-key layout_clear fl_li" >
                <li class="search-key-ous">大家都在搜：</li>
                <li><a>酒店</a></li>
                <li><a>婚纱</a></li>
                <li><a>婚庆用车</a></li>
                <li><a>度假</a></li>
            </ul>
        </div>
        <div class="page-release layout_fl">
            <a>立即发布需求</a>
        </div>
        <div class="page-tels layout_fr">
            <span class="tel-show">全国免费咨询热线</span>
            <span class="tel-pink"><strong>023-6766-4541</strong></span>
        </div>
    </div>
</div>
<div id="page-middle-bar">
    <div class="layout_center layout_clear">
        <div class="button layout_fl">全部分类</div>
        <ul class="layout_clear layout_fl fl_li">
            <li><a href="/index">首页</a></li>
            <li><a href="/hotelPage?currentPage=0">婚宴场地</a></li>
            <li><a>婚纱摄影</a></li>
            <li><a>婚庆用车</a></li>
            <li><a>婚庆公司</a></li>
            <li><a>婚具租赁</a></li>
            <li><a>定制人员</a></li>
            <li><a>婚品商城</a></li>
            <li><a>蜜月度假</a></li>
            <li><a>视频秀</a></li>
        </ul>
    </div>
</div>
<div id="page-god">
    <div class="layout_center">
        <div class="path">
            <span><a href="/index">婚礼汇</a></span>
            <em>></em>
            <a href="/hotelPage?currentPage=0" class="page_cur">婚宴场地</a>
        </div>
        <div class="god-select">
            <div class="god-select-ctrl layout_clear">
                <div class="god-unctrl-l">
                    <a href="wedding.html" class="curl">综合</a>
                    <a href="wedding.html">最新<span class="in-unctrl-up page_icon"></span></a>
                </div>
                <div class="god-unctrl-r layout_fr">
                    <span class="c-sort">${hotelPages.currentPage+1}/${hotelPages.pageCount}</span>
                    <span class="c-page">
                        	<span class="c-page-l page_icon" id="lastPage" title="上一页" onclick="lastPage()"></span>
                            <span class="c-page-r page_icon" id="nextPage" title="下一页" onclick="nextPage()"></span>
                    </span>
                    <a href="wedding.html">
                        切换到商品展示&nbsp;<span class="show-seller page_icon" title="切换到商品展示"></span>
                    </a>
                </div>
            </div>
        </div>

        <div class="god-gdx-wrap">

            <ul class="god-aside-listr">
                <c:forEach var="hotel" items="${hotelPages.data}">
                <li>
                    <div class="gdx-lists-wrap layout_clear">
                        <div class="gdx-lists-img layout_fl">
                            <a href="/hotelDetails?hotel_id=${hotel.hotel_id}"><img src="images/${hotel.hotel_img}" style="display:block"></a>
                        </div>
                        <div class="gdx-lists-data">
                            <h2>
                                <a href="">${hotel.hotel_name}</a>
                            </h2>
                            <div class="gdx-lists-local">
                                <span class="page_icon in_local_icon"></span>
                                ${hotel.hotel_tel}
                            </div>
                            <div class="gdx-lists-heart">
                                	<span class="page_icon add-heart-out">
                                    	<span class="page_icon add-heart-in" style="width:${hotel.hotel_star*20}%"></span>
                                    </span>
                                星级推荐
                            </div>
                            <div class="gdx-lists-info">
                                <div class="gdx-lists-icon">
                                    <a href="field.html"><i class="page_icon in-data-Icon0"></i></a><a href="field.html"><i class="page_icon in-data-Icon1"></i></a><a href="field.html"><i class="page_icon in-data-Icon2"></i></a>
                                </div>
                            </div>
                        </div>
                    </div>
                </li>
                </c:forEach>
                <div style="width: 100%;text-align: center">
                <nav aria-label="Page navigation">
                    <ul class="pagination">
                    <c:if test="${hotelPages.currentPage==0}">
                        <li class="disabled">
                    </c:if>
                    <c:if test="${hotelPages.currentPage!=0}">
                        <li>
                    </c:if>
                            <a href="/hotelPage?currentPage=${hotelPages.currentPage-1}" aria-label="Previous">
                                <span aria-hidden="true">&laquo;</span>
                            </a>
                        </li>
                        <c:forEach var="hotel" begin="0" end="${hotelPages.pageCount-1}" step="1">
                            <c:if test="${hotelPages.currentPage==hotel}">
                                <li class="active">
                            </c:if>
                            <c:if test="${hotelPages.currentPage!=hotel}">
                                <li>
                            </c:if>
                                <a href="/hotelPage?currentPage=${hotel}">${hotel+1}</a>
                            </li>
                        </c:forEach>

                        <c:if test="${hotelPages.currentPage==(hotelPages.pageCount-1)}">
                        <li class="disabled">
                        </c:if>
                        <c:if test="${hotelPages.currentPage!=(hotelPages.pageCount-1)}">
                        <li>
                        </c:if>
                            <a href="/hotelPage?currentPage=${hotelPages.currentPage+1}" aria-label="Next">
                                <span aria-hidden="true">&raquo;</span>
                            </a>
                        </li>
                    </ul>
                </nav>
                </div>
            </ul>
            <ul class="god-aside-list1">
                <h2 class="god-aside-tit">热门推荐</h2>
                <li>
                    <div class="gdx-list-wrap">
                        <a href="field.html" target="_blank">
                            <img src="images/Yrm54858716fa.jpg" style="width:100%; display:block">
                        </a>
                        <h4 class="gdx-list-tit"><a href="field.html">礼宴天下</a></h4>
                        <div class="gdx-list-price layout_clear"></div>
                        <div class="gdx-list-add">
                            <a><span class="keyword-gray">礼宴天下</span></a>
                        </div>
                    </div>
                </li>
                <li>
                    <div class="gdx-list-wrap">
                        <a href="field.html" target="_blank">
                            <img src="images/Yrm54858716fa.jpg" style="width:100%; display:block">
                        </a>
                        <h4 class="gdx-list-tit"><a href="field.html">礼宴天下</a></h4>
                        <div class="gdx-list-price layout_clear"></div>
                        <div class="gdx-list-add">
                            <a><span class="keyword-gray">礼宴天下</span></a>
                        </div>
                    </div>
                </li>
                <li>
                    <div class="gdx-list-wrap">
                        <a href="field.html" target="_blank">
                            <img src="images/Yrm54858716fa.jpg" style="width:100%; display:block">
                        </a>
                        <h4 class="gdx-list-tit"><a href="field.html">礼宴天下</a></h4>
                        <div class="gdx-list-price layout_clear"></div>
                        <div class="gdx-list-add">
                            <a><span class="keyword-gray">礼宴天下</span></a>
                        </div>
                    </div>
                </li>
                <li>
                    <div class="gdx-list-wrap">
                        <a href="field.html" target="_blank">
                            <img src="images/Yrm54858716fa.jpg" style="width:100%; display:block">
                        </a>
                        <h4 class="gdx-list-tit"><a href="field.html">礼宴天下</a></h4>
                        <div class="gdx-list-price layout_clear"></div>
                        <div class="gdx-list-add">
                            <a><span class="keyword-gray">礼宴天下</span></a>
                        </div>
                    </div>
                </li>
                <li>
                    <div class="gdx-list-wrap">
                        <a href="field.html" target="_blank">
                            <img src="images/Yrm54858716fa.jpg" style="width:100%; display:block">
                        </a>
                        <h4 class="gdx-list-tit"><a href="field.html">礼宴天下</a></h4>
                        <div class="gdx-list-price layout_clear"></div>
                        <div class="gdx-list-add">
                            <a><span class="keyword-gray">礼宴天下</span></a>
                        </div>
                    </div>
                </li>
            </ul>
        </div>

    </div>
</div>
<div class="page-footer">
    <div class="layout_center">
        <div class="footer-list">
            <dl class="footer-item">
                <h3>新手上路</h3>
                <a  >
                    <dd><b></b>如何注册</dd>
                </a>
                <a  >
                    <dd><b></b>如何登录</dd>
                </a>
                <a  >
                    <dd><b></b>如何预订</dd>
                </a>
                <a  >
                    <dd><b></b>购物流程</dd>
                </a>
                <a  >
                    <dd><b></b>预订须知</dd>
                </a>
            </dl>
            <dl class="footer-item">
                <h3>公司信息</h3>
                <a  >
                    <dd><b></b>关于我们</dd>
                </a>
                <a  >
                    <dd><b></b>用户协议</dd>
                </a>
                <a  >
                    <dd><b></b>隐私申明</dd>
                </a>
                <a  >
                    <dd><b></b>商家入驻协议</dd>
                </a>
                <a  >
                    <dd><b></b>安全须知</dd>
                </a>
            </dl>
            <dl class="footer-item">
                <h3>合作联系</h3>
                <a  >
                    <dd><b></b>联系我们</dd>
                </a>
                <a  >
                    <dd><b></b>招商加盟</dd>
                </a>
                <a  >
                    <dd><b></b>商户平台</dd>
                </a>
                <a  >
                    <dd><b></b>招聘信息</dd>
                </a>
            </dl>
            <dl class="footer-item">
                <h3>帮助中心</h3>
                <a  >
                    <dd><b></b>忘记密码</dd>
                </a>
                <a  >
                    <dd><b></b>常见问题</dd>
                </a>
                <a  >
                    <dd><b></b>在线客服</dd>
                </a>
                <a  >
                    <dd><b></b>如何上传产品</dd>
                </a>
                <a  >
                    <dd><b></b>如何成为商家</dd>
                </a>
            </dl>
            <div class="footer-mobile">
                <img src="images/SVT58398773Nz.jpg">
                <h2>官方微信</h2>
            </div>
        </div>
        <div class="footer-data0">
            <a><i class="footer-ad0" title="可信网站身份验证"></i></a>
            <a><i class="footer-ad1" title="重庆网警备案"></i></a>
            <a><i class="footer-ad2" title="重庆工商行政管理"></i></a>
            <a><i class="footer-ad3" title="安全联盟认证"></i></a>
        </div>
        <div class="footer-data1">
            友情链接：
            <a href="https://www.baidu.com/" target="_blank">百度</a>
            <em>|</em>
            <a href="https://www.taobao.com/">淘宝</a>
        </div>
        <div class="footer-data2">
            CopyRight 2016 婚礼汇 All Rights Reserved
            <a href="Untitled-2.html">渝ICP备14001673号</a>
        </div>
    </div>
</div>
<a target="_blank" title="联系我们" href="Untitled-2.html">
    <span id="askus">&nbsp;</span>
</a>
<div id="gotop" title="返回顶部" style="display:block; background:url(images/gotop.png) -70px 0px no-repeat"></div>

</body>
</html>
