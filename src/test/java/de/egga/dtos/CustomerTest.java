package de.egga.dtos;

import org.testng.annotations.Test;

import static de.egga.dtos.Customer.builder;
import static de.egga.dtos.Customer.customer;
import static java.util.UUID.randomUUID;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

/**
 * @author egga
 */
public class CustomerTest {

    @Test
    public void shouldHaveEmptyConstructor() {
        new Customer();
    }

    @Test
    public void shouldHaveCompleteConstructor() {
        new Customer(randomUUID(), "some name", "heisenberg@meth-labs.org");
    }

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
        customer.setName("Raj Koothrappali");
        customer.setEmail("raj@bigbang.tv");
    }

    @Test
    public void shouldImplementToString() {
        Customer customer = new Customer();

        assertThat(customer.toString(), is(equalTo("Customer(id=null, name=null, email=null)")));
    }

    @Test
    public void shouldAddEquals() {
        Customer one = builder().name("Elmo").build();
        Customer another = builder().name("Elmo").build();

        assertThat(one, is(equalTo(another)));
    }

    @Test
    public void shouldAddBuilder() {
        Customer customer = builder()
                .id(randomUUID())
                .name("Darth Vader")
                .email("vader@empire.gov")
                .build();
    }

    @Test
    public void shouldAllowDefaultValues() {
        Customer customer = customer();

        assertThat(customer.getId(), is(notNullValue()));
        assertThat(customer.getName(), is(notNullValue()));
        assertThat(customer.getEmail(), is(notNullValue()));
    }
}
