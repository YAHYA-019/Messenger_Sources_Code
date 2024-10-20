package X;

/* renamed from: X.8j9, reason: invalid class name */
/* loaded from: 8j9.class */
public final class C8j9 extends C1rj {
    public GL7 A00;
    public FyG A01;

    public C8j9() {
        super("NTFDSGlimmerComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, this.A00};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        Integer num;
        Integer num2;
        GL7 gl7 = this.A00;
        1BK.A1M(r302, gl7);
        int i = gl7.getInt(49, 0);
        String BCx = gl7.BCx(55, "DEFAULT");
        11T.A0A(BCx);
        String BCx2 = gl7.BCx(43, "LIGHT");
        11T.A0A(BCx2);
        boolean z = gl7.getBoolean(44, false);
        int A00 = F3H.A00(gl7.Amm(45, 0.0f));
        try {
            if (BCx.equals("DEFAULT")) {
                num = 0S2.A00;
            } else {
                if (!BCx.equals("BACKGROUND")) {
                    throw AnonymousClass001.A0L(BCx);
                }
                num = 0S2.A01;
            }
        } catch (Exception unused) {
            num = 0S2.A00;
        }
        11T.A0F(num, 0);
        try {
            if (BCx2.equals("LIGHT")) {
                num2 = 0S2.A00;
            } else if (BCx2.equals("DARK")) {
                num2 = 0S2.A01;
            } else if (BCx2.equals("DEFAULT")) {
                num2 = 0S2.A0C;
            } else {
                if (!BCx2.equals("WASH")) {
                    throw AnonymousClass001.A0L(BCx2);
                }
                num2 = 0S2.A0N;
            }
        } catch (Exception unused2) {
            num2 = 0S2.A00;
        }
        11T.A0F(num2, 0);
        C9hj c9hj = new C9hj(num2, num, i, 200);
        8TN A002 = C8m2.A00(r302);
        A002.A2Z(c9hj);
        A002.A00.A00 = A00;
        A002.A2a(z ? 95U.A02 : A00 == 0 ? 95U.A03 : 95U.A04);
        return A002.A2W();
    }
}
