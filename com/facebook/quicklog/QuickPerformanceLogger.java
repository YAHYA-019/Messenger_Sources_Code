package com.facebook.quicklog;

import X.0uR;
import X.AnonymousClass045;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: QuickPerformanceLogger.class */
public interface QuickPerformanceLogger extends LightweightQuickPerformanceLogger {
    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    long currentMonotonicTimestamp();

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    long currentMonotonicTimestampNanos();

    void dropAllInstancesOfMarker(int i);

    void endAllInstancesOfMarker(int i, short s);

    void endAllMarkers(short s, boolean z);

    boolean isMarkerOn(int i);

    boolean isMarkerOn(int i, int i2);

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    boolean isMarkerOn(int i, int i2, boolean z);

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    boolean isMarkerOn(int i, boolean z);

    void markEvent(int i, String str, int i2);

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    EventBuilder markEventBuilder(int i, int i2, String str);

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    EventBuilder markEventBuilder(int i, String str);

    void markJoinRequestForE2E(int i, int i2, String str);

    void markJoinRequestForE2E(int i, int i2, String str, long j, TimeUnit timeUnit);

    void markJoinResponseForE2E(int i, int i2, String str);

    void markJoinResponseForE2E(int i, int i2, String str, long j, TimeUnit timeUnit);

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    void markerAnnotate(int i, int i2, String str, double d);

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    void markerAnnotate(int i, int i2, String str, int i3);

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    void markerAnnotate(int i, int i2, String str, long j);

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    void markerAnnotate(int i, int i2, String str, String str2);

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    void markerAnnotate(int i, int i2, String str, boolean z);

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    void markerAnnotate(int i, int i2, String str, double[] dArr);

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    void markerAnnotate(int i, int i2, String str, int[] iArr);

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    void markerAnnotate(int i, int i2, String str, long[] jArr);

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    void markerAnnotate(int i, int i2, String str, String[] strArr);

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    void markerAnnotate(int i, int i2, String str, boolean[] zArr);

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    void markerAnnotate(int i, String str, double d);

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    void markerAnnotate(int i, String str, int i2);

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    void markerAnnotate(int i, String str, long j);

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    void markerAnnotate(int i, String str, String str2);

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    void markerAnnotate(int i, String str, boolean z);

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    void markerAnnotate(int i, String str, double[] dArr);

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    void markerAnnotate(int i, String str, int[] iArr);

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    void markerAnnotate(int i, String str, long[] jArr);

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    void markerAnnotate(int i, String str, String[] strArr);

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    void markerAnnotate(int i, String str, boolean[] zArr);

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    void markerAnnotateCrucialForUserFlow(int i, int i2, String str, int i3);

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    void markerAnnotateCrucialForUserFlow(int i, int i2, String str, String str2);

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    void markerDrop(int i);

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    void markerDrop(int i, int i2);

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    void markerDropForUserFlow(int i, int i2);

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    void markerEnd(int i, int i2, short s);

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    void markerEnd(int i, int i2, short s, long j, TimeUnit timeUnit);

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    void markerEnd(int i, short s);

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    void markerEnd(int i, short s, long j, TimeUnit timeUnit);

    void markerEndAtPoint(int i, int i2, short s, String str);

    void markerEndAtPoint(int i, short s, String str);

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    void markerEndAtPointForUserFlow(int i, int i2, short s, String str);

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    void markerEndForUserFlow(int i, int i2, short s);

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    void markerEndForUserFlow(int i, String str, int i2, short s);

    void markerEndForUserFlow(int i, String str, int i2, short s, long j, TimeUnit timeUnit);

    void markerGenerate(int i, short s, long j, TimeUnit timeUnit);

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    void markerGenerateWithAnnotations(int i, short s, long j, TimeUnit timeUnit, Map map);

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    void markerLinkPivot(int i, int i2, String str);

    void markerPoint(int i, int i2, int i3, String str, AnonymousClass045 anonymousClass045, long j, TimeUnit timeUnit, int i4);

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    void markerPoint(int i, int i2, String str);

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    void markerPoint(int i, int i2, String str, long j, TimeUnit timeUnit);

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    void markerPoint(int i, int i2, String str, String str2);

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    void markerPoint(int i, int i2, String str, String str2, long j, TimeUnit timeUnit);

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    void markerPoint(int i, int i2, String str, String str2, long j, TimeUnit timeUnit, int i3);

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    void markerPoint(int i, String str);

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    void markerPoint(int i, String str, long j, TimeUnit timeUnit);

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    void markerPoint(int i, String str, String str2);

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    void markerPoint(int i, String str, String str2, long j, TimeUnit timeUnit);

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    void markerStart(int i);

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    void markerStart(int i, int i2);

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    void markerStart(int i, int i2, long j, TimeUnit timeUnit);

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    void markerStart(int i, int i2, long j, TimeUnit timeUnit, int i3);

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    void markerStart(int i, int i2, String str, String str2);

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    void markerStart(int i, int i2, String str, String str2, long j, TimeUnit timeUnit);

    void markerStart(int i, int i2, boolean z);

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    void markerStart(int i, String str, String str2);

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    void markerStart(int i, String str, String str2, long j, TimeUnit timeUnit);

    void markerStart(int i, boolean z);

    void markerStartForE2E(int i, int i2, String str);

    void markerStartForE2E(int i, int i2, String str, long j, TimeUnit timeUnit);

    void markerStartForE2E(int i, int i2, String str, boolean z, long j, TimeUnit timeUnit);

    void markerStartForLegacy(int i, int i2, long j, TimeUnit timeUnit, 0uR r6);

    void markerStartForLegacy(int i, long j, TimeUnit timeUnit, 0uR r5);

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    void markerStartForUserFlow(int i, int i2, long j, TimeUnit timeUnit, boolean z);

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    void markerStartForUserFlow(int i, int i2, String str, boolean z, long j);

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    void markerStartForUserFlow(int i, int i2, boolean z, long j);

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    void markerStartWithCancelPolicy(int i, boolean z, int i2, long j, TimeUnit timeUnit);

    void markerStartWithCancelPolicy(int i, boolean z, int i2, long j, TimeUnit timeUnit, String str);

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    void markerTag(int i, int i2, String str);

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    void markerTag(int i, String str);

    int sampleRateForMarker(int i);

    void setMissingConfigSampleRate(int i, int i2);

    void updateListenerMarkers();

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    MarkerEditor withMarker(int i);

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    MarkerEditor withMarker(int i, int i2);
}
