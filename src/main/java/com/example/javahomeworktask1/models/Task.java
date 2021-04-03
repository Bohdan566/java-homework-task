package com.example.javahomeworktask1.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javafx.scene.chart.XYChart;
import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String body;
    private int finaldata;
    @ManyToOne(cascade = CascadeType.DETACH, fetch = FetchType.LAZY)
    @JsonIgnore
    private ListTasks listTasks;

    public Task(String title, String body, int finaldata) {
        this.title = title;
        this.body = body;
        this.finaldata = finaldata;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", finaldata=" + finaldata +
                ", listTasks=" + listTasks +
                '}';
    }
}
