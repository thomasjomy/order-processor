package in.jt.rubicon.scheduler.web;

import in.jt.rubicon.scheduler.ScheduledTask;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SchedulerTaskDTOMapper {
    ScheduledTask toDomain(SchedulerTaskUpdateRequest schedulerTaskUpdateRequestRequest);
}
