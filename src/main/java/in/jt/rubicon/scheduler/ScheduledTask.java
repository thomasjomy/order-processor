package in.jt.rubicon.scheduler;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@AllArgsConstructor
@ToString
public class ScheduledTask {
    private Long id;
    private String taskName;
    private String cronExpression;
}
