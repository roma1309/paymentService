package by.personal.paymentservice.model.entity;

import by.personal.paymentservice.model.enums.RefundStatus;
import by.personal.paymentservice.model.enums.convert.RefundStatusConverter;
import jakarta.persistence.Convert;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Refund {
    private BigDecimal refundAmount;
    private String reason;

    @Convert(converter = RefundStatusConverter.class)
    private RefundStatus status;

    @ManyToOne()
    @JoinColumn(name = "paymentTransactionId", referencedColumnName = "id")
    private PaymentTransaction paymentTransaction;
}
