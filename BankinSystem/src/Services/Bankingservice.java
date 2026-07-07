package Services;
//Program to define an interface to provide Banking services

import java.util.Collection;
import java.util.List;

import Entities.Account;
import Entities.Benificiary;
import Entities.Customer;
import Entities.Transaction;

public interface Bankingservice {
	
    void addCustomer(Customer customer);
    void addAccount(Account account);
    void addTransaction(Transaction transaction);
    void addBeneficiary(Benificiary beneficiary);

    Customer findCustomerById(int id);
    Account findAccountById(int id);
    Transaction findTransactionById(int id);
    Benificiary findBeneficiaryById(int id);

    Collection<Account> getAllAccounts();
    Collection<Customer> getAllCustomers();
    Collection<Transaction> getAllTransactions();
    Collection<Benificiary> getAllBeneficiaries();
    
    List<Account> getAccountsByCustomerId(int customerId);
    List<Transaction> getTransactionsByAccountId(int accountId);
    List<Benificiary> getBeneficiariesByCustomerId(int customerId);
}


