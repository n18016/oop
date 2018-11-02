package idcard;
import framework.Product;

public class IDCard extends Product {
    private String owner;
    private Integer cardNo;
    IDCard(Integer cardNo, String owner) {
        System.out.println("カードNo." + cardNo + " " + owner + "のカードを作ります。");
        this.owner = owner;
        this.cardNo = cardNo;
    }
    @Override
    public void use() {
        System.out.println("カードNo." + cardNo + " " + owner + "のカードを使いました");
    }
    public String getOwner() {
        return owner;
    }
    public Integer getNo() {
        return cardNo;
    }
}
