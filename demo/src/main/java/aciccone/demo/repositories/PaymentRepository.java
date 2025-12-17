package aciccone.demo.repositories;

import aciccone.demo.entities.Payment;
import aciccone.demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface PaymentRepository  extends JpaRepository<Payment, Long> {
    List<Payment> findByUser(User user);
    List<Payment> findByUserAndStatus(User user, String status);

}
