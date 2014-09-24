package de.egga.dtos;

import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

/**
 * @author egga
 */
public class OppinionatedCustomerTest {

    @Test
    public void shouldNotHaveAnOppinion() {
        OppinionatedCustomer customer = new OppinionatedCustomer();
        customer.setOppinion("strong");
        assertThat(customer.getOppinion(), is(notNullValue()));
    }
}
