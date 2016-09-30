package be.pxl.ioc;

public class BadHearingWorkEthic extends BaseWorkEthic {

    @Override
    public String customerHappiness() {
        return "satisfied";
    }

    @Override
    public boolean writesCorrectName() {
        return false;
    }

}
