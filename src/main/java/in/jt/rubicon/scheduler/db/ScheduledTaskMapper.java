package in.jt.rubicon.scheduler.db;

import in.jt.rubicon.scheduler.ScheduledTask;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ScheduledTaskMapper {

    ScheduledTaskEntity toEntity(ScheduledTask scheduledTask);

    ScheduledTask toDomain(ScheduledTaskEntity scheduledTaskEntity);

    List<ScheduledTaskEntity> toEntity(List<ScheduledTask> scheduledTasks);

    List<ScheduledTask> toDomain(List<ScheduledTaskEntity> scheduledTaskEntities);
}
