import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SalesTest {



    @Test
    public void shouldGive10PercentDiscountWhenSalesAmountIsOverOrEqual500() {
        //given
        double amount = 500.00;
        double amountWithDiscount = 450;
        Sale sale = new Sale(amount);

        //when
        double finalAmount = sale.calculateFinalAmount();

        //then
        assertThat(finalAmount, is(amountWithDiscount));
    }


    @Test
    public void shouldGive20PercentDiscountWhenSalesAmountIsOverOrEqual1000() {
        //given
        double amount = 1000;
        double amountWithDiscount = 800;
        Sale sale = new Sale(amount);

        //when
        double finalAmount = sale.calculateFinalAmount();

        //then
        assertThat(finalAmount, is(amountWithDiscount));
    }


    @Test
    public void shouldGive5PercentDiscountWhenSalesAmountIsLessThan500() {
        //given
        double amount = 300;
        double amountWithDiscount = 285;
        Sale sale = new Sale(amount);

        //when
        double finalAmount = sale.calculateFinalAmount();

        //then
        assertThat(finalAmount, is(amountWithDiscount));
    }
}
