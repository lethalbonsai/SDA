package com.xhak.demo.dto.categoryDtos;

import com.xhak.demo.dto.productdtos.CreateProductDTO;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CreateCategoryDTO {
    @NotBlank(message = "Name is required")
    @Size(max = 100, message = "Name cannot be longer than 100 characters")
    @Schema(example = "Electronics")
    private String name;
    @NotBlank(message = "Product list cant be empty")
    @ArraySchema(
            arraySchema = @Schema(
                    description = "List of products",
                    example = "[{\"name\":\"Laptop\",\"price\":1000.0,\"description\":\"A laptop\",\"category\":\"Electronics\"}]"
            ),
            schema = @Schema(
                    description = "Product",
                    implementation = CreateProductDTO.class
            )
    )
    private List<CreateProductDTO> productDTOList;

}
