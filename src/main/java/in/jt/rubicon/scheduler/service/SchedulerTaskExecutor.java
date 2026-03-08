package in.jt.rubicon.scheduler.service;

import in.jt.rubicon.order.OrderProcessor;
import in.jt.rubicon.scheduler.ScheduledTask;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.ScheduledFuture;

@Service
public class SchedulerTaskExecutor {

    private final ThreadPoolTaskScheduler taskScheduler = new ThreadPoolTaskScheduler();
    private final OrderProcessor orderProcessor;
    private ScheduledFuture<?> scheduledTask;

    public SchedulerTaskExecutor(OrderProcessor orderProcessor) {
        this.orderProcessor = orderProcessor;
        taskScheduler.initialize();
    }

    public void restartTaskExecutor(List<ScheduledTask> updatedTasks) {
        //restartScheduledTask(newCron);
    }

    private void restartScheduledTask(String cronExpression) {
        if (scheduledTask != null) {
            scheduledTask.cancel(false);
        }
        scheduledTask = taskScheduler.schedule(orderProcessor::processPendingOrders, new CronTrigger(cronExpression));
    }
}
