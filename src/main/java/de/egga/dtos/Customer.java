package de.egga.dtos;

import lombok.AllArgsConstructor;
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
@AllArgsConstructor
public class Customer {

    private UUID id;

    private String name;

    private String email;

}
