package day10.TestExam;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> account;
    private int number;

    public Bank() {
        this.account = new ArrayList<>();
        this.number = 1;
    }

    public void newRegist(String name, String bankName , String bankNum, double balance) {
        Account newaccount = new Account(number, name, bankName, bankNum, balance);
        account.add(newaccount);
        System.out.println("신규 계좌가 개설 되었습니다. 계좌 정보는 \n" + "Account 정보: " +
                "\n 계좌번호: " + number +
                "\n 소유자 이름: " + name +
                "\n 은행명: " + bankName +
                "\n 계좌번호: " + bankNum +
                "\n 잔액: " + balance);
        number++;
    }

    public void search(String name,String bankNum){
        for(Account acc : account){
            if(acc.getName().equals(name) && acc.getBankNum().equals(bankNum)){
                System.out.println("조회한 계좌 정보는 \n" +"Account 정보: " +
                        "\n 계좌번호: " + acc.getBankNum() +
                        "\n 소유자 이름: " + acc.getName() +
                        "\n 은행명: " + acc.getBankName() +
                        "\n 계좌번호: " + acc.getBankNum() +
                        "\n 잔액: " + acc.getBalance());
            } else{
                System.out.println("해당 정보와 일치하는 계좌가 없습니다.");
            }
        }
    }


    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.newRegist("정인규","국민은행","93800200",10000);

        bank.search("정인규","938002008");

    }
}

