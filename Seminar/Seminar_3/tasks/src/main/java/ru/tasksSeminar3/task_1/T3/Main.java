package ru.tasksSeminar3.task_1.T3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Block block1 = new Block();
//        block1.setEdge(7);
//        block1.setColor("yellow");
//        block1.setMaterial("wood");
//        Block block2 = new Block(9, "black", "iron");
//        Block block3 = new Block(3, "green", "iron");
//        Block block4 = new Block(11, "black", "cardboard");
//        Block block5 = new Block(3, "yellow", "glass");
//        List<Block> blockList = new ArrayList<>(Arrays.asList(
//                block1, block2, block3, block4, block5
//        ));
//        double block1Volume = Block.blockVolume(block1.getEdge());
//        System.out.printf("Block 1 has volume: " + block1Volume);

        List<Block> blocks = new ArrayList<>(Arrays.asList(
                new Block(7, "yellow", "wood"),
                new Block(9, "black", "iron"),
                new Block(3, "green", "iron"),
                new Block(11, "black", "cardboard"),
                new Block(3, "yellow", "glass"),
                new Block(3, "yellow", "wood")
        ));
        int kWood = 0;
        for (Block block : blocks) {
            if (block.getMaterial().equals("wood") && block.getEdge() == 3) kWood++;
        }
        System.out.println("Count wooden block(s): " + kWood);
        int cYellow = 0;
        double cBlockVolume = 0;
        for (Block block : blocks) {
            if (block.getColor().equals("yellow")){
                cYellow++;
                cBlockVolume += Math.pow(block.getEdge(), 3);
            }
        }
        System.out.printf("Count of yellow block: %d and volume: %f", cYellow, cBlockVolume);
    }
}
