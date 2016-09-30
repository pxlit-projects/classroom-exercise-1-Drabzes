package be.pxl.ioc;

public class LazyWorkEthic extends BaseWorkEthic {
    @Override
    public String customerHappiness() {
        return "unsatisfied";
    }

    @Override
    public boolean writesCorrectName() {
        return false;
    }
}
