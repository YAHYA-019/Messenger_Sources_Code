package X;

/* renamed from: X.9ul, reason: invalid class name */
/* loaded from: 9ul.class */
public final class C9ul implements C3lt {
    public final long A00;
    public final 1Br A01;

    public C9ul() {
        1Br A0T = 7zM.A0T();
        this.A01 = A0T;
        this.A00 = 4YV.A0Z(A0T).generateNewFlowId(231349576);
    }

    @Override // X.C3lt
    public void ATL(String str, String str2) {
        11T.A0H(str, str2);
        4YV.A0Z(this.A01).flowAnnotate(this.A00, str, str2);
    }

    @Override // X.C3lt
    public void ATN(String str) {
        11T.A0F(str, 0);
        4YV.A0Z(this.A01).flowMarkPoint(this.A00, str);
    }
}
