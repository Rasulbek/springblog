<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Yangi foydalanuvchi</title>
    <link rel="stylesheet" type="text/css" href="/css/bootstrap.min.css"/>
</head>
<body>
    <div class="container">
        <div class="row">
            <h1 class="page-header">Yangi foydalanuvchini ro'yhatga olish</h1>
        </div>
        <div class="row">
            <div class="col-xs-4 col-xs-offset-4">
                <div class="panel panel-default">
                    <div class="panel-body">
                        <form class="form-horizontal" action="/registration" method="post">
                            <input name="${_csrf.parameterName}" value="${_csrf.token}" type="hidden">
                            <div class="form-group">
                                <label class="control-label col-sm-3" for="login">Login:</label>
                                <div class="col-sm-9">
                                    <input name="username" class="form-control" id="login" placeholder="Login">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-3" for="pwd">Parol:</label>
                                <div class="col-sm-9">
                                    <input name="password" type="password" class="form-control" id="pwd" placeholder="Parol">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-3" for="cpwd">Confirm:</label>
                                <div class="col-sm-9">
                                    <input name="cpass" type="password" class="form-control" id="cpwd" placeholder="Parolni takrorlang">
                                </div>
                            </div>
                            <div class="form-group text-center">
                                <button type="submit" class="btn btn-primary">Ro'yhatdan o'tish</button>
                            </div>
                        </form>
                            <#if response??>
                                <div class="alert alert-info">Javob: ${response}</div>
                            </#if>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>