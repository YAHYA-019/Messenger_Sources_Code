package X;

import com.facebook.quicklog.EventBuilder;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.quicklog.PointEditor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3vp, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3vp.class */
public final class C02623vp implements 02G, C1Jn {
    public final PointEditor A01 = new PointEditor() { // from class: X.3vq
        @Override // com.facebook.quicklog.PointEditor
        public PointEditor addPointData(String str, double d) {
            return this;
        }

        @Override // com.facebook.quicklog.PointEditor
        public PointEditor addPointData(String str, float f) {
            return this;
        }

        @Override // com.facebook.quicklog.PointEditor
        public PointEditor addPointData(String str, int i) {
            return this;
        }

        @Override // com.facebook.quicklog.PointEditor
        public PointEditor addPointData(String str, long j) {
            return this;
        }

        @Override // com.facebook.quicklog.PointEditor
        public PointEditor addPointData(String str, String str2) {
            return this;
        }

        @Override // com.facebook.quicklog.PointEditor
        public PointEditor addPointData(String str, boolean z) {
            return this;
        }

        @Override // com.facebook.quicklog.PointEditor
        public PointEditor addPointData(String str, double[] dArr) {
            return this;
        }

        @Override // com.facebook.quicklog.PointEditor
        public PointEditor addPointData(String str, float[] fArr) {
            return this;
        }

        @Override // com.facebook.quicklog.PointEditor
        public PointEditor addPointData(String str, int[] iArr) {
            return this;
        }

        @Override // com.facebook.quicklog.PointEditor
        public PointEditor addPointData(String str, long[] jArr) {
            return this;
        }

        @Override // com.facebook.quicklog.PointEditor
        public PointEditor addPointData(String str, String[] strArr) {
            return this;
        }

        @Override // com.facebook.quicklog.PointEditor
        public PointEditor addPointData(String str, boolean[] zArr) {
            return this;
        }

        @Override // com.facebook.quicklog.PointEditor
        public void markerEditingCompleted() {
        }

        @Override // com.facebook.quicklog.PointEditor
        public PointEditor pointCustomTimestamp(long j) {
            return this;
        }

        @Override // com.facebook.quicklog.PointEditor
        public MarkerEditor pointEditingCompleted() {
            return C02623vp.this.A00;
        }

        @Override // com.facebook.quicklog.PointEditor
        public PointEditor pointShouldIncludeMetadata(boolean z) {
            return this;
        }
    };
    public final MarkerEditor A00 = new MarkerEditor() { // from class: X.3vr
        @Override // com.facebook.quicklog.MarkerEditor
        public MarkerEditor annotate(String str, double d) {
            return this;
        }

        @Override // com.facebook.quicklog.MarkerEditor
        public MarkerEditor annotate(String str, int i) {
            return this;
        }

        @Override // com.facebook.quicklog.MarkerEditor
        public MarkerEditor annotate(String str, long j) {
            return this;
        }

        @Override // com.facebook.quicklog.MarkerEditor
        public MarkerEditor annotate(String str, String str2) {
            return this;
        }

        @Override // com.facebook.quicklog.MarkerEditor
        public MarkerEditor annotate(String str, boolean z) {
            return this;
        }

        @Override // com.facebook.quicklog.MarkerEditor
        public MarkerEditor annotate(String str, double[] dArr) {
            return this;
        }

        @Override // com.facebook.quicklog.MarkerEditor
        public MarkerEditor annotate(String str, int[] iArr) {
            return this;
        }

        @Override // com.facebook.quicklog.MarkerEditor
        public MarkerEditor annotate(String str, long[] jArr) {
            return this;
        }

        @Override // com.facebook.quicklog.MarkerEditor
        public MarkerEditor annotate(String str, String[] strArr) {
            return this;
        }

        @Override // com.facebook.quicklog.MarkerEditor
        public MarkerEditor annotate(String str, boolean[] zArr) {
            return this;
        }

        @Override // com.facebook.quicklog.MarkerEditor
        public boolean isSampled() {
            return false;
        }

        @Override // com.facebook.quicklog.MarkerEditor, com.facebook.quicklog.PointEditor
        public void markerEditingCompleted() {
        }

        @Override // com.facebook.quicklog.MarkerEditor
        public MarkerEditor point(String str, String str2, long j) {
            return this;
        }

        @Override // com.facebook.quicklog.MarkerEditor
        public PointEditor pointEditor(String str) {
            return C02623vp.this.A01;
        }

        @Override // com.facebook.quicklog.MarkerEditor
        public MarkerEditor pointWithMetadata(String str, String str2, long j) {
            return this;
        }

        @Override // com.facebook.quicklog.MarkerEditor
        public MarkerEditor setSurviveUserSwitch(boolean z) {
            return this;
        }

        @Override // com.facebook.quicklog.MarkerEditor
        public MarkerEditor withLevel(int i) {
            return this;
        }
    };
    public final EventBuilder A02 = new EventBuilder() { // from class: X.3vs
        @Override // com.facebook.quicklog.EventBuilder
        public EventBuilder annotate(String str, double d) {
            return this;
        }

        @Override // com.facebook.quicklog.EventBuilder
        public EventBuilder annotate(String str, int i) {
            return this;
        }

        @Override // com.facebook.quicklog.EventBuilder
        public EventBuilder annotate(String str, long j) {
            return this;
        }

        @Override // com.facebook.quicklog.EventBuilder
        public EventBuilder annotate(String str, String str2) {
            return this;
        }

        @Override // com.facebook.quicklog.EventBuilder
        public EventBuilder annotate(String str, boolean z) {
            return this;
        }

        @Override // com.facebook.quicklog.EventBuilder
        public EventBuilder annotate(String str, double[] dArr) {
            return this;
        }

        @Override // com.facebook.quicklog.EventBuilder
        public EventBuilder annotate(String str, int[] iArr) {
            return this;
        }

        @Override // com.facebook.quicklog.EventBuilder
        public EventBuilder annotate(String str, long[] jArr) {
            return this;
        }

        @Override // com.facebook.quicklog.EventBuilder
        public EventBuilder annotate(String str, String[] strArr) {
            return this;
        }

        @Override // com.facebook.quicklog.EventBuilder
        public EventBuilder annotate(String str, boolean[] zArr) {
            return this;
        }

        @Override // com.facebook.quicklog.EventBuilder
        public boolean isSampled() {
            return false;
        }

        @Override // com.facebook.quicklog.EventBuilder
        public void report() {
        }

        @Override // com.facebook.quicklog.EventBuilder
        public EventBuilder setActionId(short s) {
            return this;
        }

        @Override // com.facebook.quicklog.EventBuilder
        public EventBuilder setLevel(int i) {
            return this;
        }
    };

    public void Bcm(int i, int i2, String str, int i3) {
    }

    public void Bcn(int i, int i2, String str, String str2) {
    }

    public void Bcq(int i, int i2, short s, long j, TimeUnit timeUnit) {
    }

    public void Bcx(int i, int i2, long j, TimeUnit timeUnit, int i3) {
    }

    @Override // X.C1Jn
    public void Ckh(0El r302, 1Qb r303) {
    }

    public long currentMonotonicTimestamp() {
        return 0L;
    }

    public long currentMonotonicTimestampNanos() {
        return 0L;
    }

    public void dropAllInstancesOfMarker(int i) {
    }

    public void endAllInstancesOfMarker(int i, short s) {
    }

    public void endAllMarkers(short s, boolean z) {
    }

    public boolean isMarkerOn(int i) {
        return false;
    }

    public boolean isMarkerOn(int i, int i2) {
        return false;
    }

    public boolean isMarkerOn(int i, int i2, boolean z) {
        return false;
    }

    public boolean isMarkerOn(int i, boolean z) {
        return false;
    }

    public void markEvent(int i, String str, int i2) {
    }

    public EventBuilder markEventBuilder(int i, int i2, String str) {
        return this.A02;
    }

    public EventBuilder markEventBuilder(int i, String str) {
        return this.A02;
    }

    public void markJoinRequestForE2E(int i, int i2, String str) {
    }

    public void markJoinRequestForE2E(int i, int i2, String str, long j, TimeUnit timeUnit) {
    }

    public void markJoinResponseForE2E(int i, int i2, String str) {
    }

    public void markJoinResponseForE2E(int i, int i2, String str, long j, TimeUnit timeUnit) {
    }

    public void markerAnnotate(int i, int i2, String str, double d) {
    }

    public void markerAnnotate(int i, int i2, String str, int i3) {
    }

    public void markerAnnotate(int i, int i2, String str, long j) {
    }

    public void markerAnnotate(int i, int i2, String str, String str2) {
    }

    public void markerAnnotate(int i, int i2, String str, boolean z) {
    }

    public void markerAnnotate(int i, int i2, String str, double[] dArr) {
    }

    public void markerAnnotate(int i, int i2, String str, int[] iArr) {
    }

    public void markerAnnotate(int i, int i2, String str, long[] jArr) {
    }

    public void markerAnnotate(int i, int i2, String str, String[] strArr) {
    }

    public void markerAnnotate(int i, int i2, String str, boolean[] zArr) {
    }

    public void markerAnnotate(int i, String str, double d) {
    }

    public void markerAnnotate(int i, String str, int i2) {
    }

    public void markerAnnotate(int i, String str, long j) {
    }

    public void markerAnnotate(int i, String str, String str2) {
    }

    public void markerAnnotate(int i, String str, boolean z) {
    }

    public void markerAnnotate(int i, String str, double[] dArr) {
    }

    public void markerAnnotate(int i, String str, int[] iArr) {
    }

    public void markerAnnotate(int i, String str, long[] jArr) {
    }

    public void markerAnnotate(int i, String str, String[] strArr) {
    }

    public void markerAnnotate(int i, String str, boolean[] zArr) {
    }

    public void markerAnnotateCrucialForUserFlow(int i, int i2, String str, int i3) {
    }

    public void markerAnnotateCrucialForUserFlow(int i, int i2, String str, String str2) {
    }

    public void markerDrop(int i) {
    }

    public void markerDrop(int i, int i2) {
    }

    public void markerDropForUserFlow(int i, int i2) {
    }

    public void markerEnd(int i, int i2, short s) {
    }

    public void markerEnd(int i, int i2, short s, long j, TimeUnit timeUnit) {
    }

    public void markerEnd(int i, short s) {
    }

    public void markerEnd(int i, short s, long j, TimeUnit timeUnit) {
    }

    public void markerEndAtPoint(int i, int i2, short s, String str) {
    }

    public void markerEndAtPoint(int i, short s, String str) {
    }

    public void markerEndAtPointForUserFlow(int i, int i2, short s, String str) {
    }

    public void markerEndForUserFlow(int i, int i2, short s) {
    }

    public void markerEndForUserFlow(int i, String str, int i2, short s) {
    }

    public void markerEndForUserFlow(int i, String str, int i2, short s, long j, TimeUnit timeUnit) {
    }

    public void markerGenerate(int i, short s, long j, TimeUnit timeUnit) {
    }

    public void markerGenerateWithAnnotations(int i, short s, long j, TimeUnit timeUnit, java.util.Map map) {
    }

    public void markerLinkPivot(int i, int i2, String str) {
    }

    public void markerPoint(int i, int i2, int i3, String str, AnonymousClass045 anonymousClass045, long j, TimeUnit timeUnit, int i4) {
    }

    public void markerPoint(int i, int i2, String str) {
    }

    public void markerPoint(int i, int i2, String str, long j, TimeUnit timeUnit) {
    }

    public void markerPoint(int i, int i2, String str, String str2) {
    }

    public void markerPoint(int i, int i2, String str, String str2, long j, TimeUnit timeUnit) {
    }

    public void markerPoint(int i, int i2, String str, String str2, long j, TimeUnit timeUnit, int i3) {
    }

    public void markerPoint(int i, String str) {
    }

    public void markerPoint(int i, String str, long j, TimeUnit timeUnit) {
    }

    public void markerPoint(int i, String str, String str2) {
    }

    public void markerPoint(int i, String str, String str2, long j, TimeUnit timeUnit) {
    }

    public void markerStart(int i) {
    }

    public void markerStart(int i, int i2) {
    }

    public void markerStart(int i, int i2, long j, TimeUnit timeUnit) {
    }

    public void markerStart(int i, int i2, long j, TimeUnit timeUnit, int i3) {
    }

    public void markerStart(int i, int i2, String str, String str2) {
    }

    public void markerStart(int i, int i2, String str, String str2, long j, TimeUnit timeUnit) {
    }

    public void markerStart(int i, int i2, boolean z) {
    }

    public void markerStart(int i, String str, String str2) {
    }

    public void markerStart(int i, String str, String str2, long j, TimeUnit timeUnit) {
    }

    public void markerStart(int i, boolean z) {
    }

    public void markerStartForE2E(int i, int i2, String str) {
    }

    public void markerStartForE2E(int i, int i2, String str, long j, TimeUnit timeUnit) {
    }

    public void markerStartForE2E(int i, int i2, String str, boolean z, long j, TimeUnit timeUnit) {
    }

    public void markerStartForLegacy(int i, int i2, long j, TimeUnit timeUnit, 0uR r307) {
    }

    public void markerStartForLegacy(int i, long j, TimeUnit timeUnit, 0uR r306) {
    }

    public void markerStartForUserFlow(int i, int i2, long j, TimeUnit timeUnit, boolean z) {
    }

    public void markerStartForUserFlow(int i, int i2, String str, boolean z, long j) {
    }

    public void markerStartForUserFlow(int i, int i2, String str, boolean z, long j, long j2, TimeUnit timeUnit) {
    }

    public void markerStartForUserFlow(int i, int i2, boolean z, long j) {
    }

    public void markerStartWithCancelPolicy(int i, boolean z) {
    }

    public void markerStartWithCancelPolicy(int i, boolean z, int i2) {
    }

    public void markerStartWithCancelPolicy(int i, boolean z, int i2, long j, TimeUnit timeUnit) {
    }

    public void markerStartWithCancelPolicy(int i, boolean z, int i2, long j, TimeUnit timeUnit, String str) {
    }

    public void markerTag(int i, int i2, String str) {
    }

    public void markerTag(int i, String str) {
    }

    public int sampleRateForMarker(int i) {
        return 0;
    }

    public void setMissingConfigSampleRate(int i, int i2) {
    }

    public void updateListenerMarkers() {
    }

    public MarkerEditor withMarker(int i) {
        return this.A00;
    }

    public MarkerEditor withMarker(int i, int i2) {
        return this.A00;
    }
}
