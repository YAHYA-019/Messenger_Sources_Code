package X;

/* renamed from: X.0n1, reason: invalid class name */
/* loaded from: 0n1.class */
public final class C0n1 implements C0w6 {
    public final int A00;
    public final Object A01;

    public C0n1(C00i c00i, int i) {
        this.A00 = i;
        this.A01 = c00i;
    }

    @Override // X.C0w6
    public void Cfz(String str) {
        ((C01s) ((C00i) this.A01).get()).D0v(this.A00 != 0 ? "SecureContextHelperDICodemod" : "SecureContextHelperDI", str);
    }

    @Override // X.C0w6
    public void Cg0(String str, String str2, Throwable th) {
        ((C01s) ((C00i) this.A01).get()).softReport(this.A00 != 0 ? "SecureContextHelperDICodemod" : "SecureContextHelperDI", str2, th);
    }
}
