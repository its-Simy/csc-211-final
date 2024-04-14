package org.example.csc211final;

enum direction{
    UP,
    IDLE,
    DOWN
}
public abstract class Elevator {
    protected int elevatorID;
    protected String elevatorType;
    protected int maximumCapacity;
    protected int elevatorRequestPercentage;
    public abstract boolean move(direction _direction);
}
