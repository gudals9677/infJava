package thread.executor.poolsize;

import thread.executor.RunnableTask;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static thread.executor.ExecutorUtils.printState;
import static thread.util.MyLogger.log;
import static thread.util.ThreadUtils.sleep;

public class PoolSizeMainV3 {

    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool();

        log("pool 생성");
        printState(es);

        for (int i = 1; i <= 4; i++) {
            String taskName = "task" + i;
            es.execute(new RunnableTask(taskName));
            printState(es, taskName);
        }

        sleep(3000);
        log("== 작업 수행 완료 ==");
        printState(es);

        es.close();
        log("== shutdown 완료 ==");

    }
}
