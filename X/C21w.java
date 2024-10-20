package X;

/* renamed from: X.21w, reason: invalid class name */
/* loaded from: 21w.class */
public final class C21w implements C21v {
    public final C00i A00 = new 1BQ(16511);

    @Override // X.C21v
    public boolean D5K() {
        try {
            C0il.A0B("fb");
            C0il.A0B("liger");
            return true;
        } catch (Throwable th) {
            1BK.A09(this.A00).softReport("Liger.loadLibrary", th.getMessage(), th);
            return false;
        }
    }
}
