package OOD;

import java.util.Date;

public class CreditCard {
    public BillingStatement billingStatement;
    private int CardNum;
    private Date CardDate;

    /**
     *
     * @param CardNum
     */
    public CreditCard(int CardNum) {
        this.CardNum = CardNum;
    }
}
