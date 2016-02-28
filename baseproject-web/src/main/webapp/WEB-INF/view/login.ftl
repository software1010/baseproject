<!doctype html>
<html lang="en" ng-app="baseprojectApp">
  <head>
  	<meta charset="utf-8">
  	
  	<link rel="stylesheet" href="${request.contextPath}/static/css/base.css?v1.0">
  	<link rel="stylesheet" href="${request.contextPath}/static/css/login.css?v1.0">
  	
    <script src="${request.contextPath}/static/js/lib/jquery.min.js?v1.12.1"></script>
  	<script src="${request.contextPath}/static/js/lib/bootstrap.min.js?v3.3.5"></script>
    <script src="${request.contextPath}/static/js/lib/angular.min.js?v1.5.0"></script>
    <script src="${request.contextPath}/static/js/app/main.js"></script>
  </head>
  <body>
  	<div class="login-bg">
		<div class="login-container box-shadow">
			<div class="login-form-head">
				xx系统
			</div>
			<div class="login-form-body">
				<div>
					<label for="loginId">登录名：</label>
				</div>
				<div>	
					<input type="text" class="form-text" id="loginId-input"/>
				</div>
				<div>
					<label for="password">密码：</label>
				</div>
				<div>	
					<input type="password" class="form-text" id="password-input"/>
				</div>
				<div>
					<label for="verifyCdoe">验证码：</label>
				</div>
				<div>	
					<input type="text" class="form-text" id="verifyCode-input" style="width: 210px;"/>
					<img src="${request.contextPath}/verifyCode" class="vm" id="verifyCodeImg"/>
				</div>
				<div>
					<input type="checkbox" checked="checked" /> 记住用户名
				</div>
			</div>
			<div class="login-form-foot">
				<input type="button" class="form-button" value="登&nbsp;&nbsp;&nbsp;&nbsp;录" id="loginBtn"/>
			</div>
		</div>
	</div>
  </body>
</html>
