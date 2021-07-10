<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">
<thead>
<tr>
<th>번호(rn)</th>
<th>썸네일</th>
<th>제목</th>
<th>부제</th>
<th>제작일</th>
<th>연결 URL</th>
</tr>
</thead>
<tbody id="tb"></tbody>
</table>

<script>
var xhr = new XMLHttpRequest();
xhr.open('GET','/movies');
xhr.onreadystatechange = function(){
	if(xhr.readyState==4 && xhr.status==200){
		
		var html ='';
		var res= JSON.parse(xhr.responseText);
		var response =  res.response;
		var body = response.body;
		var items = body.items;
		var itemList = items.item;
		for(var item of itemList){
			html += '<tr>';
			html += '<td>'+ item.rn +'</td>';
			html += '<td>'+ item.title +'</td>';
			html += '</tr>';
		}
			
		document.querySelector('#tb').innerHTML= html;
	}
}
xhr.send();
</script>
</body>
</html>