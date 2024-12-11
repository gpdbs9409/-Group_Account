-- transactions 테이블 생성
CREATE TABLE transactions (
    id INT AUTO_INCREMENT PRIMARY KEY,
    sender_account VARCHAR(20),
    receiver_account VARCHAR(20),
    amount DECIMAL(10, 2),
    transaction_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
