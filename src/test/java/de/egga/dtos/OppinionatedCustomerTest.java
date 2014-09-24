package de.egga.dtos;

import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

/**
 * @author egga
 */
public class OppinionatedCustomerTest {

    @Test
    public void shouldNotHaveAnOppinion() {
        OppinionatedCustomer customer = new OppinionatedCustomer();
        assertThat(customer.toString(), is(equalTo("Customer(id=null, name=null, email=null)")));
    }
}
