<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div style="width: 100%; height: 100%; background: white; position: relative;">
    <!-- Header -->
    <div style="display: flex; justify-content: space-between; align-items: center; padding: 10px 20px; background: white;">
        <div style="font-size: 15px; font-family: 'SF Pro Display', sans-serif; font-weight: 600; color: #1E1E2D;">
            <%= new java.text.SimpleDateFormat("HH:mm").format(new java.util.Date()) %>
        </div>
        <div style="display: flex; align-items: center; gap: 10px;">
            <div style="width: 18px; height: 18px; background: #1E1E2D; border-radius: 50%;"></div>
            <div style="width: 24px; height: 24px; background: #1E1E2D; border-radius: 50%;"></div>
        </div>
    </div>

    <!-- Page Title -->
    <div style="display: flex; justify-content: space-between; align-items: center; padding: 10px 20px;">
        <div style="font-size: 18px; font-family: 'Poppins', sans-serif; font-weight: 500; color: #1E1E2D;">
            입출금 기록
        </div>
        <div style="width: 40px; height: 40px; background: #F4F4F4; border-radius: 50%;"></div>
    </div>

    <!-- Transaction List Header -->
    <div style="display: flex; justify-content: space-between; align-items: center; padding: 10px 20px; background: #F4F4F4;">
        <div style="font-size: 16px; font-family: 'Poppins', sans-serif; font-weight: 500; color: #1E1E2D;">
            Today
        </div>
        <div style="font-size: 14px; font-family: 'Poppins', sans-serif; font-weight: 400; color: #0066FF; cursor: pointer;">
            See All
        </div>
    </div>

    <!-- Transactions -->
    <div style="padding: 20px;">
        <!-- Transaction Item -->
        <div style="display: flex; justify-content: space-between; align-items: center; margin-bottom: 10px;">
            <div style="display: flex; align-items: center; gap: 10px;">
                <div style="width: 40px; height: 40px; background: #1E1E2D; border-radius: 50%;"></div>
                <div>
                    <div style="font-size: 16px; font-family: 'Poppins', sans-serif; font-weight: 500; color: #1E1E2D;">
                        동아리모임
                    </div>
                    <div style="font-size: 12px; font-family: 'Poppins', sans-serif; font-weight: 400; color: #A2A2A7;">
                        커피
                    </div>
                </div>
            </div>
            <div style="font-size: 16px; font-family: 'Poppins', sans-serif; font-weight: 500; color: #1E1E2D;">
                - 10000
            </div>
        </div>

        <!-- Repeat similar items for other transactions -->
        <div style="display: flex; justify-content: space-between; align-items: center; margin-bottom: 10px;">
            <div style="display: flex; align-items: center; gap: 10px;">
                <div style="width: 40px; height: 40px; background: #1E1E2D; border-radius: 50%;"></div>
                <div>
                    <div style="font-size: 16px; font-family: 'Poppins', sans-serif; font-weight: 500; color: #1E1E2D;">
                        모임장
                    </div>
                    <div style="font-size: 12px; font-family: 'Poppins', sans-serif; font-weight: 400; color: #A2A2A7;">
                        생일기념
                    </div>
                </div>
            </div>
            <div style="font-size: 16px; font-family: 'Poppins', sans-serif; font-weight: 500; color: #1E1E2D;">
                +1000000
            </div>
        </div>
    </div>

    <!-- Footer -->
    <div style="width: 100%; height: 60px; background: #F4F4F4; display: flex; justify-content: space-around; align-items: center;">
        <div style="width: 30px; height: 30px; background: #1E1E2D; border-radius: 50%;"></div>
        <div style="width: 30px; height: 30px; background: #1E1E2D; border-radius: 50%;"></div>
        <div style="width: 30px; height: 30px; background: #1E1E2D; border-radius: 50%;"></div>
    </div>
</div>

</body>
</html>