package X;

/* renamed from: X.15e, reason: invalid class name */
/* loaded from: 15e.class */
public final class C15e implements C0w6 {
    public 0Mc A00;

    @Override // X.C0w6
    public void Cfz(String str) {
        this.A00 = new 0Mc(09G.A0C, str);
    }

    @Override // X.C0w6
    public void Cg0(String str, String str2, Throwable th) {
        09G r0 = 09G.A0C;
        this.A00 = th != null ? new 0Mc(r0, str2, th) : new 0Mc(r0, str2);
    }
}
