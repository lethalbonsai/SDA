package com.xhak.demo.dto.cartDtos;

import com.xhak.demo.entities.OrderItemEntity;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
public class ResponseCartDTO {
    private Long id;
    private Long userId;
    @ArraySchema(
            arraySchema = @Schema(
                    description = "List of order items",
                    example = "[{\"id\":1,\"productId\":1,\"quantity\":2,\"price\":100.0,\"orderId\":1}]"
            ),
            schema = @Schema(
                    description = "Order items list",
                    implementation = OrderItemEntity.class
            )
    )
    private List<OrderItemEntity> orderItemsList;
}
