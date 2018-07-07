<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>BlogPostlar</title>
    <link rel="stylesheet" type="text/css" href="/css/bootstrap.min.css"/>
    <link rel="stylesheet" type="text/css" href="/css/site.css"/>
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
            <li><span class="breadcrumb-item active">Bloglar</span></li>
        </ul>
        <div class="h2 page-header">Bloglar</div>
        <table class="table">

        <#list blogs as blog>
            <tr>
                <td>
                    <div class="calendar">
                        <div class="cal-day">${blog.getFormattedDate()[0]}</div>
                        <div class="cal-month">${blog.getFormattedDate()[1]}</div>
                        <div class="cal-year">${blog.getFormattedDate()[2]}</div>
                    </div>
                </td>
                <td>
                    <span class="h2">
                        ${blog.getTitle()}
                    </span>
                    <div>
                        ${blog.getDescription()}...<a href="/blog/${blog.getId()}">Davomi</a>
                    </div>
                    <br>
                    <div class="label label-info">Creted by: <span class="glyphicon glyphicon-user"></span> #{blog.getUserId()}  Viewed: <span class="glyphicon glyphicon-eye-open"></span> #{blog.getViewed()}</div>
                </td>
                <td>
                    <a href="/blog/${blog.getId()}" class="btn btn-warning">Davomi</a>
                </td>
            </tr>
        <#else>
            Blog yo'q
        </#list>
        </table>
        <div class="text-center">
            <ul class="pagination">
                <li class="<#if cp==1>active</#if>"><a href="?page=1">1</a></li>
                <li class="<#if cp==2>active</#if>"><a href="?page=2">2</a></li>
                <li class="<#if cp==3>active</#if>"><a href="?page=3">3</a></li>
                <li class="<#if cp==4>active</#if>"><a href="?page=4">4</a></li>
            </ul>
        </div>
    </div>


</body>
</html>