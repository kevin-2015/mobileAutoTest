var prefix = "/script";
$(document).ready(function() {
	$('#scriptList').hide();
	var deptName = '';
	var batchName = '';
	var scriptName = '';
	load(deptName,batchName,scriptName);
});

function load(deptName,batchName,scriptName) {
	$('#scriptTable')
		.bootstrapTable(
			{
				method : 'get', // 服务器数据的请求方式 get or post
				url : prefix + "/list", // 测试任务数据的加载地址
				showRefresh : true,
				showToggle : true,
				showColumns : true,
				iconSize : 'outline',
				toolbar : '#exampleToolbar',
				striped : true, // 设置为true会有隔行变色效果
				dataType : "json", // 服务器返回的数据类型
				pagination : true, // 设置为true会在底部显示分页条
				queryParamsType : "limit",
				// //设置为limit则会发送符合RESTFull格式的参数
				singleSelect : false, // 设置为true将禁止多选
				// contentType : "application/x-www-form-urlencoded",
				// //发送到服务器的数据编码类型
				pageSize : 10, // 如果设置了分页，每页数据条数
				pageNumber : 1, // 如果设置了分布，首页页码
				// search : true, // 是否显示搜索框
				showColumns : false, // 是否显示内容下拉框（选择显示的列）
				sidePagination : "server", // 设置在哪里进行分页，可选值为"client" 或者
				// "server"
				queryParams : function(params) {
					return {
						// 说明：传入后台的参数包括offset开始索引，limit步长，sort排序列，order：desc或者,以及所有列的键值对
						limit : params.limit,
						offset : params.offset,
						scriptName : $('#scriptName').val(),
						batchName : $('#batchName').val(),
						deptName : $('#deptName').val(),
					};
				},
				// 请求服务器数据时，你可以通过重写参数的方式添加一些额外的参数，例如 toolbar 中的参数 如果
				// queryParamsType = 'limit' ,返回参数必须包含
				// limit, offset, search, sort, order 否则, 需要包含:
				// pageSize, pageNumber, searchText, sortName,
				// sortOrder.
				// 返回false将会终止请求
				columns : [
				{
					checkbox : true,
					align : 'center'
				},
				{
					field : 'Number', // 列字段名
					title : '序号', // 列标题
					formatter : function(value,row,index){
						return index + 1;
					},
					align : 'center'
				},
				{
					field : 'scriptName',
					title : '脚本名称',
					align : 'center'
				},
				{
					field : 'tag',
					title : '脚本标签',
					align : 'center'
				},
				{
					field : 'testSuitPath',
					title : '测试套路径',
					align : 'center'
				},
				{
					field : 'status',
					title : '状态',
					align : 'center',
					formatter : function(value, row, index) {
						if (value == '0') {
							return '<span class="label label-danger">停用</span>';
						} else if (value == '1') {
							return '<span class="label label-primary">正常</span>';
						}
					}
				},
				{
					field : 'gmtModified',
					title : '最后修改时间',
					align : 'center'
				},
				{
					field : 'scriptId',
					title : '案例名称',
					align : 'center',
					formatter : function(value, row, index) {
						var e = '<button class=".btn" onclick="showCaseName(' + row.scriptId + ')">查看</button>';
						return e;
					}
				}]
			});
		}
function reLoad() {
	var opt = {
			query : {
				scriptName : $('#scriptName').val(),
				batchName : $('#batchName').val(),
				deptName : $('#deptName').val(),
			}
		};
	$('#scriptTable').bootstrapTable('refresh', opt);
}
function showCaseName(scriptId) {
	layer.open({
		type : 2,
		title : '查看案例名称',
		maxmin : true,
		shadeClose : false, // 点击遮罩关闭层
		area : [ '600px', '500px' ],
		content : prefix + '/showCaseName/' + scriptId
	});
}
function updateScripts() {
	layer.open({
		type : 2,
		title : '请选择需要更新的脚本所属的产品及批次',
		maxmin : true,
		shadeClose : false, // 点击遮罩关闭层
		area : [ '600px', '500px' ],
		content : prefix + '/openUpdatePage'
	});
}