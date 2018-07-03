<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Login</title>
    <link rel="stylesheet" type="text/css" href="/css/bootstrap.min.css"/>
</head>
<body>
    <div class="container">
        <div class="row">
            <h1 class="page-header">Login</h1>
        </div>
        <div class="row">
            <div class="col-xs-4 col-xs-offset-4">
                <div class="panel panel-default">
                    <div class="panel-body">
                        <form class="form-horizontal" method="post">
                            <div class="form-group">
                                <label class="control-label col-sm-3" for="login">Login:</label>
                                <div class="col-sm-9">
                                    <input class="form-control" id="login" placeholder="Login">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-3" for="pwd">Parol:</label>
                                <div class="col-sm-9">
                                    <input type="password" class="form-control" id="pwd" placeholder="Parol">
                                </div>
                            </div>
                            <div class="form-group text-center">
                                <button type="submit" class="btn btn-primary">Login</button>
                            </div>
                        </form>
                        <div class="alert
                                <#if logout>
                                    alert-info
                                </#if>
                                <#if error>
                                    alert-danger
                                </#if>
                        ">
                            <#if logout>
                                Siz tizimdan chiqdingiz!
                            </#if>
                            <#if error>
                                Login yoki parol xato!
                            </#if>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>