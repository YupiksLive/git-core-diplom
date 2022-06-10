package ru.netology.javacore;

public class ServerOperation {
    private String type;
    private String task;

    public ServerOperation(String type,String task){
        this.type = type;
        this.task = task;
    }
    public void setType(String type){
        this.type = type;
    }
    public void setTask(String task){
        this.task = task;
    }
    public String getType(){
        return type;
    }
    public String getTask(){
        return task;
    }
}
