package in.jt.rubicon.order.domain;

import in.jt.rubicon.order.db.OrderEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OrderMapper {
    OrderEntity toEntity(Order Order);

    Order toDomain(OrderEntity OrderEntity);

    List<OrderEntity> toEntity(List<Order> Orders);

    List<Order> toDomain(List<OrderEntity> OrderEntities);
}
