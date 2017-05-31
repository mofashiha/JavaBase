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

	function changeColor() {
		$('#fruit').css('color','red')
		
	}
	function changDocument() {
		$('.vagetable').html("我改变了文本")
	}
	function doubleChange() {
		$('.vagetable,#fruit').css('color','green')
	}
}
function iff() {
	 if($('#btn').val()==("点击隐藏")){
    	
    		 $('#btn').attr('value',"点击显示")
             $('div').hide('slow')
    	
     }
     else{
    	
    		 $('#btn').attr('value',"点击隐藏")
             $('div').show('slow')            
     }	
}
