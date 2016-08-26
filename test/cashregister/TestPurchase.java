package cashregister;

public class TestPurchase extends Purchase {

    private String string;

    public TestPurchase(Item[] items) {
        super(items);
    }

    public TestPurchase(String string){
        super(new Item[] {});
        this.string = string;
    }

    public String asString() {
        return string;
    }
}
