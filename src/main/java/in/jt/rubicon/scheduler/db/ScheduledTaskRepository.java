package in.jt.rubicon.scheduler.db;

import in.jt.rubicon.scheduler.db.ScheduledTaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ScheduledTaskRepository extends JpaRepository<ScheduledTaskEntity, Long> {

    Optional<ScheduledTaskEntity> findByTaskName(String taskName);

}
