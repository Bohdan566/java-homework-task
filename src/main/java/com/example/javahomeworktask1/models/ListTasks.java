package com.example.javahomeworktask1.models;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class ListTasks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(unique = true)
    private String title;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "listTasks")
    private List<Task> taskList = new ArrayList();

    @Override
    public String toString() {
        return "ListTasks{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", taskList=" + taskList +
                '}';
    }
}
