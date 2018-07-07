<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>${blog.getTitle()}</title>
    <link rel="stylesheet" type="text/css" href="/css/bootstrap.min.css"/>
</head>
<body>
    <nav class="navbar navbar-inverse navbar-fixed-top" >
        <div class="container-fluid">
            <div class="navbar-header">
                <a class="navbar-brand" href="/">Blog Post</a>
            </div>
            <ul class="nav navbar-nav">
                <li class="active"><a href="/blogs">Bloglar</a></li>
                <li><a href="/newblog"><span class="glyphicon glyphicon-pencil"></span> Yangi blog</a></li>

            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="#"><span class="glyphicon glyphicon-user"></span> ${user}</a></li>
                <li><a href="/logout"><span class="glyphicon glyphicon-log-out"></span> Log out</a></li>
            </ul>
        </div>
    </nav>
    <div class="container" style="margin-top: 70px">
        <ul class="breadcrumb">
            <li><a class="breadcrumb-item" href="/">Bosh sahifa</a></li>
            <li><a class="breadcrumb-item" href="/blogs">Bloglar</a></li>
            <li><span class="breadcrumb-item active">${blog.getTitle()}</span></li>
        </ul>
            <div class="panel panel-default">
                <div class="panel-heading"><h3>${blog.getTitle()}</h3></div>
                <div class="panel-body">${blog.getBlogText()} <br>${blog.getCreated()}</div>
                <div class="panel-footer">Creted by: #{blog.getUserId()}  Viewed: #{blog.getViewed()}</div>
            </div>
    </div>


</body>
</html>