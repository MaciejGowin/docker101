package pl.coderbrother.dockerintro;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pl.coderbrother.dockerintro.model.Customer;
import pl.coderbrother.dockerintro.model.CustomerDto;
import pl.coderbrother.dockerintro.model.CustomerIdDto;
import pl.coderbrother.dockerintro.repository.CustomerCrudRepository;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@RestController
public class ApplicationController {

    private final CustomerCrudRepository customerCrudRepository;

    @GetMapping("/customers")
    public List<CustomerDto> test() {
        return customerCrudRepository.findAll()
                .stream()
                .map(customer -> CustomerDto.builder()
                        .id(customer.getId())
                        .firstName(customer.getFirstName())
                        .lastName(customer.getLastName())
                        .dateOfBirth(customer.getDateOfBirth())
                        .countryCode(customer.getCountryCode())
                        .build())
                .collect(Collectors.toList());
    }

    @PostMapping("/customers")
    public CustomerIdDto addCustomer(@RequestBody CustomerDto customerDto) {
        Customer customer = customerCrudRepository.save(Customer.builder()
                .firstName(customerDto.getFirstName())
                .lastName(customerDto.getLastName())
                .dateOfBirth(customerDto.getDateOfBirth())
                .countryCode(customerDto.getCountryCode())
                .build());

        return CustomerIdDto.builder()
                .id(customer.getId())
                .build();
    }
}
