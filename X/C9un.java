package X;

/* renamed from: X.9un, reason: invalid class name */
/* loaded from: 9un.class */
public final class C9un implements C3lt {
    public boolean A00;
    public final long A01;
    public final 1Br A02;

    public C9un() {
        1Br A0T = 7zM.A0T();
        this.A02 = A0T;
        this.A01 = 4YV.A0Z(A0T).generateNewFlowId(231351966);
    }

    @Override // X.C3lt
    public void ATL(String str, String str2) {
        11T.A0H(str, str2);
        4YV.A0Z(this.A02).flowAnnotate(this.A01, str, str2);
    }

    @Override // X.C3lt
    public void ATN(String str) {
        11T.A0F(str, 0);
        4YV.A0Z(this.A02).flowMarkPoint(this.A01, str);
    }
}
