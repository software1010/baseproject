<!doctype html>
<html lang="en" ng-app="baseproject.app">
  <head>
  	<meta charset="utf-8">
    <script src="${request.contextPath}/static/js/lib/angular.min-v1.5.0.js"></script>
    <script src="${request.contextPath}/static/js/app/controllers.js"></script>
  </head>
  <body>
    <div>
      <label>Name:</label>
      <input type="text" ng-model="yourName" placeholder="Enter a name here">
      <hr>
      <h1>Hello {{yourName}}!</h1>
    </div>
    <div ng-controller="PhoneListCtrl">
    	<ul>
		    <li ng-repeat="phone in phones">
		      {{phone.name}}
		    <p>{{phone.snippet}}</p>
		    </li>
		</ul>
    </div>
  </body>
</html>