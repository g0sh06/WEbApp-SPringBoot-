<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Save Customer</title>

    <link type="text/css"
          rel="stylesheet"
          href="${pageContext.request.contextPath}/resources/css/style.css">
          
    <link type="text/css"
          rel="stylesheet"
          href="${pageContext.request.contextPath}/resources/css/add-customer-style.css">

</head>
<body>
  <div>
   <div id="header">
     <h2>CRM-Customer Relatioship Manager</h2>
   </div>  
  
  </div>
  
  <div id="saveCustomer">
    <h3>Save Customer</h3>
  
     <form:form action="saveCustomer" modelAttribute="customer" method="POST">
      
      <form:hidden path="id"/>
      
      
      
      <table>
       <tbody>
        <tr>
          <td><label>First name:</label></td>
          <td><form:imput path="firstName"/></td>
        </tr>
        
        <tr>
          <td><label>Last name:</label></td>
          <td><form:imput path="secondName"/></td>
        </tr> 
        
        <tr>
          <td><label>Email:</label></td>
          <td><form:imput path="Email"/></td>
        </tr>
        
        <tr>
          <td><label></label></td>
          <td><imput type="submit" value="Save" class="save"/></td>
        </tr>         
        
       
       </tbody>     
      </table>
     </form:form>
     
     <p>
       <a href="${pageContext.request.contextPath}/customer/list"></a>
     </p>
     
     
  </div>
  
  
  
</body>
</html>