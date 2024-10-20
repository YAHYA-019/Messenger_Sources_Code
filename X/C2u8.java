package X;

/* renamed from: X.2u8, reason: invalid class name */
/* loaded from: 2u8.class */
public final class C2u8 implements C2u9 {
    public final /* synthetic */ C01s A00;

    public C2u8(C01s c01s) {
        this.A00 = c01s;
    }

    @Override // X.C2u9
    public void Cg1(String str, Throwable th) {
        String message = th.getMessage();
        C01s c01s = this.A00;
        if (message == null) {
            message = "";
        }
        c01s.D0u(0BR.A00("IpcExceptionFactory_DESERIALIZATION_FAILED", message));
    }
}
