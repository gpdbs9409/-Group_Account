<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>로그인</title>
    <style>
        body {
            margin: 0;
            padding: 0;
            background: white;
            font-family: 'Poppins', sans-serif;
        }
    </style>
</head>
<body>
    <div style="width: 100%; height: 100%; position: relative; background: white;">
        <!-- 상단 시간 표시 -->
        <div style="left: 24.89px; top: 14.50px; position: absolute;">
            <div style="width: 30px; height: 17px; left: 0px; top: 0px; position: absolute; text-align: center; color: #1E1E2D; font-size: 10px; font-family: 'SF Pro Display', sans-serif; font-weight: 600; line-height: 18px; word-wrap: break-word;">
                <%= new java.text.SimpleDateFormat("HH:mm").format(new java.util.Date()) %>
            </div>
        </div>

        <!-- 로그인 폼 -->
   <form action="${pageContext.request.contextPath}/LoginServlet" method="POST">

            <!-- 이메일 입력 -->
            <div style="width: 335px; left: 20px; top: 221px; position: absolute;">
                <label for="email" style="width: 99px; height: 16px; left: 0px; top: 0px; position: absolute; color: #A2A2A7; font-size: 14px; font-family: Poppins; font-weight: 400; line-height: 14px; word-wrap: break-word;">Email Address</label>
                <div style="width: 335px; height: 32px; left: 0px; top: 31px; position: absolute;">
                    <input type="email" id="email" name="email" required style="width: 300px; height: 30px; font-size: 14px; border: none; outline: none; background: none; color: #1E1E2D;">
                    <div style="width: 335px; height: 0px; left: 0px; top: 32px; position: absolute; border: 1.50px #F4F4F4 solid;"></div>
                </div>
            </div>

            <!-- 비밀번호 입력 -->
            <div style="width: 335px; left: 20px; top: 305px; position: absolute;">
                <label for="password" style="width: 68px; height: 16px; left: 0px; top: 0px; position: absolute; color: #A2A2A7; font-size: 14px; font-family: Poppins; font-weight: 400; line-height: 14px; word-wrap: break-word;">Password</label>
                <div style="width: 335px; height: 32px; left: 0px; top: 31px; position: absolute;">
                    <input type="password" id="password" name="password" required style="width: 300px; height: 30px; font-size: 14px; border: none; outline: none; background: none; color: #1E1E2D;">
                    <div style="width: 335px; height: 0px; left: 0px; top: 32px; position: absolute; border: 1.50px #F4F4F4 solid;"></div>
                </div>
            </div>

            <!-- 로그인 버튼 -->
            <div style="width: 335px; height: 56px; left: 20px; top: 408px; position: absolute;">
                <button type="submit" style="width: 335px; height: 56px; background: #0066FF; border-radius: 16px; border: none; color: white; font-size: 16px; font-family: Poppins; font-weight: 700; cursor: pointer;">로그인</button>
            </div>
        </form>

        <!-- 하단 텍스트 -->
        <div style="width: 155px; height: 16px; left: 110px; top: 493px; position: absolute;">
            <span style="color: #A2A2A7; font-size: 14px; font-family: Poppins; font-weight: 400; line-height: 14px; word-wrap: break-word;">계정이 없어요.</span>
            <a href="signup.jsp" style="color: #0066FF; font-size: 14px; font-family: Poppins; font-weight: 500; line-height: 14px; text-decoration: none;"> 회원가입</a>
        </div>

        <!-- 상단 아이콘 -->
        <div style="width: 42px; height: 42px; left: 20px; top: 54px; position: absolute;">
            <div style="width: 42px; height: 42px; left: 0px; top: 0px; position: absolute; background: #F4F4F4; border-radius: 9999px; border: 1px solid;"></div>
        </div>

        <!-- 상단 제목 -->
        <div style="width: 108px; height: 34px; left: 20px; top: 149px; position: absolute; color: #1E1E2D; font-size: 32px; font-family: Poppins; font-weight: 500; line-height: 32px; word-wrap: break-word;">로그인</div>
    </div>
</body>
</html>
