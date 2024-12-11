
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>통장 등록하기</title>
    <style>/* Global Styles */
body {
    font-family: 'Poppins', sans-serif;
    margin: 0;
    padding: 0;
    background-color: #161622;
    color: white;
    display: flex;
    justify-content: center;
    align-items: center;
    min-height: 100vh;
}

.container {
    width: 100%;
    max-width: 400px;
    padding: 20px;
    box-sizing: border-box;
}

.header {
    display: flex;
    justify-content: space-between;
    align-items: center;
    padding: 10px 0;
}

.time {
    font-size: 15px;
    font-weight: 600;
}

.status-bar {
    display: flex;
    gap: 10px;
}

.signal, .wifi, .battery {
    width: 20px;
    height: 15px;
    background-color: white;
}

.main-content {
    margin-top: 20px;
}

.title {
    display: flex;
    align-items: center;
    gap: 10px;
    margin-bottom: 20px;
}

.back-button {
    width: 40px;
    height: 40px;
    background-color: #1E1E2D;
    border: 1px solid #232533;
    border-radius: 50%;
}

.title h1 {
    font-size: 18px;
    font-weight: 500;
}

.account-card {
    background-color: #25253D;
    padding: 20px;
    border-radius: 25px;
    margin-bottom: 20px;
    border: 1px solid #2A2C3C;
}

.card-info {
    text-align: center;
}

.card-number {
    font-size: 24px;
    margin: 10px 0;
}

.bank-name {
    font-size: 20px;
}

.expiry-cvv {
    display: flex;
    justify-content: space-between;
    margin-top: 10px;
}

.expiry-cvv p:first-child {
    color: #A2A2A7;
    font-size: 12px;
}

.account-form {
    display: flex;
    flex-direction: column;
    gap: 15px;
}

.account-form label {
    font-size: 14px;
    color: #A2A2A7;
}

.account-form input {
    padding: 10px;
    border: 1.5px solid #232533;
    border-radius: 8px;
    background-color: #1E1E2D;
    color: white;
    font-size: 14px;
}

.submit-button {
    padding: 15px;
    background-color: #0066FF;
    color: white;
    border: none;
    border-radius: 16px;
    font-size: 16px;
    font-weight: 600;
    cursor: pointer;
}

.submit-button:hover {
    background-color: #0056E0;
}
    </style>
</head>
<body>
    <div class="container">
        <header class="header">
            <div class="time">9:41</div>
            <div class="status-bar">
                <div class="signal"></div>
                <div class="wifi"></div>
                <div class="battery"></div>
            </div>
        </header>
        <main class="main-content">
            <div class="title">
                <button class="back-button"></button>
                <h1>통장 등록하기</h1>
            </div>
            <section class="account-card">
                <div class="card-info">
                    <p class="card-number">024-801-044-25101</p>
                    <p class="bank-name">국민</p>
                    <div class="expiry-cvv">
                        <div>
                            <p>Expiry Date</p>
                            <p>24/2000</p>
                        </div>
                        <div>
                            <p>CVV</p>
                            <p>6986</p>
                        </div>
                    </div>
                </div>
            </section>
		<form class="account-form" action="${pageContext.request.contextPath}/RegisterAccountServlet" method="post">
		    <label for="account-name">우리 모임통장 이름</label>
		    <input type="text" id="account-name" name="account-name" placeholder="Tanya Myroniuk">
		
		    <label for="description">설명</label>
		    <input type="text" id="description" name="description" placeholder="09/06/2024">
		
		    <label for="bankname">은행명</label>
		    <input type="text" id="bankname" name="bankname" placeholder="국민">
		
		    <label for="account-number">계좌 번호</label>
		    <input type="text" id="account-number" name="account-number" placeholder="4562 1122 4595 7852">
		
		    <button type="submit" class="submit-button">등록하기</button>
		</form>

        </main>
    </div>
</body>
</html>
