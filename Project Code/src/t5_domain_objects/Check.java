package t5_domain_objects;

public class Check {
    private int CheckNum;
    public BillingStatement billingStatement;

    /**
     *
     * @param CheckNum
     */
    public Check(int CheckNum) {
        this.CheckNum = CheckNum;
    }
}
