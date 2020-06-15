package com.thoughtworks;

public class MarsRover {
    public int x;
    public int y;
    public String[] dir;
    public String position;

    public MarsRover(int x, int y, String[] dir) {
        this.x = x;
        this.y = y;
        this.dir = dir;
        this.position = "(" + x + "," + y + ")" + dir;
    }

    public MarsRover(String[] commands) {
        parseCommands(commands);
    }

    private String parseCommands(String[] commands) {
        this.position = commands[0];
        return position;
    }

    public String move(String[] commands) {
        for (int i = 0; i < commands.length; i++) {
            if (commands[i] == "N") {
                y += 1;
            } else if (commands[i] == "S") {
                y -= 1;
            } else if (commands[i] == "E") {
                x += 1;
            } else if (commands[i] == "W") {
                x -= 1;
            }
        }
        return null;
    }
}
