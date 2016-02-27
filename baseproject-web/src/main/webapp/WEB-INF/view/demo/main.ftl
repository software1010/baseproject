<#import "../layout/main.ftl" as layout>
<@layout.main>
	<div class="page-container container-fluid">
  		<div class="row">
			<div class="col-sm-3 col-md-2 sidebar">
				<div class="form-group">
					<button type="submit" class="btn btn-default active" style="width:100%;">订单查询</button>
				</div>
				<div class="form-group">
					<button type="submit" class="btn btn-default" style="width:100%;">订单审批</button>
				</div>
				<div class="form-group">
					<button type="submit" class="btn btn-default" style="width:100%;">费用审批</button>
				</div>
			</div>
			<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 content">
				<ul class="nav nav-tabs">
				  <li role="presentation" class="active"><a href="#">订单列表</a></li>
				  <li role="presentation"><a href="#">订单明细：2012200031<div class="glyphicon glyphicon-remove"></div></a></li>
				</ul>
				<div class="content-body">
					<div class="content-row pd10">
						<form class="form-inline">
						  <div class="form-group">
						    <label for="exampleInputName2">全局订单号</label>
						    <input type="text" class="form-control" id="exampleInputName2" placeholder="Jane Doe">
						  </div>
						  <div class="form-group ml10">
						    <label for="exampleInputEmail2">系统订单ID</label>
						    <input type="email" class="form-control" id="exampleInputEmail2" placeholder="jane.doe@example.com">
						  </div>
						</form>
						<div style="margin-left:80px; margin-top: 10px;">
							<button type="submit" class="btn btn-primary" id="exampleInputName2">
								<span class="glyphicon glyphicon-search"></span> 查询
							</button>
							<button type="button" class="btn btn-link">高级搜索</button>
						</div>
					</div>
					<div class="content-row pd10 tc">
						当前用户没有任何订单
					</div>
				</div>
			</div>
		</div>
	</div>
</@layout.main>