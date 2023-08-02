package ru.tasksSeminar3.task_1.T3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

import static java.lang.Math.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Block {
    private Integer edge;
    private String color;
    private String material;



    public static Double blockVolume(int edge){
        return Math.pow(edge, 3);
    }
}
