<html>
<head>
    <meta charset="UTF-8">
    <title>Hush kelibsiz</title>
    <link rel="stylesheet" type="text/css" href="/css/bootstrap.min.css"/>
</head>
<body>
<div class="container">
    <br>
    <br>
    <#if info>
        <div class="alert alert-success alert-dismissible fade in">
            <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
            <strong>Tabriklaymiz!</strong> Siz muvaffaqqiyatli ro'yhatdan o'tdingiz! Endi <a href="/login">login</a> qilishingiz mumkin.
        </div>
    </#if>
    <div class="row">
        <div class="container">
            <div class="jumbotron">
                <div class="h4 text-right">
                    <#if user??>
                        Hush kelibsiz, <strong>${user}</strong>!
                        <#--<i class="glyphicon glyphicon-log-out"></i>-->
                        <a href="/logout"> Logout</a>
                        <#else>
                            Hush kelibsiz, mehmon!
                            <#--<i class="glyphicon glyphicon-log-in"></i> -->
                            <a href="/login"> Login</a>
                    </#if>

                </div>
                <h1>Blog Post</h1>
                <p class="h2">Bu sayt Spring Boot + Security + Spring JPA + PostgreSQL'lardan foydalanib yaratildi.</p>
                <p>Bu yerdan blog postlarga o'tsangiz bo'ladi:</p>


                <a href="/blogs" class="btn btn-lg btn-success">Blog Postlarga o'tish</a>
            </div>

        </div>
    </div>
</div>

</body>
</html>