package X;

/* renamed from: X.9uo, reason: invalid class name */
/* loaded from: 9uo.class */
public final class C9uo implements C3lt {
    public final long A00;
    public final 1Br A01;

    public C9uo() {
        1Br A0T = 7zM.A0T();
        this.A01 = A0T;
        this.A00 = 4YV.A0Z(A0T).generateNewFlowId(231354962);
    }

    public static final void A00(C9uo c9uo, String str) {
        4YV.A0Z(c9uo.A01).flowEndFail(c9uo.A00, str, null);
    }

    public final void A01(String str) {
        4YV.A0Z(this.A01).flowMarkPoint(this.A00, str);
    }

    @Override // X.C3lt
    public void ATL(String str, String str2) {
        11T.A0H(str, str2);
        4YV.A0Z(this.A01).flowAnnotate(this.A00, str, str2);
    }

    @Override // X.C3lt
    public void ATN(String str) {
        11T.A0F(str, 0);
        A01(str);
    }
}
