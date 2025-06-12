package by.personal.paymentservice.repository;

import by.personal.paymentservice.model.entity.Refund;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RefundRepository extends JpaRepository<Refund, Long> {
}
