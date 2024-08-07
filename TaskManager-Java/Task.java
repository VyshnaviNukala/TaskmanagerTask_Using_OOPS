class Task {
    private int taskId;
    private String name;
    private String dueDate;
    private String priority;
    private String status;

    public Task(int taskId, String name, String dueDate, String priority) {
        this.taskId = taskId;
        this.name = name;
        this.dueDate = dueDate;
        this.priority = priority;
        this.status = "Pending"; // Default status
    }

    public int getTaskId() {
        return taskId;
    }

    public String getName() {
        return name;
    }

    public String getDueDate() {
        return dueDate;
    }

    public String getPriority() {
        return priority;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "[" + taskId + " " + name + " " + dueDate + " " + priority + " " + status + "]";
    }
}
