package org.ecuadorjug.customersapireactive.data.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Team {
    @Id
    private String id;
    private String name;
    private List<Customer> customers = new ArrayList<>();
}