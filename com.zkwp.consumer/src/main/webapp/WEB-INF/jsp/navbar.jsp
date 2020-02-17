<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath();
%>

<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>手工艺品推广平台</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<style type="text/css">
    * {
        margin: 0px;
        padding: 0px;
        box-sizing: border-box;
    }

    body {
        margin: 0;
        padding: 0;
        background: white;
        font-weight: 500;
        font-family: "Microsoft YaHei", "宋体", "Segoe UI", "Lucida Grande", Helvetica, Arial, sans-serif, FreeSans, Arimo;
    }

    .head_navbar {
        width: 100%;
        height: 40px;
        background-color: white;
    }

    .navbar_menu_item {
        display: inline-block;
        width: auto;
        font-size: 26px;
        color: #2c3e50;
        margin-left: 10px;
    }

    .navbar_menu_item:hover {
        border: 2px solid #7BA7AB;
        background-color: #7BA7AB;
        border-radius: 10px;
    }

    #container {
        width: 100%;
        height: 40px;
        margin: 0 auto;
    }

    div.search {
        padding: 0px;
    }

    form {
        position: relative;
        width: 300px;
        margin: 0 auto;
    }

    input, button {
        border: none;
        outline: none;
    }

    input {
        width: 100%;
        height: 38px;
        padding-left: 13px;
    }

    button {
        height: 38px;
        width: 38px;
        cursor: pointer;
        position: absolute;
    }

    .bar1 {
        background: white;
    }

    .bar1 input {
        border: 2px solid #7BA7AB;
        border-radius: 10px;
        background: white;
        color: #2c3e50;
    }

    .bar1 button {
        top: 0;
        right: 0;
        background: #7BA7AB;
        border-radius: 0 5px 5px 0;
    }

    .bar1 button:before {
        content: "搜索";
        font-size: 13px;
        color: #2c3e50;
    }
</style>
<body>

<div class="head_navbar row">
    <div class="col-md-2">

    </div>
    <div class="col-md-4 navbar_menu">
        <ul>
            <li class="navbar_logo"><img src=""></li>
            <li class="navbar_menu_item"></li>
            <li id="navbar_index" class="navbar_menu_item">首页</li>
            <li class="navbar_menu_item">珍品</li>
            <li class="navbar_menu_item">直播</li>
            <li class="navbar_menu_item">关于</li>
        </ul>
    </div>
    <div class="col-md-2">
        <div class="search bar1">
            <form>
                <input type="text" placeholder="请输入您要搜索的内容...">
                <button type="submit"></button>
            </form>
        </div>
    </div>

    <div class="col-md-3">

    </div>
</div>

<!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
<script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
<!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
</body>
<script type="javascript">

    $(function () {
        bindIndexEvent();
    })

    function bindIndexEvent() {
        $("#navbar_index").click(function () {
            window.location.href = 'login.jsp';
        })
    }


</script>
</html>