<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>BlogPostlar</title>
    <link rel="stylesheet" type="text/css" href="/css/bootstrap.min.css"/>
    <link rel="stylesheet" type="text/css" href="/css/site.css"/>

</head>
<body ng-app="springDemo">
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
    <div class="container" style="margin-top: 70px" ng-controller="AppCtrl">
        <ul class="breadcrumb">
            <li><a class="breadcrumb-item" href="/">Bosh sahifa</a></li>
            <li><span class="breadcrumb-item active">Bloglar</span></li>
        </ul>
        <div class="h2 page-header">Bloglar</div>
        <table class="table">

            <tr ng-repeat="blog in blogs">
                <td>
                    <div class="calendar">
                        <div class="cal-day">{{blog.formattedDate[0]}}</div>
                        <div class="cal-month">{{blog.formattedDate[1]}}</div>
                        <div class="cal-year">{{blog.formattedDate[2]}}</div>
                    </div>
                </td>
                <td>
                    <span class="h2">
                        {{blog.title}}
                    </span>
                    <div>
                        {{blog.description}}...<a href="/blog/{{blog.id}}">Davomi</a>
                    </div>
                    <br>
                    <div class="label label-info">Creted by: <span class="glyphicon glyphicon-user"></span> {{blog.userId}}  Viewed: <span class="glyphicon glyphicon-eye-open"></span> {{blog.viewed}}</div>
                </td>
                <td>
                    <a href="/blog/{{blog.id}}" class="btn btn-warning">Davomi</a>
                </td>
            </tr>

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


<script type="text/javascript" src="js/angular.min.js"></script>
<script type="text/javascript" src="js/main.js"></script>
</body>
</html>