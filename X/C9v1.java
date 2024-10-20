package X;

/* renamed from: X.9v1, reason: invalid class name */
/* loaded from: 9v1.class */
public final class C9v1 implements JJw, C79e {
    public boolean A00 = true;
    public final H4B A01;

    public C9v1(H4B h4b) {
        this.A01 = h4b;
    }

    @Override // X.C79e
    public void AFa() {
        this.A00 = false;
    }

    @Override // X.JJw
    public boolean BRM() {
        return this.A00;
    }

    @Override // X.JJw
    public boolean BTN() {
        return this.A01.A0j();
    }

    @Override // X.C79e
    public void CqF() {
        this.A00 = true;
    }

    @Override // X.JJw
    public boolean CxO() {
        return false;
    }
}
