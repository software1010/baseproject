<#macro main>
<!doctype html>
<html lang="en" ng-app="baseprojectApp">
  <head>
  	<meta charset="utf-8">
  	
    <script src="${request.contextPath}/static/js/lib/angular.js?v1.5.0"></script>
    <script src="${request.contextPath}/static/js/app/main.js"></script>
  </head>
  <body>
  	<#include "topbar.ftl"/>
    <#nested/>
  </body>
</html>
</#macro>