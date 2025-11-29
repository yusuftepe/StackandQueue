package taskscheduler;

public class Main {
	public static void main(String[] args) {
		TaskScheduler scheduler = new TaskScheduler();
        
        scheduler.addTask("DOWNLOAD THE FILE");
        scheduler.addTask("BACKUP THE DATABASE");
        scheduler.addTask("CREATE THE REPORT");
        
        System.out.println(scheduler.status());
        scheduler.processNextTask();
        scheduler.processNextTask();

        scheduler.addTask("SENDING THE E-MAIL");
        
        System.out.println(scheduler.status());
        
        scheduler.processNextTask();
        scheduler.processNextTask();
        scheduler.processNextTask();
	}
}
