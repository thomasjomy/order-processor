package in.jt.rubicon.order;

import in.jt.rubicon.order.db.OrderEntity;
import in.jt.rubicon.order.db.OrderRepository;
import in.jt.rubicon.order.domain.Order;
import in.jt.rubicon.order.domain.OrderMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;
    private final OrderMapper orderMapper;

    public Order createOrder(Order order) {
        OrderEntity savedEntity = orderRepository.save(orderMapper.toEntity(order));
        return orderMapper.toDomain(savedEntity);
    }

    public List<Order> getAllOrders() {
        List<OrderEntity> orderEntities = orderRepository.findAll();
        return orderMapper.toDomain(orderEntities);
    }

    public List<Order> findPendingOrders() {
        List<OrderEntity> pendingOrders = orderRepository.findByStatus("PENDING");
        return orderMapper.toDomain(pendingOrders);
    }

    public void updateOrders(List<Order> processedOrders) {
        List<OrderEntity> orderEntities = orderMapper.toEntity(processedOrders);
        orderRepository.saveAll(orderEntities);
    }
}
