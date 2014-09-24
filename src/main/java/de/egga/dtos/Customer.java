package de.egga.dtos;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Builder;

import java.util.UUID;


/**
 * @author egga
 */

@Getter
@Setter
@EqualsAndHashCode
@Builder
public class Customer {

    private UUID id;

    private String name;

    private String email;

    public Customer() {
    }

    public Customer(final UUID id, final String name, final String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public void setEmail(final String email) {
        if (!email.contains("@")) {
            throw new IllegalArgumentException();
        }
        this.email = email;
    }
}
