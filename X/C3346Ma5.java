package X;

/* renamed from: X.Ma5, reason: case insensitive filesystem */
/* loaded from: Ma5.class */
public final class C3346Ma5 extends C23s implements MPz {
    public C3346Ma5() {
        super(-1632832552);
    }

    public C3346Ma5(int i) {
        super(i);
    }

    @Override // X.MPz
    public MOF Ak2() {
        return A05(C3345Ma4.class, "entity", 3);
    }

    @Override // X.MPz
    public int Azy() {
        return A02(2, "offset");
    }

    @Override // X.MPz
    public int getLength() {
        return A02(1, "length");
    }

    @Override // X.C23s
    public AnonymousClass313 modelSelectionSet() {
        MRr A02 = MRr.A02(Rtc.A00);
        MRs mRs = MRs.A00;
        return MRw.A09(A02, MRr.A02(mRs), MRr.A02(mRs));
    }
}
