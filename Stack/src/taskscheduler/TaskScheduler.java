package taskscheduler;

public class TaskScheduler {

	private MyQueue<String> taskQueue;
	
	public TaskScheduler() {
		taskQueue = new MyQueue<>();
	}
	
	public void addTask (String taskName) {
		taskQueue.enqueue(taskName);
		System.out.println("THE TASK ADDED: " + taskName);
	}
	
	public String processNextTask() {
        if (taskQueue.isEmpty()) {
            System.out.println("NO TASK TO PROCESS");
            return null;
        }
        String nextTask = taskQueue.dequeue();
        System.out.println("THE TASK IS PROCESSİNG: " + nextTask);
        return nextTask;
	}
	
	public String status() {
        if (taskQueue.isEmpty()) {
             return "NO TASK WAITING IN THE QUEUE";
        }
        return "NUMBER OF TASK WAITING IN THE QUEUE: " + taskQueue.size();
    }
}
