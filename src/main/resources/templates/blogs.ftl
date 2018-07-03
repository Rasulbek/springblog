<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>BlogPostlar</title>
    <link rel="stylesheet" type="text/css" href="/css/bootstrap.min.css"/>
</head>
<body>
    <nav class="navbar navbar-inverse navbar-fixed-top" >
        <div class="container-fluid">
            <div class="navbar-header">
                <a class="navbar-brand" href="/">Blog Post</a>
            </div>
            <ul class="nav navbar-nav">
                <li class="active"><a href="/blog">Bloglar</a></li>
                <li><a href="/newblog"><span class="glyphicon glyphicon-pencil"></span> Yangi blog</a></li>

            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="#"><span class="glyphicon glyphicon-user"></span> ${user}</a></li>
                <li><a href="/logout"><span class="glyphicon glyphicon-log-out"></span> Log out</a></li>
            </ul>
        </div>
    </nav>
    <div class="container" style="margin-top: 70px">
        <#list blogs as blog>
            <div class="panel panel-default">
                <div class="panel-heading">${blog.getTitle()}</div>
                <div class="panel-body">${blog.getBlogText()} <br>${blog.getCreated()}</div>
                <div class="panel-footer">Creted by: #{blog.getUserId()}  Viewed: #{blog.getViewed()}</div>
            </div>
        <#else>
            Blog yo'q
        </#list>
    </div>


</body>
</html>