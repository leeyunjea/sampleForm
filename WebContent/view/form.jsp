<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
html {
	background:#CEF6EC;
}
h1{
	text-align:center;
}
</style>
</head>
<body>
<h1>A Sample Form</h1>
<form action="/sampleForm_first_homework/doInput" method="get">
Item Number: <input type="text" name="itemNumber"/><br/>
Description: <input type="text" name="description"/><br/>
Price Each: <input type="text" name="priceEach"/>
<hr>
First Name: <input type="text" name="firstName"/><br/>
Last Name: <input type="text" name="lastName"/><br/>
Middle Initial: <input type="text" name="middleInitial"/><br/>
Shipping Address: <textarea cols="30" name="shippingAddress"></textarea><br/>
Credit Card:<br/>
<input type="radio" name="cardType" value="Visa">Visa<br/>
<input type="radio" name="cardType" value="MasterCard">MasterCard<br/>
<input type="radio" name="cardType" value="AmericanExpress">American Express<br/>
<input type="radio" name="cardType" value="Discover">Discover<br/>
<input type="radio" name="cardType" value="JavaSmartCard">Java SmartCard<br/>
Credit Card Number: <input type="password" name="cardNumber"/><br/>
Repeat Credit Card Number: <input type="password" name="repeatCardNumber"/><br/>
<input type="submit" value="Submit Order"/>
</form>
</body>
</html>