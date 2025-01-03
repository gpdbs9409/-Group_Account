<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>계모임 통장</title>
    <style>
        body {
            margin: 0;
            padding: 0;
            background: #161622;
            font-family: 'SF Pro Display', sans-serif;
        }
        /* 추가 CSS는 필요에 따라 여기에 포함 */
    </style>
</head>
<body>
    <div style="width: 100%; height: 100%; position: relative; background: #161622;">
        <!-- 상단 시간 표시 -->
        <div style="left: 24.89px; top: 14.50px; position: absolute;">
            <div style="width: 30px; height: 17px; left: 0px; top: 0px; position: absolute; text-align: center; color: white; font-size: 10px; font-family: SF Pro Display; font-weight: 600; line-height: 18px; word-wrap: break-word;">
                <%= new java.text.SimpleDateFormat("HH:mm").format(new java.util.Date()) %>
            </div>
            <div style="width: 67px; height: 11.50px; left: 273.61px; top: 2.50px; position: absolute;">
                <div style="width: 24.50px; height: 11.50px; left: 42.50px; top: 0px; position: absolute;">
                    <div style="width: 24.50px; height: 11.50px; left: 0px; top: 0px; position: absolute; background: #A2A2A7; border: 1px solid;"></div>
                    <div style="width: 18px; height: 7.67px; left: 2px; top: 1.92px; position: absolute; background: white; border-radius: 1.60px; border: 1px solid;"></div>
                </div>
                <div style="width: 17.10px; height: 10.70px; left: 0px; top: 0.44px; position: absolute; background: white; border: 1px solid;"></div>
                <div style="width: 15.40px; height: 11.06px; left: 22.10px; top: 0.24px; position: absolute; background: white; border: 1px solid;"></div>
            </div>
        </div>
        <!-- 제목 섹션 -->
        <div style="width: 223px; left: 20px; top: 54px; position: absolute;">
            <div style="width: 42px; height: 42px; left: 0px; top: 0px; position: absolute;">
                <div style="width: 42px; height: 42px; left: 0px; top: 0px; position: absolute; background: #1E1E2D; border-radius: 9999px; border: 1px solid;"></div>
                <div style="width: 20px; height: 20px; left: 11px; top: 11px; position: absolute;">
                    <div style="width: 6px; height: 12px; left: 7px; top: 4px; position: absolute; border: 1.50px white solid;"></div>
                    <div style="width: 20px; height: 20px; left: 0px; top: 0px; position: absolute; border: 1px solid;"></div>
                </div>
            </div>
            <div style="width: 112px; height: 20px; left: 111px; top: 11px; position: absolute; text-align: center; color: white; font-size: 18px; font-family: Poppins; font-weight: 500; line-height: 18px; word-wrap: break-word;">계모임통장</div>
        </div>
        <!-- 입출금 버튼 -->		<div 
		    style="width: 335px; height: 56px; left: 20px; top: 706px; position: absolute; cursor: pointer;" 
		    onclick="location.href='deposit.jsp';">
		    <div style="width: 335px; height: 56px; left: 0px; top: 0px; position: absolute; background: #0066FF; border-radius: 16px; border: 1px solid;"></div>
		    <div style="width: 100px; height: 24px; left: 117.50px; top: 16px; position: absolute; text-align: center; color: white; font-size: 16px; font-family: Poppins; font-weight: 600; line-height: 24px; word-wrap: break-word;">입/출금하기</div>
		</div>

        <!-- 잔액 표시 -->
        <div style="width: 335px; height: 116px; left: 20px; top: 516px; position: absolute;">
            <div style="width: 335px; height: 116px; left: 0px; top: 0px; position: absolute; background: #1E1E2D; border-radius: 14px; border: 1px solid;"></div>
            <div style="width: 132px; height: 58px; left: 16px; top: 29px; position: absolute;">
                <div style="width: 49px; height: 26px; left: 0px; top: 32px; position: absolute; text-align: center; color: #9CB1D1; font-size: 24px; font-family: Poppins; font-weight: 600; line-height: 24px; word-wrap: break-word;">잔액</div>
                <div style="width: 102px; height: 13px; left: 0px; top: 0px; position: absolute; text-align: center; color: #9CB1D1; font-size: 11px; font-family: Poppins; font-weight: 400; line-height: 11px; word-wrap: break-word;"> </div>
                <div style="width: 67px; height: 26px; left: 65px; top: 32px; position: absolute; text-align: center; color: white; font-size: 24px; font-family: Poppins; font-weight: 600; line-height: 24px; word-wrap: break-word;">3600</div>
            </div>
        </div>
        <!-- 모임원 리스트 -->
        <div style="width: 335px; height: 128px; left: 20px; top: 357px; position: absolute;">
            <div style="width: 335px; height: 128px; left: 0px; top: 0px; position: absolute; background: #1E1E2D; border-radius: 14px; border: 1px solid;"></div>
            <div style="width: 48px; height: 68px; left: 12px; top: 46px; position: absolute;">
                <div style="width: 23px; height: 13px; left: 13px; top: 55px; position: absolute; color: white; font-size: 11px; font-family: Poppins; font-weight: 400; line-height: 11px; word-wrap: break-word;">방장</div>
                <div style="width: 48px; height: 48px; left: 0px; top: 0px; position: absolute;">
                    <div style="width: 48px; height: 48px; left: 0px; top: 0px; position: absolute; background: #242433; border-radius: 9999px; border: 1px #0066FF solid;"></div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
