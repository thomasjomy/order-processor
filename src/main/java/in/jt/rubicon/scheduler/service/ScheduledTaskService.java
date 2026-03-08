package in.jt.rubicon.scheduler.service;

import in.jt.rubicon.scheduler.ScheduledTask;
import in.jt.rubicon.scheduler.db.ScheduledTaskEntity;
import in.jt.rubicon.scheduler.db.ScheduledTaskMapper;
import in.jt.rubicon.scheduler.db.ScheduledTaskRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor
public class ScheduledTaskService {
    private final ScheduledTaskRepository scheduledTaskRepository;
    private final ScheduledTaskMapper scheduledTaskMapper;
    private final SchedulerTaskExecutor schedulerTaskExecutor;

    public Optional<ScheduledTask> findTask(String taskName){
        return scheduledTaskRepository.findByTaskName(taskName)
                .map(scheduledTaskMapper::toDomain);
    }

    public void updateTaskSchedule(ScheduledTask scheduledTask){
        ScheduledTaskEntity scheduledTaskEntity = scheduledTaskMapper.toEntity(scheduledTask);
        scheduledTaskRepository.save(scheduledTaskEntity);
        schedulerTaskExecutor.rea
    }
}
