<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ajax 통신 console로 확인하기</title>
</head>
<body>

<button id=send>버튼</button>
	
	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script>
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
	</script>


</body>
</html>