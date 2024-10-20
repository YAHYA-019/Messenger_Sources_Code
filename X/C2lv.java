package X;

/* renamed from: X.2lv, reason: invalid class name */
/* loaded from: 2lv.class */
public final class C2lv implements C2lw {
    public final 1tT A00;
    public final C1rj A01;
    public final String A02;

    public C2lv(1tT r302, C1rj c1rj, String str) {
        this.A02 = str;
        this.A01 = c1rj;
        this.A00 = r302;
    }

    @Override // X.C2lw
    public void AAu() {
        1Iw r0 = this.A00.A04;
        try {
            this.A01.A1C(r0);
        } catch (Exception e) {
            C4Cv.A03(r0, e);
        }
    }

    @Override // X.C2lw
    public void AN3() {
        1Iw r0 = this.A00.A04;
        try {
            this.A01.A1D(r0);
        } catch (Exception e) {
            C4Cv.A03(r0, e);
        }
    }

    @Override // X.C2lw
    public String BHy() {
        return this.A02;
    }

    @Override // X.C2lw
    public boolean Cyx(C2lw c2lw) {
        return false;
    }

    @Override // X.C2lw
    public boolean D8f() {
        return true;
    }
}
