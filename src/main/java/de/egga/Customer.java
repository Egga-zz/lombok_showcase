package de.egga;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Builder;

import java.util.UUID;


/**
 * @author egga
 */

@Builder
public class Customer {

    private UUID id;

    @Getter
    @Setter
    private String name;

    private String email;

}
