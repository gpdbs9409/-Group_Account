<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Sign-up</title>
</head>
<body>
<form action="register.jsp" method="post">
    <div style="width: 100%; height: 100%; position: relative; background: white">
        <div style="left: 24.89px; top: 14.50px; position: absolute">
            <div style="width: 30px; height: 17px; left: 0px; top: 0px; position: absolute; text-align: center; color: #1E1E2D; font-size: 15px; font-family: SF Pro Display; font-weight: 600; line-height: 18px; word-wrap: break-word">9:41</div>
            <div style="width: 67px; height: 11.50px; left: 273.61px; top: 2.50px; position: absolute">
                <div style="width: 24.50px; height: 11.50px; left: 42.50px; top: 0px; position: absolute">
                    <div style="width: 24.50px; height: 11.50px; left: 0px; top: 0px; position: absolute; background: #A2A2A7; border: 1px solid;"></div>
                    <div style="width: 18px; height: 7.67px; left: 2px; top: 1.92px; position: absolute; background: #1E1E2D; border-radius: 1.60px; border: 1px solid;"></div>
                </div>
                <div style="width: 17.10px; height: 10.70px; left: 0px; top: 0.44px; position: absolute; background: #1E1E2D; border: 1px solid;"></div>
                <div style="width: 15.40px; height: 11.06px; left: 22.10px; top: 0.24px; position: absolute; background: #1E1E2D; border: 1px solid;"></div>
            </div>
        </div>
        <div style="width: 335px; left: 20px; top: 221px; position: absolute">
            <label style="color: #A2A2A7; font-size: 14px; font-family: Poppins; font-weight: 400; line-height: 14px;">이름</label>
            <input type="text" name="username" style="width: 335px; height: 32px; border: 1.5px solid #F4F4F4; margin-top: 8px;">
        </div>
        <div style="width: 335px; left: 20px; top: 305px; position: absolute">
            <label style="color: #A2A2A7; font-size: 14px; font-family: Poppins; font-weight: 400; line-height: 14px;">이메일</label>
            <input type="email" name="email" style="width: 335px; height: 32px; border: 1.5px solid #F4F4F4; margin-top: 8px;">
        </div>
        <div style="width: 335px; left: 20px; top: 389px; position: absolute">
            <label style="color: #A2A2A7; font-size: 14px; font-family: Poppins; font-weight: 400; line-height: 14px;">비밀번호</label>
            <input type="password" name="password" style="width: 335px; height: 32px; border: 1.5px solid #F4F4F4; margin-top: 8px;">
        </div>
        <div style="width: 335px; height: 56px; left: 20px; top: 576px; position: absolute;">
            <button type="submit" style="width: 335px; height: 56px; background: #0066FF; color: white; font-size: 16px; font-family: Poppins; font-weight: 600; line-height: 24px; border: none; border-radius: 16px; cursor: pointer;">
                등록하기
            </button>
        </div>
        <div style="width: 122px; height: 16px; left: 127px; top: 662px; position: absolute; color: #0066FF; font-size: 14px; font-family: Poppins; font-weight: 500; line-height: 14px; text-align: center; cursor: pointer;"
             onclick="location.href='sign-in.jsp';">
            이미 계정이 있어요
        </div>
        <div style="width: 123px; height: 34px; left: 20px; top: 149px; position: absolute; color: #1E1E2D; font-size: 32px; font-family: Poppins; font-weight: 500; line-height: 32px; word-wrap: break-word;">
            회원가입
        </div>
    </div>
</form>
</body>
</html>
