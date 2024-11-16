import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private String password;
    private float funds;
    private List<Transaction> transactionList = new ArrayList<Transaction>();

    public User(String username, String password) {
        this.username = username;
        this.password = password;

        this.funds = 0.0f;
    }

    public void addTransaction(Transaction transaction) {
        this.transactionList.add(transaction);
    }

    public void getTransactions() {
        System.out.println("List of transactions from " + this.getUsername() + ":");
        for(Transaction transaction : transactionList) {
            System.out.println("- " + transaction.from().getUsername() + " to " + transaction.to().getUsername() + ": $" + transaction.amount() + ".");
        }
    }

    public List<Transaction> getTransactionList() {
        return transactionList;
    }

    public void setTransactionList(List<Transaction> transactionList) {
        this.transactionList = transactionList;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public float getFunds() {
        return funds;
    }

    public void setFunds(float funds) {
        this.funds = funds;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", funds=" + funds +
                '}';
    }
}
