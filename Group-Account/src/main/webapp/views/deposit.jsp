<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>입금하기</title>
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
    <form action="processDeposit.jsp" method="POST" style="width: 100%; height: 100%; position: relative; background: white;">
        <div style="left: 24.89px; top: 14.50px; position: absolute;">
            <div style="width: 30px; height: 17px; left: 0px; top: 0px; position: absolute; text-align: center; color: #1E1E2D; font-size: 15px; font-family: SF Pro Display; font-weight: 600; line-height: 18px; word-wrap: break-word;">9:41</div>
            <div style="width: 67px; height: 11.50px; left: 273.61px; top: 2.50px; position: absolute;">
                <div style="width: 24.50px; height: 11.50px; left: 42.50px; top: 0px; position: absolute;">
                    <div style="width: 24.50px; height: 11.50px; left: 0px; top: 0px; position: absolute; background: #A2A2A7; border: 1px solid;"></div>
                    <div style="width: 18px; height: 7.67px; left: 2px; top: 1.92px; position: absolute; background: #1E1E2D; border-radius: 1.60px; border: 1px solid;"></div>
                </div>
                <div style="width: 17.10px; height: 10.70px; left: 0px; top: 0.44px; position: absolute; background: #1E1E2D; border: 1px solid;"></div>
                <div style="width: 15.40px; height: 11.06px; left: 22.10px; top: 0.24px; position: absolute; background: #1E1E2D; border: 1px solid;"></div>
            </div>
        </div>
        <div style="width: 237px; left: 20px; top: 54px; position: absolute;">
            <div style="width: 42px; height: 42px; left: 0px; top: 0px; position: absolute;">
                <div style="width: 42px; height: 42px; left: 0px; top: 0px; position: absolute; background: #F4F4F4; border-radius: 9999px; border: 1px solid;"></div>
                <div style="width: 20px; height: 20px; left: 11px; top: 11px; position: absolute;">
                    <div style="width: 6px; height: 12px; left: 7px; top: 4px; position: absolute; border: 1.50px #1E1E2D solid;"></div>
                    <div style="width: 20px; height: 20px; left: 0px; top: 0px; position: absolute; border: 1px solid;"></div>
                </div>
            </div>
            <div style="width: 140px; height: 20px; left: 97px; top: 11px; position: absolute; text-align: center; color: #1E1E2D; font-size: 18px; font-family: Poppins; font-weight: 500; line-height: 18px; word-wrap: break-word;">입금하기</div>
        </div>
        <div style="width: 335px; height: 56px; left: 20px; top: 706px; position: absolute;">
            <button type="submit" style="width: 335px; height: 56px; left: 0px; top: 0px; position: absolute; background: #0066FF; border-radius: 16px; border: 1px solid; color: white; font-size: 16px; font-family: Poppins; font-weight: 600; line-height: 24px; text-align: center;">입금하기</button>
        </div>
        <div style="width: 345px; height: 116px; left: 10px; top: 312px; position: absolute;">
            <div style="width: 335px; height: 116px; left: 10px; top: 0px; position: absolute; background: white; border-radius: 14px; border: 1px #E7EAEE solid;"></div>
            <div style="width: 148px; height: 49px; left: 20px; top: 35px; position: absolute;">
                <label for="amount" style="width: 102px; height: 13px; left: 0px; top: 0px; position: absolute; text-align: center; color: #7E848D; font-size: 11px; font-family: Poppins; font-weight: 400; line-height: 11px;">금액</label>
                <input type="text" id="amount" name="amount" style="width: 104px; height: 26px; left: 44px; top: 23px; position: absolute; opacity: 0.90; font-size: 24px; font-family: Poppins; font-weight: 600; text-align: center;" placeholder="100000" />
            </div>
        </div>
        <div style="width: 335px; left: 20px; top: 127px; position: absolute;">
            <label for="depositor" style="width: 86px; height: 16px; left: 0px; top: 0px; position: absolute; color: #A2A2A7; font-size: 14px; font-family: Poppins; font-weight: 400; line-height: 14px;">입금자명</label>
            <input type="text" id="depositor" name="depositor" style="width: 335px; height: 32px; left: 0px; top: 31px; position: absolute; font-size: 14px; font-family: Poppins; color: #1E1E2D;" value="Tanya Myroniuk" />
        </div>
        <div style="width: 335px; left: 20px; top: 218px; position: absolute;">
            <label for="description" style="width: 79px; height: 16px; left: 0px; top: 0px; position: absolute; color: #A2A2A7; font-size: 14px; font-family: Poppins; font-weight: 400; line-height: 14px;">Description</label>
            <input type="text" id="description" name="description" style="width: 335px; height: 32px; left: 0px; top: 31px; position: absolute; font-size: 14px; font-family: Poppins; color: #1E1E2D;" />
        </div>
    </form>
</body>
</html>
