package X;

import com.facebook.quicklog.EventBuilder;
import com.facebook.quicklog.MarkerEditor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3bb, reason: invalid class name */
/* loaded from: 3bb.class */
public final class C3bb implements 1Jo {
    public final int[] A00;
    public final 1Jo A01;

    public C3bb(1Jo r302, int[] iArr) {
        this.A01 = r302;
        this.A00 = iArr;
    }

    public static boolean A00(C3bb c3bb, int i) {
        return 02L.A0D(c3bb.A00, i);
    }

    public void Bcm(int i, int i2, String str, int i3) {
        11T.A0F(str, 2);
        if (A00(this, i)) {
            this.A01.Bcm(i, 0, str, i3);
        }
    }

    public void Bcn(int i, int i2, String str, String str2) {
        1BK.A1J(str, 2, str2);
        if (A00(this, i)) {
            this.A01.Bcn(i, 0, str, str2);
        }
    }

    public void Bcq(int i, int i2, short s, long j, TimeUnit timeUnit) {
        11T.A0F(timeUnit, 4);
        if (A00(this, i)) {
            this.A01.Bcq(i, 0, s, 0L, timeUnit);
        }
    }

    public void Bcx(int i, int i2, long j, TimeUnit timeUnit, int i3) {
        11T.A0F(timeUnit, 3);
        if (A00(this, i)) {
            this.A01.Bcx(i, 0, 0L, timeUnit, i3);
        }
    }

    public void D51() {
        this.A01.D51();
    }

    public void D52() {
        this.A01.D52();
    }

    public void D53() {
        this.A01.D53();
    }

    public long currentMonotonicTimestamp() {
        return this.A01.currentMonotonicTimestamp();
    }

    public long currentMonotonicTimestampNanos() {
        return this.A01.currentMonotonicTimestampNanos();
    }

    public void dropAllInstancesOfMarker(int i) {
        if (A00(this, i)) {
            this.A01.dropAllInstancesOfMarker(i);
        }
    }

    public void endAllInstancesOfMarker(int i, short s) {
        if (A00(this, i)) {
            this.A01.endAllInstancesOfMarker(i, s);
        }
    }

    public void endAllMarkers(short s, boolean z) {
        this.A01.endAllMarkers(s, z);
    }

    public boolean isMarkerOn(int i) {
        if (A00(this, i)) {
            return this.A01.isMarkerOn(i);
        }
        return false;
    }

    public boolean isMarkerOn(int i, int i2) {
        if (A00(this, i)) {
            return this.A01.isMarkerOn(i, i2);
        }
        return false;
    }

    public boolean isMarkerOn(int i, int i2, boolean z) {
        if (A00(this, i)) {
            return this.A01.isMarkerOn(i, i2, z);
        }
        return false;
    }

    public boolean isMarkerOn(int i, boolean z) {
        if (A00(this, i)) {
            return this.A01.isMarkerOn(i, z);
        }
        return false;
    }

    public void markEvent(int i, String str, int i2) {
        if (A00(this, i)) {
            this.A01.markEvent(i, str, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.facebook.quicklog.EventBuilder] */
    public EventBuilder markEventBuilder(int i, int i2, String str) {
        C04C markEventBuilder = A00(this, i) ? this.A01.markEventBuilder(i, i2, str) : C04C.A00;
        11T.A0D(markEventBuilder);
        return markEventBuilder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.facebook.quicklog.EventBuilder] */
    public EventBuilder markEventBuilder(int i, String str) {
        C04C markEventBuilder = A00(this, i) ? this.A01.markEventBuilder(i, str) : C04C.A00;
        11T.A0D(markEventBuilder);
        return markEventBuilder;
    }

    public void markJoinRequestForE2E(int i, int i2, String str) {
        if (A00(this, i)) {
            this.A01.markJoinRequestForE2E(i, i2, str);
        }
    }

    public void markJoinRequestForE2E(int i, int i2, String str, long j, TimeUnit timeUnit) {
        if (A00(this, i)) {
            this.A01.markJoinRequestForE2E(i, i2, str, j, timeUnit);
        }
    }

    public void markJoinResponseForE2E(int i, int i2, String str) {
        if (A00(this, i)) {
            this.A01.markJoinResponseForE2E(i, i2, str);
        }
    }

    public void markJoinResponseForE2E(int i, int i2, String str, long j, TimeUnit timeUnit) {
        if (A00(this, i)) {
            this.A01.markJoinResponseForE2E(i, i2, str, j, timeUnit);
        }
    }

    public void markerAnnotate(int i, int i2, String str, double d) {
        if (A00(this, i)) {
            this.A01.markerAnnotate(i, i2, str, d);
        }
    }

    public void markerAnnotate(int i, int i2, String str, int i3) {
        if (A00(this, i)) {
            this.A01.markerAnnotate(i, i2, str, i3);
        }
    }

    public void markerAnnotate(int i, int i2, String str, long j) {
        if (A00(this, i)) {
            this.A01.markerAnnotate(i, i2, str, j);
        }
    }

    public void markerAnnotate(int i, int i2, String str, String str2) {
        if (A00(this, i)) {
            this.A01.markerAnnotate(i, i2, str, str2);
        }
    }

    public void markerAnnotate(int i, int i2, String str, boolean z) {
        if (A00(this, i)) {
            this.A01.markerAnnotate(i, i2, str, z);
        }
    }

    public void markerAnnotate(int i, int i2, String str, double[] dArr) {
        if (A00(this, i)) {
            this.A01.markerAnnotate(i, i2, str, dArr);
        }
    }

    public void markerAnnotate(int i, int i2, String str, int[] iArr) {
        if (A00(this, i)) {
            this.A01.markerAnnotate(i, i2, str, iArr);
        }
    }

    public void markerAnnotate(int i, int i2, String str, long[] jArr) {
        if (A00(this, i)) {
            this.A01.markerAnnotate(i, i2, str, jArr);
        }
    }

    public void markerAnnotate(int i, int i2, String str, String[] strArr) {
        if (A00(this, i)) {
            this.A01.markerAnnotate(i, i2, str, strArr);
        }
    }

    public void markerAnnotate(int i, int i2, String str, boolean[] zArr) {
        if (A00(this, i)) {
            this.A01.markerAnnotate(i, i2, str, zArr);
        }
    }

    public void markerAnnotate(int i, String str, double d) {
        if (A00(this, i)) {
            this.A01.markerAnnotate(i, str, d);
        }
    }

    public void markerAnnotate(int i, String str, int i2) {
        if (A00(this, i)) {
            this.A01.markerAnnotate(i, str, i2);
        }
    }

    public void markerAnnotate(int i, String str, long j) {
        if (A00(this, i)) {
            this.A01.markerAnnotate(i, str, j);
        }
    }

    public void markerAnnotate(int i, String str, String str2) {
        if (A00(this, i)) {
            this.A01.markerAnnotate(i, str, str2);
        }
    }

    public void markerAnnotate(int i, String str, boolean z) {
        if (A00(this, i)) {
            this.A01.markerAnnotate(i, str, z);
        }
    }

    public void markerAnnotate(int i, String str, double[] dArr) {
        if (A00(this, i)) {
            this.A01.markerAnnotate(i, str, dArr);
        }
    }

    public void markerAnnotate(int i, String str, int[] iArr) {
        if (A00(this, i)) {
            this.A01.markerAnnotate(i, str, iArr);
        }
    }

    public void markerAnnotate(int i, String str, long[] jArr) {
        if (A00(this, i)) {
            this.A01.markerAnnotate(i, str, jArr);
        }
    }

    public void markerAnnotate(int i, String str, String[] strArr) {
        if (A00(this, i)) {
            this.A01.markerAnnotate(i, str, strArr);
        }
    }

    public void markerAnnotate(int i, String str, boolean[] zArr) {
        if (A00(this, i)) {
            this.A01.markerAnnotate(i, str, zArr);
        }
    }

    public void markerAnnotateCrucialForUserFlow(int i, int i2, String str, int i3) {
        if (A00(this, i)) {
            this.A01.markerAnnotateCrucialForUserFlow(i, i2, str, i3);
        }
    }

    public void markerAnnotateCrucialForUserFlow(int i, int i2, String str, String str2) {
        if (A00(this, i)) {
            this.A01.markerAnnotateCrucialForUserFlow(i, i2, str, str2);
        }
    }

    public void markerDrop(int i) {
        if (A00(this, i)) {
            this.A01.markerDrop(i);
        }
    }

    public void markerDrop(int i, int i2) {
        if (A00(this, i)) {
            this.A01.markerDrop(i, i2);
        }
    }

    public void markerDropForUserFlow(int i, int i2) {
        if (A00(this, i)) {
            this.A01.markerDropForUserFlow(i, i2);
        }
    }

    public void markerEnd(int i, int i2, short s) {
        if (A00(this, i)) {
            this.A01.markerEnd(i, i2, s);
        }
    }

    public void markerEnd(int i, int i2, short s, long j, TimeUnit timeUnit) {
        if (A00(this, i)) {
            this.A01.markerEnd(i, i2, s, j, timeUnit);
        }
    }

    public void markerEnd(int i, short s) {
        if (A00(this, i)) {
            this.A01.markerEnd(i, s);
        }
    }

    public void markerEnd(int i, short s, long j, TimeUnit timeUnit) {
        if (A00(this, i)) {
            this.A01.markerEnd(i, s, j, timeUnit);
        }
    }

    public void markerEndAtPoint(int i, int i2, short s, String str) {
        if (A00(this, i)) {
            this.A01.markerEndAtPoint(i, i2, s, str);
        }
    }

    public void markerEndAtPoint(int i, short s, String str) {
        if (A00(this, i)) {
            this.A01.markerEndAtPoint(i, s, str);
        }
    }

    public void markerEndAtPointForUserFlow(int i, int i2, short s, String str) {
        if (A00(this, i)) {
            this.A01.markerEndAtPointForUserFlow(i, i2, s, str);
        }
    }

    public void markerEndForUserFlow(int i, int i2, short s) {
        if (A00(this, i)) {
            this.A01.markerEndForUserFlow(i, i2, s);
        }
    }

    public void markerEndForUserFlow(int i, String str, int i2, short s) {
        if (A00(this, i)) {
            this.A01.markerEndForUserFlow(i, str, i2, s);
        }
    }

    public void markerEndForUserFlow(int i, String str, int i2, short s, long j, TimeUnit timeUnit) {
        if (A00(this, i)) {
            this.A01.markerEndForUserFlow(i, str, i2, s, j, timeUnit);
        }
    }

    public void markerGenerate(int i, short s, long j, TimeUnit timeUnit) {
        if (A00(this, i)) {
            this.A01.markerGenerate(i, s, j, timeUnit);
        }
    }

    public void markerGenerateWithAnnotations(int i, short s, long j, TimeUnit timeUnit, java.util.Map map) {
        if (A00(this, i)) {
            this.A01.markerGenerateWithAnnotations(i, s, j, timeUnit, map);
        }
    }

    public void markerLinkPivot(int i, int i2, String str) {
        if (A00(this, i)) {
            this.A01.markerLinkPivot(i, i2, str);
        }
    }

    public void markerPoint(int i, int i2, int i3, String str, AnonymousClass045 anonymousClass045, long j, TimeUnit timeUnit, int i4) {
        if (A00(this, i)) {
            this.A01.markerPoint(i, i2, i3, str, anonymousClass045, j, timeUnit, i4);
        }
    }

    public void markerPoint(int i, int i2, String str) {
        if (A00(this, i)) {
            this.A01.markerPoint(i, i2, str);
        }
    }

    public void markerPoint(int i, int i2, String str, long j, TimeUnit timeUnit) {
        if (A00(this, i)) {
            this.A01.markerPoint(i, i2, str, j, timeUnit);
        }
    }

    public void markerPoint(int i, int i2, String str, String str2) {
        if (A00(this, i)) {
            this.A01.markerPoint(i, i2, str, str2);
        }
    }

    public void markerPoint(int i, int i2, String str, String str2, long j, TimeUnit timeUnit) {
        if (A00(this, i)) {
            this.A01.markerPoint(i, i2, str, str2, j, timeUnit);
        }
    }

    public void markerPoint(int i, int i2, String str, String str2, long j, TimeUnit timeUnit, int i3) {
        if (A00(this, i)) {
            this.A01.markerPoint(i, i2, str, str2, j, timeUnit, i3);
        }
    }

    public void markerPoint(int i, String str) {
        if (A00(this, i)) {
            this.A01.markerPoint(i, str);
        }
    }

    public void markerPoint(int i, String str, long j, TimeUnit timeUnit) {
        if (A00(this, i)) {
            this.A01.markerPoint(i, str, j, timeUnit);
        }
    }

    public void markerPoint(int i, String str, String str2) {
        if (A00(this, i)) {
            this.A01.markerPoint(i, str, str2);
        }
    }

    public void markerPoint(int i, String str, String str2, long j, TimeUnit timeUnit) {
        if (A00(this, i)) {
            this.A01.markerPoint(i, str, str2, j, timeUnit);
        }
    }

    public void markerStart(int i) {
        if (A00(this, i)) {
            this.A01.markerStart(i);
        }
    }

    public void markerStart(int i, int i2) {
        if (A00(this, i)) {
            this.A01.markerStart(i, i2);
        }
    }

    public void markerStart(int i, int i2, long j, TimeUnit timeUnit) {
        if (A00(this, i)) {
            this.A01.markerStart(i, i2, j, timeUnit);
        }
    }

    public void markerStart(int i, int i2, long j, TimeUnit timeUnit, int i3) {
        if (A00(this, i)) {
            this.A01.markerStart(i, i2, j, timeUnit, i3);
        }
    }

    public void markerStart(int i, int i2, String str, String str2) {
        if (A00(this, i)) {
            this.A01.markerStart(i, i2, str, str2);
        }
    }

    public void markerStart(int i, int i2, String str, String str2, long j, TimeUnit timeUnit) {
        if (A00(this, i)) {
            this.A01.markerStart(i, i2, str, str2, j, timeUnit);
        }
    }

    public void markerStart(int i, int i2, boolean z) {
        if (A00(this, i)) {
            this.A01.markerStart(i, i2, z);
        }
    }

    public void markerStart(int i, String str, String str2) {
        if (A00(this, i)) {
            this.A01.markerStart(i, str, str2);
        }
    }

    public void markerStart(int i, String str, String str2, long j, TimeUnit timeUnit) {
        if (A00(this, i)) {
            this.A01.markerStart(i, str, str2, j, timeUnit);
        }
    }

    public void markerStart(int i, boolean z) {
        if (A00(this, i)) {
            this.A01.markerStart(i, z);
        }
    }

    public void markerStartForE2E(int i, int i2, String str) {
        if (A00(this, i)) {
            this.A01.markerStartForE2E(i, i2, str);
        }
    }

    public void markerStartForE2E(int i, int i2, String str, long j, TimeUnit timeUnit) {
        if (A00(this, i)) {
            this.A01.markerStartForE2E(i, i2, str, j, timeUnit);
        }
    }

    public void markerStartForE2E(int i, int i2, String str, boolean z, long j, TimeUnit timeUnit) {
        if (A00(this, i)) {
            this.A01.markerStartForE2E(i, i2, str, z, j, timeUnit);
        }
    }

    public void markerStartForLegacy(int i, int i2, long j, TimeUnit timeUnit, 0uR r307) {
        if (A00(this, i)) {
            this.A01.markerStartForLegacy(i, i2, j, timeUnit, r307);
        }
    }

    public void markerStartForLegacy(int i, long j, TimeUnit timeUnit, 0uR r306) {
        if (A00(this, i)) {
            this.A01.markerStartForLegacy(i, j, timeUnit, r306);
        }
    }

    public void markerStartForUserFlow(int i, int i2, long j, TimeUnit timeUnit, boolean z) {
        if (A00(this, i)) {
            this.A01.markerStartForUserFlow(i, i2, j, timeUnit, z);
        }
    }

    public void markerStartForUserFlow(int i, int i2, String str, boolean z, long j) {
        if (A00(this, i)) {
            this.A01.markerStartForUserFlow(i, i2, str, z, j);
        }
    }

    public void markerStartForUserFlow(int i, int i2, String str, boolean z, long j, long j2, TimeUnit timeUnit) {
        if (A00(this, i)) {
            this.A01.markerStartForUserFlow(i, i2, str, z, j, j2, timeUnit);
        }
    }

    public void markerStartForUserFlow(int i, int i2, boolean z, long j) {
        if (A00(this, i)) {
            this.A01.markerStartForUserFlow(i, i2, z, j);
        }
    }

    public void markerStartWithCancelPolicy(int i, boolean z) {
        if (A00(this, i)) {
            this.A01.markerStartWithCancelPolicy(i, z);
        }
    }

    public void markerStartWithCancelPolicy(int i, boolean z, int i2) {
        if (A00(this, i)) {
            this.A01.markerStartWithCancelPolicy(i, z, i2);
        }
    }

    public void markerStartWithCancelPolicy(int i, boolean z, int i2, long j, TimeUnit timeUnit) {
        if (A00(this, i)) {
            this.A01.markerStartWithCancelPolicy(i, z, i2, j, timeUnit);
        }
    }

    public void markerStartWithCancelPolicy(int i, boolean z, int i2, long j, TimeUnit timeUnit, String str) {
        if (A00(this, i)) {
            this.A01.markerStartWithCancelPolicy(i, z, i2, j, timeUnit, str);
        }
    }

    public void markerTag(int i, int i2, String str) {
        if (A00(this, i)) {
            this.A01.markerTag(i, i2, str);
        }
    }

    public void markerTag(int i, String str) {
        if (A00(this, i)) {
            this.A01.markerTag(i, str);
        }
    }

    public int sampleRateForMarker(int i) {
        if (A00(this, i)) {
            return this.A01.sampleRateForMarker(i);
        }
        return 0;
    }

    public void setMissingConfigSampleRate(int i, int i2) {
        if (A00(this, i)) {
            this.A01.setMissingConfigSampleRate(i, i2);
        }
    }

    public void updateListenerMarkers() {
        this.A01.updateListenerMarkers();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.facebook.quicklog.MarkerEditor, java.lang.Object] */
    public MarkerEditor withMarker(int i) {
        if (!A00(this, i)) {
            return new Object();
        }
        MarkerEditor withMarker = this.A01.withMarker(i);
        11T.A0D(withMarker);
        return withMarker;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.facebook.quicklog.MarkerEditor, java.lang.Object] */
    public MarkerEditor withMarker(int i, int i2) {
        if (!A00(this, i)) {
            return new Object();
        }
        MarkerEditor withMarker = this.A01.withMarker(i, i2);
        11T.A0D(withMarker);
        return withMarker;
    }
}
