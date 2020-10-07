
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  

<h3>
<c:if test="${message ne null }">
<c:out value="${message }"></c:out>
</c:if>
</h3>
<form action="doUpload" method="post" enctype="multipart/form-data">
PICK FILE : <input type="file" class="file" name="file"><br>
<input type="submit" value="Upload">
</form>
<br>
<a href="downloadPage">Download Files</a>
