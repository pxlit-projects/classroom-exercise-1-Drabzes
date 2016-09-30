package be.pxl.ioc;

public class CustomerFriendlyWorkEthic extends BaseWorkEthic {
    @Override
    public String customerHappiness() {
        return "satisfied";
    }

    @Override
    public boolean writesCorrectName() {
        return true;
    }
}
