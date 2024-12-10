
# Group Account - 모임통장 관리 웹 애플리케이션

## 프로젝트 개요
**Group Account**는 사용자가 여행, 회비 모임, 곗돈 관리 등 다양한 모임에서 필요한 자금 관리를 효율적으로 할 수 있도록 돕는 웹 애플리케이션입니다. 카카오뱅크의 모임통장 기능을 모방하여, 회비를 손쉽게 추적하고 관리할 수 있는 환경을 제공합니다.

---

## 주요 기능
1. **회원가입 및 로그인**
   - 사용자는 이메일과 비밀번호를 통해 계정을 생성하고 로그인할 수 있습니다.
2. **모임통장 생성**
   - 여행, 곗돈 모임 등 다양한 목적에 맞는 통장을 생성할 수 있습니다.
3. **회비 관리**
   - 회비 입금 내역 및 잔액을 한눈에 확인 가능하며, 입금 및 출금 내역을 기록합니다.
4. **사용자 역할 관리**
   - 모임 관리자와 일반 사용자를 구분하여 역할에 따른 기능을 제공합니다.

---

## 기술 스택
- **프론트엔드**
  - JSP
  - HTML, CSS, JavaScript
- **백엔드**
  - Java (Servlets)
  - JDBC (MySQL 연동)
- **데이터베이스**
  - MySQL
- **서버**
  - Apache Tomcat 9.0
- **빌드 및 의존성 관리**
  - Maven

---

## 프로젝트 구조
```
Group-Account/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── beans/
│   │   │   │   ├── Account.java
│   │   │   │   └── User.java
│   │   │   ├── dao/
│   │   │   │   └── UserDAO.java
│   │   │   ├── servlets/
│   │   │   │   └── LoginServlet.java
│   │   │   └── util/
│   │   ├── webapp/
│   │   │   ├── jsp/
│   │   │   │   ├── AddAccountType.jsp
│   │   │   │   ├── AddAccount.jsp
│   │   │   │   ├── bank.jsp
│   │   │   │   ├── deposit.jsp
│   │   │   │   ├── register.jsp
│   │   │   │   ├── sign-in.jsp
│   │   │   │   └── sign-up.jsp
│   │   │   ├── META-INF/
│   │   │   └── WEB-INF/
│   ├── target/
├── pom.xml
└── README.md
```

---

## 실행 방법
1. **MySQL 데이터베이스 설정**
   - MySQL에서 다음 명령어를 실행하여 데이터베이스와 테이블을 생성합니다:
     ```sql
     CREATE DATABASE group_account;
     USE group_account;
     CREATE TABLE users (
         id INT AUTO_INCREMENT PRIMARY KEY,
         username VARCHAR(50) NOT NULL,
         email VARCHAR(100) NOT NULL,
         password VARCHAR(255) NOT NULL,
         created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
     );
     ```

2. **Tomcat 서버 설정**
   - 프로젝트를 Tomcat 9.0에 배포하고 실행합니다.

3. **웹 애플리케이션 실행**
   - 브라우저에서 [http://localhost:8080/Group-Account](http://localhost:8080/Group-Account)로 접속합니다.

---

## 주요 클래스 및 역할
1. **UserDAO.java**
   - 데이터베이스와 연동하여 사용자 정보를 저장 및 조회합니다.
2. **Account.java, User.java**
   - 사용자와 계좌 데이터를 관리하는 Java Bean 클래스입니다.
3. **LoginServlet.java**
   - 사용자 인증 로직을 처리합니다.

---

## 프로젝트 미리보기
- **회원가입 화면**: 사용자가 계정을 생성하는 화면.
- **로그인 화면**: 기존 사용자 로그인.
- **모임 통장 관리**: 입금 내역 추가 및 잔액 확인.

---


---

## 개선 사항
- UI 디자인 개선
- 다양한 통화 지원
- 추가 통계 및 시각화 기능 제공
