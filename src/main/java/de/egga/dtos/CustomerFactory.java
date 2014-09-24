package de.egga.dtos;

import static java.util.UUID.randomUUID;

/**
 * @author egga
 */
public class CustomerFactory {

    public static Customer customer() {
        return Customer.builder()
                .id(randomUUID())
                .name("some name")
                .email("me@mail.com")
                .build();
    }
}
