package be.pxl.ioc;

class CustomerExperience {
    private String customer;
    private String happiness;
    private String barista;
    private boolean gotCorrectNameOnCup;

    CustomerExperience(String customer, String happiness, String barista, boolean gotCorrectNameOnCup) {
        this.customer = customer;
        this.happiness = happiness;
        this.barista = barista;
        this.gotCorrectNameOnCup = gotCorrectNameOnCup;
    }

    public String getCustomer() {
        return customer;
    }

    public String getHappiness() {
        return happiness;
    }

    public String getBarista() {
        return barista;
    }

    public boolean gotCorrectNameOnCup() {
        return gotCorrectNameOnCup;
    }

    @Override
    public String toString() {
        return String.format("Customer %s was %s with the service of barista %s, %s",
                customer, happiness, barista, gotCorrectNameOnCup ? "and was properly named" : "but was not properly named");
    }
}
