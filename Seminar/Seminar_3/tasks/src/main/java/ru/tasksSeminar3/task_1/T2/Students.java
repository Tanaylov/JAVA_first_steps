package ru.tasksSeminar3.task_1.T2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Students {
    private String name;
    private Integer groupNum;
    private Integer grant;
    private Integer threeSubScore;
}
