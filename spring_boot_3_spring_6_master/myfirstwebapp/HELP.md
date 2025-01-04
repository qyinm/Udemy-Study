# Getting Started


## HTML

```
<html>
	<head>
		<title> My first HTML Page</title>
	</head>
	<body>
		My first html page with body
	</body>
</html>
```

## JSP

/src/main/resources/META-INF/resources/WEB-INF/jsp/sayHello.jsp

/say-hello-jsp => SayHelloController - sayHelloJsp method => sayHello

/WEB-INF/jsp/sayHello.jsp


## Login JSP

/login => com.hippoo.myfirstwebapp.login.LoginController => login.jsp


## 
localhost:8080/login

B1: Identifies correct Controller method
/login => LoginController.gotoLoginPage

B2: Executes Controller method
=> Puts data into model
=> Returns view name => login

B3: Identifies correct View
/WEB-INF/jsp/login.jsp

B4: Executes view

