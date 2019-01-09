package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPINGTASK = "SHOPPINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String DRIVINGTASK = "DRIVINGTASK";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPINGTASK:
                return new ShoppingTask("Shopping Task Name","fruits",20.0);
            case PAINTINGTASK:
                return new PaintingTask("Painting Task Name","red","house");
            case DRIVINGTASK:
                return new DrivingTask("Driving Task Name","train station","premium");
            default:
                return null;
        }
    }
}