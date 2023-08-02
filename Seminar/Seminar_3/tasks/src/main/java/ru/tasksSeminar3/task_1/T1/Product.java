package ru.tasksSeminar3.task_1.T1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private String name;
    private String countryFrom;
    private Integer quantity;
}
