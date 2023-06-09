<%--
  Created by IntelliJ IDEA.
  User: tq
  Date: 2023/5/31
  Time: 11:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <!-- 引用看板娘交互所需的样式表 -->
    <link href='./Pio/static/pio.css' rel='stylesheet' type='text/css'/>
</head>
<body>
<form action="${pageContext.request.contextPath}/serv02">
    <input name="user"/>
    <input name="password">
    <button type="submit">提交</button>
</form>


<div class="pio-container right">
    <div class="pio-action"></div>
    <canvas id="pio" width="{300}" height="{300}"></canvas>
</div>

<!-- 引用 Live2D 核心组件 -->
<script src='./Pio/static/l2d.js'></script>
<!-- 引用看板娘交互组件 -->
<script src='./Pio/static/pio.js'></script>
<script>

    var pio = new Paul_Pio({
        "mode": "draggable",
        "hidden": false,
        "content": {
            "welcome": ["你好，欢迎来到保罗的小窝", "我是从云，傲完就娇的从云~"],
            "touch": ["你这个绅士！", "别碰我！"],
            "skin": ["想看看我的新服装吗？", "新衣服真漂亮~"],
            "home": "点击这里回到首页！",
            "link": "https://paul.ren/about",
            "close": "QWQ 有缘再会吧~",
            "referer": "你通过 %t 来到了这里",
            "custom": [
                {
                    "selector": ".comment-form",
                    "text": ["欢迎参与本文评论，别发小广告噢~", "快来参加本文的评论吧~"]
                }
            ]
        },
        "night": "single.night()",
        "model": ["./Pio/models/pio/model.json"],
        "tips": true
    });
</script>
</body>
</html>
