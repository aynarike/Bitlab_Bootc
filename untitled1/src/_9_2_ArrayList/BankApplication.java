package _9_2_ArrayList;

import java.util.ArrayList;

public class BankApplication {
    String name;
    ArrayList accounts = new ArrayList();

    void addAccount(Account a) {
        accounts.add(a); //Добавляет новый объект Account
    }
    void removeAccount(int i){
        accounts.remove(i); //Удаляет объект со списка под индексом i
    }
    //Account getMaxAccount(){
         //Возвращает объект Account у кого самый высокий баланс
    //}

    //double getAverageBalance(){

    //}
    //double getTotalBalance(){

   // }
   // int totalAccounts(){

   // }
    //String getBankData(){

    //}
}