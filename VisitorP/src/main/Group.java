package main;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class Group implements Task {
    @Getter
    private List<Task> tasks = new ArrayList<>();
    private String name = "";

    public Group(String name) {
        this.name = name;
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    @Override
    public void accept(Visitor visitor) {
        System.out.println("Visiting Group -> " + name);
        for (Task task : tasks) {
            task.accept(visitor);
        }
    }

    @Override
    public String toString() {
        return "Group name -> " + name;
    }
}