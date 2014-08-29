package de.egga.dtos;

import org.testng.annotations.Test;

import static java.util.UUID.randomUUID;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

/**
 * @author egga
 */
public class CustomerTest {

    @Test
    public void shouldAddGetterMethods() {
        Customer customer = new Customer();

        customer.getId();
        customer.getName();
        customer.getEmail();
    }

    @Test
    public void shouldAddSetterMethods() {
        Customer customer = new Customer();

        customer.setId(randomUUID());
        customer.setName("some name");
        customer.setEmail("e@mail.com");
    }

    @Test
    public void shouldImplementToString() {
        Customer customer = new Customer();

        assertThat(customer.toString(), is(equalTo("Customer(id=null, name=null, email=null)")));
    }

    @Test
    public void shouldAddBuilder() {
        Customer customer = Customer.builder()
                .id(randomUUID())
                .name("Darth Vader")
                .email("vader@empire.gov")
                .build();
    }
}
