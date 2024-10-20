package X;

/* renamed from: X.488, reason: invalid class name */
/* loaded from: 488.class */
public final class AnonymousClass488 implements C0w6 {
    public final C01s A00;
    public final String A01;

    public AnonymousClass488(C01s c01s, String str) {
        this.A00 = c01s;
        this.A01 = str;
    }

    @Override // X.C0w6
    public void Cfz(String str) {
        this.A00.D0v(this.A01, str);
    }

    @Override // X.C0w6
    public void Cg0(String str, String str2, Throwable th) {
        this.A00.softReport(str, str2, th);
    }
}
