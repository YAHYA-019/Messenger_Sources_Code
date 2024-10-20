package X;

import com.facebook.quicklog.EventBuilder;

/* renamed from: X.1ne, reason: invalid class name */
/* loaded from: 1ne.class */
public final class C1ne implements EventBuilder {
    public static final ThreadLocal A03 = new ThreadLocal();
    public C1Jn A00;
    public 0El A01;
    public 1Qb A02;

    @Override // com.facebook.quicklog.EventBuilder
    public EventBuilder annotate(String str, double d) {
        1Qb r0 = this.A02;
        r0.getClass();
        r0.A03(str, d);
        return this;
    }

    @Override // com.facebook.quicklog.EventBuilder
    public EventBuilder annotate(String str, int i) {
        1Qb r0 = this.A02;
        r0.getClass();
        r0.A04(str, i);
        return this;
    }

    @Override // com.facebook.quicklog.EventBuilder
    public EventBuilder annotate(String str, long j) {
        1Qb r0 = this.A02;
        r0.getClass();
        r0.A8O(str, j);
        return this;
    }

    @Override // com.facebook.quicklog.EventBuilder
    public EventBuilder annotate(String str, String str2) {
        1Qb r0 = this.A02;
        r0.getClass();
        r0.A8P(str, str2);
        return this;
    }

    @Override // com.facebook.quicklog.EventBuilder
    public EventBuilder annotate(String str, boolean z) {
        1Qb r0 = this.A02;
        r0.getClass();
        r0.A05(str, z);
        return this;
    }

    @Override // com.facebook.quicklog.EventBuilder
    public EventBuilder annotate(String str, double[] dArr) {
        1Qb r0 = this.A02;
        r0.getClass();
        r0.A06(str, dArr);
        return this;
    }

    @Override // com.facebook.quicklog.EventBuilder
    public EventBuilder annotate(String str, int[] iArr) {
        1Qb r0 = this.A02;
        r0.getClass();
        r0.A07(str, iArr);
        return this;
    }

    @Override // com.facebook.quicklog.EventBuilder
    public EventBuilder annotate(String str, long[] jArr) {
        1Qb r0 = this.A02;
        r0.getClass();
        r0.A08(str, jArr);
        return this;
    }

    @Override // com.facebook.quicklog.EventBuilder
    public EventBuilder annotate(String str, String[] strArr) {
        1Qb r0 = this.A02;
        r0.getClass();
        r0.A8Q(str, strArr);
        return this;
    }

    @Override // com.facebook.quicklog.EventBuilder
    public EventBuilder annotate(String str, boolean[] zArr) {
        1Qb r0 = this.A02;
        r0.getClass();
        r0.A09(str, zArr);
        return this;
    }

    @Override // com.facebook.quicklog.EventBuilder
    public boolean isSampled() {
        return true;
    }

    @Override // com.facebook.quicklog.EventBuilder
    public void report() {
        if (this.A02 != null) {
            C1Jn c1Jn = this.A00;
            c1Jn.getClass();
            c1Jn.Ckh(this.A01, this.A02);
        }
        this.A02 = null;
        this.A00 = null;
        A03.set(this);
    }

    @Override // com.facebook.quicklog.EventBuilder
    public EventBuilder setActionId(short s) {
        1Qb r0 = this.A02;
        r0.getClass();
        r0.A0N = s;
        return this;
    }

    @Override // com.facebook.quicklog.EventBuilder
    public EventBuilder setLevel(int i) {
        1Qb r0 = this.A02;
        r0.getClass();
        r0.A00 = i;
        return this;
    }
}
