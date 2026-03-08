package in.jt.rubicon.order;

import in.jt.rubicon.order.domain.Order;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
@Slf4j
public class OrderProcessor {
    private final OrderService orderService;

    public void processPendingOrders() {
       log.info("Processing Orders");
        List<Order> orders = orderService.findPendingOrders();

        List<Order> processedOrders = orders.stream()
                .map(this::processOrder)
                .toList();
        orderService.updateOrders(processedOrders);
        log.info("Processed pending orders "+ orders.size());
    }

    private Order processOrder(Order order){
        order.markAsCompleted();
        return order;
    }
}
