<#import "../layout/main.ftl" as layout>
<@layout.main>
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
</@layout.main>