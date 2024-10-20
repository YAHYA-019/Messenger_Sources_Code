package X;

/* loaded from: J62.class */
public final /* synthetic */ class J62 implements 0Jf, JFi {
    public final /* synthetic */ C00m A00;

    public J62(C00m c00m) {
        11T.A0F(c00m, 1);
        this.A00 = c00m;
    }

    @Override // X.JFi
    public final /* synthetic */ void Bo1() {
        this.A00.invoke();
    }

    public final boolean equals(Object obj) {
        boolean z = false;
        if ((obj instanceof JFi) && (obj instanceof 0Jf)) {
            z = 11T.A0O(this.A00, ((0Jf) obj).getFunctionDelegate());
        }
        return z;
    }

    public final C00l getFunctionDelegate() {
        return this.A00;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
