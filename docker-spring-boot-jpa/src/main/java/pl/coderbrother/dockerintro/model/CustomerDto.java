package pl.coderbrother.dockerintro.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDto {

    private int id;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String countryCode;
}
