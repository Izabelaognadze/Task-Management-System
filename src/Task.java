public class Task {
    private String name;
    private String taskDefinition;
    private String createdUserName;

    public Task(String name, String taskDefinition, String createdUserName){
        this.name = name;
        this.taskDefinition = taskDefinition;
        this.createdUserName = createdUserName;
    }
}