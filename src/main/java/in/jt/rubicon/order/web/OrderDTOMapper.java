package in.jt.rubicon.order.web;

import in.jt.rubicon.order.domain.Order;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderDTOMapper {

    Order toDomain(OrderRequest orderRequest);

}
