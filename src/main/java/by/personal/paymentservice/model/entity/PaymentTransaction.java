package by.personal.paymentservice.model.entity;

import by.personal.paymentservice.model.enums.PaymentTransactionStatus;
import by.personal.paymentservice.model.enums.convert.PaymentTransactionStatusConverter;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Convert;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PaymentTransaction extends BaseEntity {

    private BigDecimal amount;
    private String description;

    @Convert(converter = PaymentTransactionStatusConverter.class)
    private PaymentTransactionStatus status;
    @ManyToOne()
    @JoinColumn(name = "sourceBankAccountId")
    private BankAccount sourceBankAccount;

    @ManyToOne()
    @JoinColumn(name = "destinationBankAccountId")
    private BankAccount destinationBankAccount;

    @OneToMany( mappedBy = "paymentTransaction", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Refund> refunds;
}
