<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
  body {
    margin: 0;
    padding: 0;
    font-family: Poppins, Arial, sans-serif;
    background: white;
  }

  #container {
    width: 100%;
    max-width: 400px; /* 모바일 화면에 적합한 최대 폭 */
    margin: 0 auto;
    text-align: center;
    padding: 20px 10px;
  }

  #header {
    display: flex;
    justify-content: space-between;
    align-items: center;
    margin-bottom: 20px;
  }

  #header div {
    font-size: 15px;
    color: #1E1E2D;
    font-weight: 600;
  }

  #title {
    font-size: 18px;
    color: #1E1E2D;
    margin-bottom: 20px;
    font-weight: 500;
  }

  #image-container {
    margin-bottom: 20px;
  }

  #image-container img {
    width: 100%;
    max-width: 342px;
    height: auto;
  }

  #button-container {
    background: white;
    box-shadow: 0px 5px 30px rgba(0, 0, 0, 0.15);
    border-radius: 15px;
    padding: 20px;
    margin-bottom: 20px;
  }

  .menu-button {
    display: block;
    margin: 10px 0;
    font-size: 16px;
    font-weight: 700;
    color: #979797;
    text-decoration: none;
    cursor: pointer;
  }

  .menu-button.active {
    color: #3629B7;
  }

  #submit-button {
    width: 100%;
    background: #0066FF;
    color: white;
    font-size: 16px;
    font-weight: 600;
    padding: 15px;
    border-radius: 16px;
    border: none;
    cursor: pointer;
  }
</style>
</head>
<body>
<div id="container">
  <!-- Header -->
  <div id="header">
    <div>9:41</div>
    <div>통장개설</div>
  </div>

  <!-- Image Section -->
  <div id="image-container">
    <img src="./images/image 97.png" alt="나">
  </div>

  <!-- Button Section -->
  <div id="button-container">
    <a href="group.jsp" class="menu-button">계모임</a>
    <a href="travel.jsp" class="menu-button active">여행</a>
    <a href="option1.jsp" class="menu-button">Option 1</a>
    <a href="option2.jsp" class="menu-button">Option 2</a>
  </div>

  <!-- Submit Button -->
  <button id="submit-button">입금하기</button>
</div>
</body>
</html>
