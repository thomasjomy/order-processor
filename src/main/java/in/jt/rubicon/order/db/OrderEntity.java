package in.jt.rubicon.order.db;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "ORDER")
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String customerEmail;
    private String status;
    private LocalDateTime createdAt;
}
