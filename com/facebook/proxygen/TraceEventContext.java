package com.facebook.proxygen;

import java.util.Random;

/* loaded from: TraceEventContext.class */
public class TraceEventContext {
    public static final Random RAND = new Random();
    public TraceEventObserver[] mObservers;
    public int mParentID;
    public final SamplePolicy mSamplePolicy;

    public TraceEventContext(SamplePolicy samplePolicy) {
        this(new TraceEventObserver[0], samplePolicy);
    }

    public TraceEventContext(TraceEventObserver[] traceEventObserverArr) {
        this(traceEventObserverArr, new SamplePolicy() { // from class: com.facebook.proxygen.TraceEventContext.1
            @Override // com.facebook.proxygen.SamplePolicy
            public boolean isSampled() {
                return true;
            }
        });
    }

    public TraceEventContext(TraceEventObserver[] traceEventObserverArr, SamplePolicy samplePolicy) {
        this.mParentID = RAND.nextInt((-1) >>> 1);
        this.mObservers = traceEventObserverArr;
        this.mSamplePolicy = samplePolicy;
    }

    public int getParentID() {
        return this.mParentID;
    }

    public void informAllObservers(TraceEvent[] traceEventArr) {
        TraceEventObserver[] traceEventObserverArr = this.mObservers;
        int length = traceEventObserverArr.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return;
            }
            traceEventObserverArr[i2].traceEventAvailable(traceEventArr);
            i = i2 + 1;
        }
    }

    public boolean needPublishEvent() {
        return this.mSamplePolicy.isSampled();
    }
}
