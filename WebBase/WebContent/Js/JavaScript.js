/**
 * 
 */
function Test() {
	alert("这是一个测试");

}
function forIn() {
	var num = forIn.arguments.length;
	console.info("num:" + num);
	var array = [ "aa", 123, 45, "bb", 'c', "张三" ];
	for (temp in array) {// temp是索引，不是值；
		console.info(temp + "......" + array[temp]);

	}

}