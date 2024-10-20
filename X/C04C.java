package X;

import com.facebook.quicklog.EventBuilder;

/* renamed from: X.04C, reason: invalid class name */
/* loaded from: 04C.class */
public final class C04C implements EventBuilder {
    public static final C04C A00 = new Object();

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
}
