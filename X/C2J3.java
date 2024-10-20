package X;

/* renamed from: X.2J3, reason: invalid class name */
/* loaded from: 2J3.class */
public class C2J3 {
    public C1kv A00;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.1kv] */
    public C2J3() {
        this.A00 = new Object();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.1kv] */
    public C2J3(C1kw c1kw) {
        this.A00 = new Object();
        C1kv c1kv = c1kw.A00;
        if (c1kv == null) {
            0fH.A0B(C2J3.class, "Null legacy UnifiedInternalLogger injected into UnifiedEventBase#setLogger");
        } else {
            this.A00 = c1kv;
        }
    }

    public final void A01(C1kv c1kv) {
        if (c1kv == null) {
            0fH.A0B(C2J3.class, "Null legacy UnifiedInternalLogger injected into UnifiedEventBase#setLogger");
        } else {
            this.A00 = c1kv;
        }
    }

    public final void A02(2Jy r302) {
        this.A00.BZq(r302);
    }

    public final void A03(2Jy r302) {
        this.A00.Ba5(r302);
    }
}
