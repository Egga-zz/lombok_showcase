package de.egga;

import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

/**
 * @author egga
 */
public class CustomerTest {

    @Test
    public void shouldName() {
        Customer customer = Customer.builder().name("some name").build();
        assertThat(customer.getName(), equalTo("some name"));
    }
}
