<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<script>
function join(){
	var param = {};
	var objs = document.querySelectorAll('input[type=text]');
	for(var i=0;i<objs.length;i++){
		var obj =objs[i];
		var key = obj.id;
		var value = obj.value;
		param[key] = value;
	}
	console.log(param);
	
	
	
	
	xhr.setRequestHeader('content-type','application/json;charset=utf-8');
	xhr.send(JSON.stringify(param));
}
	</script>
</body>
</html>