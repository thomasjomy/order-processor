package in.jt.rubicon.scheduler.web;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class SchedulerTaskUpdateRequest {
    private String taskName;
    private String cronExpression;
}
