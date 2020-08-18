package org.ecuadorjug.customersapireactive.data.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @Id
    private Integer id;
    private String name;
    private Integer score;
}
