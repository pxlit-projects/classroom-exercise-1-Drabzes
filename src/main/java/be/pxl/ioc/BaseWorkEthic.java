package be.pxl.ioc;

import java.util.Objects;

abstract class BaseWorkEthic implements WorkEthic {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WorkEthic ethic = (WorkEthic) o;
        return Objects.equals(customerHappiness(), ethic.customerHappiness()) &&
                Objects.equals(writesCorrectName(), ethic.writesCorrectName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerHappiness(), writesCorrectName());
    }
}
