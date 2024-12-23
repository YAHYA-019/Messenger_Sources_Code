package com.facebook.proxygen;

/* loaded from: RequestStatsObserver.class */
public class RequestStatsObserver implements TraceEventObserver {
    public TraceEvent[] mEvents;

    public RequestStats getRequestStats() {
        TraceEvent[] traceEventArr = this.mEvents;
        if (traceEventArr == null || traceEventArr.length == 0) {
            return null;
        }
        return new RequestStats(traceEventArr);
    }

    @Override // com.facebook.proxygen.TraceEventObserver
    public void traceEventAvailable(TraceEvent[] traceEventArr) {
        this.mEvents = traceEventArr;
    }
}
