package by.personal.paymentservice.repository;

import by.personal.paymentservice.model.entity.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount, Long> {
}
