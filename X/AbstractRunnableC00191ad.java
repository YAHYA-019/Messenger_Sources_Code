package X;

/* renamed from: X.1ad, reason: invalid class name and case insensitive filesystem */
/* loaded from: 1ad.class */
public abstract class AbstractRunnableC00191ad implements Runnable, AnonymousClass052 {
    public static final String __redex_internal_original_name = "NamedRunnable";
    public final String A00;
    public final String A01;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AbstractRunnableC00191ad(java.lang.Class r302, java.lang.String r303) {
        /*
            r301 = this;
            r0 = r302
            java.lang.String r0 = r0.getSimpleName()
            r304 = r0
            r0 = r304
            X.11T.A0A(r0)
            r0 = r301
            r1 = r304
            r2 = r303
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractRunnableC00191ad.<init>(java.lang.Class, java.lang.String):void");
    }

    public AbstractRunnableC00191ad(String str, String str2) {
        11T.A0F(str2, 2);
        this.A00 = str;
        this.A01 = str2;
    }

    public Object getInnerRunnable() {
        return this;
    }

    @Override // X.AnonymousClass052
    public String getRunnableName() {
        return 0Pz.A0Y(this.A00, this.A01, '/');
    }

    public String toString() {
        return getRunnableName();
    }
}
