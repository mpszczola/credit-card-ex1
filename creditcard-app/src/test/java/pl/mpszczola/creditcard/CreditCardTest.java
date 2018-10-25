import org.junit.Assert;
import org.junit.Test;

public class CreditCardTest {

    @Test
    public void allowAssignLimitToCard() {
        CreditCard card = new CreditCard();

        card.assignLimit(2000);

        Assert.assertTrue(card.getLimit() == 2000);
    }
    
    @Test
    public void cantWithdrawWhenCantAfford() {

    }
    
    @Test(expected = WithdrawWhenCardBlocked.class)
    public void cantWithdrawWhenCardBlocked() throws Exception{
        CreditCard card= new CreditCard();
        card.assignLimit(200);
        card.block();
        card.withdraw(100);
    }
}