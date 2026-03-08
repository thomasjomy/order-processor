package in.jt.rubicon.order.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@AllArgsConstructor
@ToString
public class Order {
    private String customerEmail;
    private OrderStatus orderStatus;

    public void markAsCompleted(){
        this.orderStatus = OrderStatus.COMPLETED;
    }
}
