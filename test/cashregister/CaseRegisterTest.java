package cashregister;


import org.junit.Test;

public class CaseRegisterTest {


    @org.junit.Test
    public void shouldPrintPurchaseDetailSuccessfully() {
        //when
        TestPrinter printer = new TestPrinter();
        CashRegister cashRegister = new CashRegister(printer);
        Purchase purchase = new Purchase(new Item[]{});

        //given
        cashRegister.process(purchase);

        //then
        verify(printer).print(anyString());
}

    @Test
    public void shouldPrintPurchaseDetailAsWeWant() {
        //when
        TestPrinter printer = new TestPrinter();
        CashRegister cashRegister = new CashRegister(printer);
        String itemsDetails = "itemsDetails";
        TestPurchase testPurchase = new TestPurchase(itemsDetails);

        //given
        cashRegister.process(testPurchase);

        //then
        verify(printer).print(itemsDetails);
    }

    private TestPrinter verify(TestPrinter testPrinter) {
        testPrinter.setNextCallByVerify(true);
        return testPrinter;
    }

    private String anyString() {
        return "";
    }
}
