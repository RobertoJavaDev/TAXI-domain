package pl.robertojavadev.taxidomain.driver;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "drivers")
@Builder
class Driver {

    @Id
    @GeneratedValue
    private UUID id;

    private String firstName;

    private String lastName;

    private String driverLicense;

    private String email;

    private String password;

    private Status status;

    private Instant createdAt = Instant.now();
}
