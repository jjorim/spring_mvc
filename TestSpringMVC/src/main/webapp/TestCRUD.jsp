<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta name="description" content="SpringMVC CRUD 예제" charset="UTF-8">
<title>CRUD를 만들어보자</title>
</head>
<body>

	<button id=create_button>생성</button>
	<button id=update_button>수정</button>
	<button id=delete_button>삭제</button>

	<table id="book_list_table">
		<caption>도서 리스트</caption>
		<thead>
		<tr>
			<th>번호</th>
			<th>도서제목</th>
			<th>저자</th>
			<th>가격</th>
			<th>생성일자</th>
			<th>수정일자</th>
		</tr>
		</thead>
	</table>

	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	
	<script src="https://cdn.datatables.net/1.11.5/js/jquery.dataTables.min.js"></script>
	<script src="https://cdn.datatables.net/select/1.2.1/js/dataTables.select.min.js"></script>
	<!--  <script src="https://cdn.datatables.net/1.11.5/css/jquery.dataTables.min.css"></script> -->
	
	<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.11.5/css/jquery.dataTables.min.css">
	<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/select/1.2.1/css/select.dataTables.min.css">
	
	<script>
	
	// 테이블 조회(CRUD의 R:read)
	// 데이터테이블을 사용할 것
	$(document).ready(function () {
	let tableObj = $('#book_list_table').DataTable( {
		"ajax": {
			"url": "book/list",
			"type": "POST",//'GET',
			//'dataSrc' :"",
			"data" : function(d) {
				// view에서 서버로 넘길 데이터 d.xx로 넘긴다.
				// 지금은 넘길 정보가 없으니 생략
			},
		},
			//"success": function(data){console.log(data);},
			"columns": [
				{"data" : "book_id","defaultContent":""},
				{"data" : "title","defaultContent":""},
				{"data" : "author","defaultContent":""},
				{"data" : "price","defaultContent":""},
				{"data" : "cdate","defaultContent":""},
				{"data" : "udate","defaultContent":""},
			],
			"select" : { style: "multi" }
	});
	
	// 처음 생성할때 ajax만 새로고침할 때
	//tableObj.ajax.reload();
	
	/*
	$("#exampke tbody").on('click', 'tr', function() {
		$(this).toggleClass('selected'); // selected로 css를 토글
	});
	*/
	});
	
	
	
	
	// 새로운 데이터로 테이블을 채울떄
	// $('#book_list_table').dataTable().fnClearTable(); 
	// $('#book_list_table').dataTable().fnAddData(data);
	
	/*
	// 생성 버튼 동작
	$("#send").on("click", function() {
		console.log("클릭함");
		$.ajax({
			type:"GET",
			dataType: "json",
			url:"rest/testvalue",
			success: function(data){
				console.log("success");
				console.log(data);
			},
			error: function(request,status,error){
				console.log("error");
				//alert("code:"+request.status+"\n"+"message:"+request.responseText+"\n"+"error:"+error);
				console.log("code:"+request.status+"\n"+"message:"+request.responseText+"\n"+"error:"+error);
			}
			
			});
	});
	*/
	
	
	</script>

</body>
</html>