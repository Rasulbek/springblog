<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Yangi blog</title>
    <link rel="stylesheet" type="text/css" href="/css/bootstrap.min.css"/>
</head>
<body>
    <nav class="navbar navbar-inverse navbar-fixed-top" >
        <div class="container-fluid">
            <div class="navbar-header">
                <a class="navbar-brand" href="/">Blog Post</a>
            </div>
            <ul class="nav navbar-nav">
                <li><a href="/blog">Bloglar</a></li>
                <li class="active"><a href="/newblog"><span class="glyphicon glyphicon-pencil"></span> Yangi blog</a></li>

            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="#"><span class="glyphicon glyphicon-user"></span> ${user}</a></li>
                <li><a href="/logout"><span class="glyphicon glyphicon-log-out"></span> Log out</a></li>
            </ul>
        </div>
    </nav>
    <div class="container" style="margin-top: 40px">
        <div class="row">
            <h1 class="page-header">Yangi blog yozish</h1>
        </div>
        <div class="row">

        <#if error??>
            <div class="alert alert-danger">${error}</div>
        </#if>
            <div class="panel panel-default">
                <div class="panel-body">
                    <div class="col-xs-10 col-xs-offset-1">
                        <form class="form-horizontal" method="post">
                            <input name="${_csrf.parameterName}" value="${_csrf.token}" type="hidden">
                            <label>Sizning ID: ${userId}</label>
                            <div class="form-group">
                                <label class="control-label" for="title">Sarlavha:</label>
                                <input name="title" class="form-control" id="title" placeholder="Sarlavha">
                            </div>
                            <div class="form-group">
                                <label class="control-label" for="blogtext">Blog:</label>
                                <textarea name="blogtext" rows="20" class="form-control" id="blogtext"></textarea>
                            </div>
                            <div class="form-group text-right">
                                <button type="submit" class="btn btn-primary"><span class="glyphicon glyphicon-ok-sign"></span> E'lon qilish</button>
                            </div>

                        </form>
                    </div>
                </div>
            </div>

        </div>
    </div>
</body>
</html>