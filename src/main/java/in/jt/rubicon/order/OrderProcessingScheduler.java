package in.jt.rubicon.order;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RequiredArgsConstructor
public class OrderProcessingScheduler {
    private final OrderProcessor orderProcessor;

    @Scheduled(fixedRate = 1000)
    public void processPendingOrders() {
        log.info("Scheduling pending orders for processing");
        orderProcessor.processPendingOrders();
    }
}
