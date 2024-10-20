package com.facebook.graphservice.config;

import X.4SB;
import X.C4Rr;

/* loaded from: GraphQLConsistencyConfig.class */
public class GraphQLConsistencyConfig {
    public boolean disableGBNS;
    public boolean disableQueueHealthCheck;
    public boolean enableBlackboxConsistencyService;
    public boolean enableGlobalFullConsistency;
    public int minFlushesToSkip;
    public int prunePersistentStoreStrategy;
    public int queueHealthCheckInterval;
    public int writeBufferColdAge;
    public int writeBufferMandatoryFlushAge;

    public GraphQLConsistencyConfig() {
    }

    public /* synthetic */ GraphQLConsistencyConfig(C4Rr c4Rr) {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.4SB, java.lang.Object] */
    public static 4SB Builder() {
        return new Object();
    }

    public boolean disableGBNS() {
        return this.disableGBNS;
    }

    public boolean disableQueueHealthCheck() {
        return this.disableQueueHealthCheck;
    }

    public boolean enableGlobalFullConsistency() {
        return this.enableGlobalFullConsistency;
    }

    public int getMinFlushesToSkip() {
        return this.minFlushesToSkip;
    }

    public int getWriteBufferColdAge() {
        return this.writeBufferColdAge;
    }

    public int getWriteBufferMandatoryFlushAge() {
        return this.writeBufferMandatoryFlushAge;
    }

    public boolean isEnableBlackboxConsistencyService() {
        return this.enableBlackboxConsistencyService;
    }

    public int prunePersistentStoreStrategy() {
        return this.prunePersistentStoreStrategy;
    }

    public int queueHealthCheckInterval() {
        return this.queueHealthCheckInterval;
    }
}
