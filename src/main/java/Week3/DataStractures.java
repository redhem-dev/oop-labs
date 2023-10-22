package Week3;

import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import javax.naming.CompoundName;
import java.util.stream.Collectors;
import java.util.Optional;

public class DataStractures {


    public class DataStructures {
        private List<TaskItem> tasks = new ArrayList<>();

        public DataStructures() {
            tasks = Arrays.asList(
                    new TaskItem(1,"Push lab code to the github", Status.TO_DO),
                    new TaskItem(2,"Prepare for the quiz", Status.IN_PROGRESS),
                    new TaskItem(3,"Go over tasks from lab2", Status.COMPLETED),
                    new TaskItem(4,"Cancel", Status.CANCELLED));



        }

        public List<TaskItem> getAll(){
            return this.tasks;


        }


        public Optional<TaskItem> getByStatus(Status status) {
            return tasks
                    .stream()
                    .filter(tasks -> {
                        return tasks.getStatus().equals(status);
                    }).findFirst();
        }

        public List<TaskItem> findAgeGreaterThan(){
            return tasks
                    .stream()
                    .filter(tasks->tasks.getTaskId()>=(2))
                    .toList();
        }

        public void printDescription(){
            for (TaskItem t: tasks){
                System.out.println(t.getTaskDescription());

            }
        }






    }
}
