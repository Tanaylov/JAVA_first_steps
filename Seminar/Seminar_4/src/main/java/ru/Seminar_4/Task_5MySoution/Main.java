package ru.Seminar_4.Task_5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String path = "/desk/../"; // Output: /desk/copy/...;
        String[] pathS = path.split("/");
        int countDoublePoint = 0;
        for (String el : pathS) {
            if (el.equals("..")) countDoublePoint += 2;
            else if (el.equals("")) countDoublePoint++;
        }
        String[] pathSNew = new String[pathS.length - countDoublePoint];
        int index = 0;
        for (int i = 0; i < pathS.length; i++) {
            if (i == pathS.length - 1 && !pathS[i].equals("..")) pathSNew[index] = pathS[i];
            else if (pathS[i + 1].equals("..")) i++;
            else if (!pathS[i].equals("")){
                pathSNew[index] = pathS[i];
                index++;
            }
        }
        System.out.println("countDoublePoint = " + countDoublePoint);
        System.out.println("pathS[2] = " + pathS[2]);
        System.out.println("pathS = " + Arrays.asList(pathS));
        System.out.println("pathSNew = " + Arrays.asList(pathSNew));
        String pathNew = "";
        for (String el : pathSNew) {
            pathNew += "/";
            pathNew += el;
        }
        System.out.println("pathNew = " + pathNew);
    }
}
