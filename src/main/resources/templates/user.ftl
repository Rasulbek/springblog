<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Userlar ro'yhati</title>
    <link rel="stylesheet" type="text/css" href="/css/bootstrap.min.css"/>
</head>
<body>
    <ul class="nav nav-pills">
        <#list users as user>
            <li>${user.getUser()}</li>
        <#else>
            No users
        </#list>
    </ul>
</body>
</html>