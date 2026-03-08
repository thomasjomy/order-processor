package in.jt.rubicon.scheduler.web;

import in.jt.rubicon.scheduler.ScheduledTask;
import in.jt.rubicon.scheduler.service.ScheduledTaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/schedule")
public class ScheduledTaskController {
    private final ScheduledTaskService scheduledTaskService;
    private final SchedulerTaskDTOMapper schedulerTaskDTOMapper;

    @PostMapping("/update")
    public ResponseEntity<String> updateTaskSchedule(@RequestBody SchedulerTaskUpdateRequest schedulerTaskUpdateRequest) {
        ScheduledTask scheduledTask = schedulerTaskDTOMapper.toDomain(schedulerTaskUpdateRequest);
        scheduledTaskService.updateTaskSchedule(scheduledTask);
        return ResponseEntity.ok("Scheduled Task updated successfully!");
    }
}
