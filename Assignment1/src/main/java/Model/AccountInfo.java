/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author shiva
 * This class stores all the info about the savings bank and checking bank account details
 * 
 */
public class AccountInfo {
    
    public String BankName;
    public String BankRoutingNumber;
    public String BankAccountNumber;
    public long AccountBalance;

    public String getBankName() {
        return BankName;
    }

    public void setBankName(String BankName) {
        this.BankName = BankName;
    }

    public String getBankRoutingNumber() {
        return BankRoutingNumber;
    }

    public void setBankRoutingNumber(String BankRoutingNumber) {
        this.BankRoutingNumber = BankRoutingNumber;
    }

    public String getBankAccountNumber() {
        return BankAccountNumber;
    }

    public void setBankAccountNumber(String BankAccountNumber) {
        this.BankAccountNumber = BankAccountNumber;
    }

    public long getAccountBalance() {
        return AccountBalance;
    }

    public void setAccountBalance(long AccountBalance) {
        this.AccountBalance = AccountBalance;
    }
    
    
}
