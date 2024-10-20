package com.facebook.proxygen;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: LigerSamplePolicy.class */
public final class LigerSamplePolicy implements SamplePolicy {
    public static final double CERT_DATA_SAMPLE_RATE = 2.0E-4d;
    public static final long CERT_DATA_SAMPLE_WEIGHT = 5000;
    public static final Companion Companion = new Object();
    public final int cellTowerWeight;
    public final int flowTimeWeight;
    public final boolean isCellTowerSampled;
    public final boolean isCertSampled;
    public final boolean isFlowTimeSampled;
    public final boolean isMhrFbcSampled;
    public final int mhrFbcWeight;
    public final boolean printTraceEvents;

    /* loaded from: LigerSamplePolicy$Companion.class */
    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0093, code lost:
    
        if (java.lang.Math.random() >= (1.0d / r304)) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0031, code lost:
    
        if (java.lang.Math.random() >= (1.0d / r302)) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0062, code lost:
    
        if (java.lang.Math.random() >= (1.0d / r303)) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public LigerSamplePolicy(int r302, int r303, int r304, boolean r305) {
        /*
            Method dump skipped, instructions count: 197
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.proxygen.LigerSamplePolicy.<init>(int, int, int, boolean):void");
    }

    public final int getCellTowerWeight() {
        return this.cellTowerWeight;
    }

    public final int getFlowTimeWeight() {
        return this.flowTimeWeight;
    }

    public final int getMhrFbcWeight() {
        return this.mhrFbcWeight;
    }

    public final boolean isCellTowerSampled() {
        return this.isCellTowerSampled;
    }

    public final boolean isCertSampled() {
        return this.isCertSampled;
    }

    public final boolean isFlowTimeSampled() {
        return this.isFlowTimeSampled;
    }

    public final boolean isMhrFbcSampled() {
        return this.isMhrFbcSampled;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (r301.isMhrFbcSampled != false) goto L10;
     */
    @Override // com.facebook.proxygen.SamplePolicy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean isSampled() {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0.isFlowTimeSampled
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L26
            r0 = r301
            boolean r0 = r0.printTraceEvents
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L26
            r0 = r301
            boolean r0 = r0.isCellTowerSampled
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L26
            r0 = r301
            boolean r0 = r0.isMhrFbcSampled
            r303 = r0
            r0 = 0
            r302 = r0
            r0 = r303
            if (r0 == 0) goto L28
        L26:
            r0 = 1
            r302 = r0
        L28:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.proxygen.LigerSamplePolicy.isSampled():boolean");
    }

    public final boolean shouldPrintTraceEvents() {
        return this.printTraceEvents;
    }
}
