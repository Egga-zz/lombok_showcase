package de.egga.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Builder;

import java.util.UUID;


/**
 * @author egga
 */

@Data
@Builder
@NoArgsConstructor
public class Customer {

    private UUID id;

    private String name;

    private String email;

    public Customer (final UUID id, final String name, final String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public void setEmail (final String email) {
        if (!email.contains("@")) {
            throw new IllegalArgumentException();
        }
        this.email = email;
    }
}
