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
                <a class="navbar-brand" href="#">WebSiteName</a>
            </div>
            <ul class="nav navbar-nav">
                <li class="active"><a href="#">Home</a></li>
                <li><a href="#">Page 1</a></li>
                <li><a href="#">Page 2</a></li>
                <li><a href="#">Page 3</a></li>
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