package cashregister;

import java.util.ArrayList;
import java.util.List;

public class TestPrinter extends Printer {
    private List<String> calledMethods = new ArrayList<>();
    private List<String> arguements = new ArrayList<>();
    private boolean nextCallByVerify;

    @Override
    public void print(String printThis) {
        if (nextCallByVerify) {
            if (this.hasCall("print", printThis)) {
            } else {
                throw new RuntimeException("not be called");
            }
        } else {
            calledMethods.add("print");
            arguements.add(printThis);
        }
    }

    private boolean hasCall(String methodName, String printThis) {
        return calledMethods.contains(methodName) && arguements.contains(printThis);
    }

    public void setNextCallByVerify(boolean nextCallByVerify) {
        this.nextCallByVerify = nextCallByVerify;
    }
}
