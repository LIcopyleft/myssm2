<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="ctx" value="<%=request.getContextPath()%>" />
<html>
<head>
    <title>from表单提交</title>
 <%-- <script type="text/javascript" src="${ctx}/static/js/jquery-1.8.3.min.js"></script> --%>
</head>
<body>
<form  method="post" id="userAdd">
  <table>
    <tr>
      <td>ID:</td>
      <td>
        <input type="text" name="id" />
      </td>
    </tr>
    <tr>
      <td>用户名：</td>
      <td>
        <input type="text" name="name" />
      </td>
    </tr>
    <tr>
      <td>電話：</td>
      <td>
        <input type="text" name="telephone" />
      </td>
    </tr>
   
  </table>
  <a href="javascript:userAdd()">确定</a>
</form>
<script>
  function userAdd(){
    $.ajax({
      url:"/useradd",
      data:$("#userAdd").serialize(),
      type:"post",
      success:function(data){
        console.log(data);
      }
    });
  }
</script>
</body>
</html>