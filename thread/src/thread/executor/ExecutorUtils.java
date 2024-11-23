package thread.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

import static thread.util.MyLogger.log;

public abstract class ExecutorUtils {

    public static void printState(ExecutorService executorService) {
        if (executorService instanceof ThreadPoolExecutor poolExecutor) {
            int pool = poolExecutor.getPoolSize(); // 풀에서 관리되고있는 쓰레드 풀 갯수
            int active = poolExecutor.getActiveCount(); // 작동중인 쓰레드 풀 갯수
            int queuedTask = poolExecutor.getQueue().size(); // 큐에 대기중인 풀 갯수
            long completedTask = poolExecutor.getCompletedTaskCount(); // 완료 된 풀 갯수

            log("[pool=" + pool + ", active=" + active + ", queuedTasks=" + queuedTask + ", completedTask=" + completedTask + " ]");
        } else {
            log(executorService);
        }
    }

    public static void printState(ExecutorService executorService, String taskName) {
        if (executorService instanceof ThreadPoolExecutor poolExecutor) {
            int pool = poolExecutor.getPoolSize(); // 풀에서 관리되고있는 쓰레드 풀 갯수
            int active = poolExecutor.getActiveCount(); // 작동중인 쓰레드 풀 갯수
            int queuedTask = poolExecutor.getQueue().size(); // 큐에 대기중인 풀 갯수
            long completedTask = poolExecutor.getCompletedTaskCount(); // 완료 된 풀 갯수

            log(taskName + " -> [pool=" + pool + ", active=" + active + ", queuedTasks=" + queuedTask + ", completedTask=" + completedTask + " ]");
        } else {
            log(executorService);
        }
    }
}
