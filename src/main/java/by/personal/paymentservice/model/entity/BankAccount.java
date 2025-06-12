package by.personal.paymentservice.model.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BankAccount extends BaseEntity {
    private String number;
    private BigDecimal balance;
    private Long customerId;
    private String currency;
}
