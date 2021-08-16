<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>

<!-- name、idの入力エリアを作成しなさい -->

 <%@ include file="header.jsp"%>
 
    <div class="form-area">
        <dl class="list clearfix">
            <dt class="name"><strong>name</strong></dt>
            <dt><strong>id</strong></dt>
        </dl>
        
        <dd class="form clearfix">
            <dt class="name-form"><input type="text" name="name_form"></dt>
            <dt><input type="text" name="id_form"></dt>
        </dd>
    </div>

 <%@ include file="footer.jsp"%>
 
</body>
</html>
