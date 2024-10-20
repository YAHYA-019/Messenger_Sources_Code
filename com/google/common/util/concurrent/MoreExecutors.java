package com.google.common.util.concurrent;

import X.1EC;
import X.1ED;
import X.1JU;
import X.3Cz;
import X.5VA;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: MoreExecutors.class */
public final class MoreExecutors {
    public static Executor directExecutor() {
        return 1JU.A01;
    }

    public static 1EC listeningDecorator(ScheduledExecutorService scheduledExecutorService) {
        return scheduledExecutorService instanceof 1EC ? (1EC) scheduledExecutorService : new 3Cz(scheduledExecutorService);
    }

    public static 1ED listeningDecorator(ExecutorService executorService) {
        return executorService instanceof 1ED ? (1ED) executorService : executorService instanceof ScheduledExecutorService ? new 3Cz((ScheduledExecutorService) executorService) : new 5VA(executorService);
    }
}
