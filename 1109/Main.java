import framework.Factory;
import framework.Product;
import account.AccountFactory;
import account.Account;

public class Main {

    public static void main(String[] args) {
        Factory account = new AccountFactory();
        Product card1 = account.create("山内公之");
        Product card2 = account.create("山田花子");
        Product card3 = account.create("山本太郎");
        ((Account)card1).setPassword("123");
        ((Account)card2).setPassword("456");
        ((Account)card3).setPassword("789");
        System.out.println(((Account)card1).getAccount());
        System.out.println(((Account)card2).getAccount());
        System.out.println(((Account)card3).getAccount());
        System.out.println(((Account)card1).getPassword());
        System.out.println(((Account)card2).getPassword());
        System.out.println(((Account)card3).getPassword());
        card1.use();
        card2.use();
        card3.use();
        ((AccountFactory)account).getAccounts();
    }
}
