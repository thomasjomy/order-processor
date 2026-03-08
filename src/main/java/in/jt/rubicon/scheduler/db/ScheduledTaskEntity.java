package in.jt.rubicon.scheduler.db;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "scheduled_task")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ScheduledTaskEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String taskName;
    private String cronExpression;
}
