<#macro main>
<!doctype html>
<html lang="en" ng-app="baseprojectApp">
  <head>
  	<meta charset="utf-8">
  	
  	<link rel="stylesheet" href="${request.contextPath}/static/css/bootstrap.min.css?v3.3.5">
  	<link rel="stylesheet" href="${request.contextPath}/static/css/main.css?v1.0">
  	
    <script src="${request.contextPath}/static/js/lib/jquery.min.js?v1.12.1"></script>
  	<script src="${request.contextPath}/static/js/lib/bootstrap.min.js?v3.3.5"></script>
    <script src="${request.contextPath}/static/js/lib/angular.min.js?v1.5.0"></script>
    <script src="${request.contextPath}/static/js/app/main.js"></script>
  </head>
  <body>
  	<#include "topbar.ftl"/>
    <#nested/>
  </body>
</html>
</#macro>