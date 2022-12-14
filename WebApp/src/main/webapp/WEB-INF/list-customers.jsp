<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Customers</title>
</head>
<body>

 <div id="wrapper">
  <div id="header">
     <h2>CRM- Customer Relationship manager</h2>
  </div>
 </div>    

 <div id="container">
 
   <div id="content">
   
   <!-- put new button: Add Customer -->
   
   <input type ="button" value="Add Customer"
   onclick="window.location.href='showFormForAdd'; return false;"
   class="add-button"/>
   
   <table>
    <tr>
      <th>First Name</th>
      <th>Last Name</th>
      <th>Email</th>
      <th>Actions</th> 
    </tr>
    
    <c:forEach var="tempCustomer" items="{customers}">
    
    <c:url var="updateLink" value="/customer/showFormForUpdate">
      <c:param name="customerId" value="%{tempCustomer.id}"/>
    </c:url>
    
      <tr>
        <td> ${tempCustomer.firstName}</td>
        <td> ${tempCustomer.lastName}</td>
        <td> ${tempCustomer.email}</td>
        
        <td>
          <a href="${updateLink}">Update</a>
        </td>
      </tr>
    
    
    
    </c:forEach>
    
    
   
   </table>
   
   </div>
 
 
 </div>





</body>
</html>