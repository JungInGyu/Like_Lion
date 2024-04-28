package day10.TestExam;

public class Account {
    private int number;
    private String name;
    private String bankName;
    private String bankNum;
    private double balance;



    public Account(int number, String name, String bankName, String bankNum, double balance) {
        this.number = number;
        this.name = name;
        this.bankName = bankName;
        this.bankNum = bankNum;
        this.balance = balance;
    }
    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getBankName() {
        return bankName;
    }

    public String getBankNum() {
        return bankNum;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double widthdrawMoney){
        if(widthdrawMoney > balance){
            System.out.println("잔액이 부족합니다.");
        } else{
            balance -= widthdrawMoney;
            System.out.println(widthdrawMoney+"원이 출금 되었습니다.\t" +"출금후 잔액은: "+balance+" 입니다.");
        }
    }
}
