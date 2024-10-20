package X;

/* renamed from: X.92v, reason: invalid class name */
/* loaded from: 92v.class */
public final class C92v extends C6qx {
    public final boolean A00;

    public C92v() {
        this(false);
    }

    public C92v(boolean z) {
        this.A00 = z;
    }

    @Override // X.C6qx, X.C6qy
    public CharSequence BBT(5vW r302) {
        11T.A0F(r302, 0);
        if (!this.A00) {
            return super.BBT(r302);
        }
        C5fr c5fr = 7zM.A16(r302).A05;
        String str = c5fr.A0A;
        if (str == null) {
            str = c5fr.A07;
            11T.A0A(str);
        }
        return str;
    }
}
