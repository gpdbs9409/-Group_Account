package beans;

import java.io.Serializable;
import org.apache.tomcat.util.digester.ArrayStack;

public class Account implements Serializable {
    private static final long serialVersionUID = 1L;

    private String accountName; // 계좌 이름
    private String accountNumber; // 계좌 번호
    private int balance; // 잔액
    private ArrayStack members; // 계좌 멤버 (스택)

    public Account() {}

    // 모든 필드를 초기화하는 생성자
    public Account(String accountName, String accountNumber, int balance, ArrayStack members) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.members = members;
    }

    // Getter and Setter for accountName
    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    // Getter and Setter for accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Getter and Setter for balance
    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    // Getter and Setter for members
    public ArrayStack getMembers() {
        return members;
    }

    public void setMembers(ArrayStack members) {
        this.members = members;
    }
}
