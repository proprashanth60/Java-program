package Services;
//Program to implement banking services


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import Entities.Account;
import Entities.Benificiary;
import Entities.Customer;
import Entities.Transaction;

public class Bankingserviceimpl implements Bankingservice {
	
    private Map<Integer, Customer> customers = new HashMap<>();
    private Map<Integer, Account> accounts = new HashMap<>();
    private Map<Integer, Transaction> transactions = new HashMap<>();
    private Map<Integer, Benificiary> beneficiaries = new HashMap<>();

    @Override
    public void addCustomer(Customer customer) {
        customers.put(customer.getCustomerid(), customer);
    }

    @Override
    public void addAccount(Account account) {
        accounts.put(account.getAccountid(), account);
    }

    @Override
    public void addTransaction(Transaction transaction) {
        transactions.put(transaction.getTransactionid(), transaction);
        Account account = accounts.get(transaction.getAccountid());
        if (account != null) {
            if (transaction.getType().equalsIgnoreCase("deposit")) {
                account.setBalance(account.getBalance() + transaction.getAmount());
            } else if (transaction.getType().equalsIgnoreCase("withdrawal")) {
                account.setBalance(account.getBalance() - transaction.getAmount());
            }
        }
    }

    @Override
    public void addBeneficiary(Benificiary beneficiary) {
        beneficiaries.put(beneficiary.getBenificiaryid(), beneficiary);
    }

    @Override
    public Customer findCustomerById(int id) {
        return customers.get(id);
    }

    @Override
    public Account findAccountById(int id) {
        return accounts.get(id);
    }

    @Override
    public Transaction findTransactionById(int id) {
        return transactions.get(id);
    }

    @Override
    public Benificiary findBeneficiaryById(int id) {
        return beneficiaries.get(id);
    }

    @Override
    public List<Account> getAccountsByCustomerId(int customerId) {
        List<Account> result = new ArrayList<>();
        for (Account account : accounts.values()) {
            if (account.getCustomerid() == customerId) {
                result.add(account);
            }
        }
        return result;
    }

    @Override
    public List<Transaction> getTransactionsByAccountId(int accountId) {
        List<Transaction> result = new ArrayList<>();
        for (Transaction transaction : transactions.values()) {
            if (transaction.getAccountid() == accountId) {
                result.add(transaction);
            }
        }
        return result;
    }

    @Override
    public List<Benificiary> getBeneficiariesByCustomerId(int customerId) {
        List<Benificiary> result = new ArrayList<>();
        for (Benificiary beneficiary : beneficiaries.values()) {
            if (beneficiary.getCustomerid() == customerId) {
                result.add(beneficiary);
            }
        }
        return result;
    }

	@Override
	public Collection<Account> getAllAccounts() {
		
		return  accounts.values();
	}

	@Override
	public Collection<Customer> getAllCustomers() {
		return  customers.values();
	}

	@Override
	public Collection<Transaction> getAllTransactions() {
		
		return  transactions.values();
	}

	@Override
	public Collection<Benificiary> getAllBeneficiaries() {
		
		return  beneficiaries.values();
	}
}
