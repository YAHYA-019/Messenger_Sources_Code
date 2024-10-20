package com.facebook.rsys.log.gen;

/* loaded from: LogPersistenceProxy.class */
public abstract class LogPersistenceProxy {
    public abstract void deleteCallSummaryLog(String str);

    public abstract void writeCallSummaryLog(CallSummaryInfo callSummaryInfo, String str);
}
