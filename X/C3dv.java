package X;

/* renamed from: X.3dv, reason: invalid class name */
/* loaded from: 3dv.class */
public final class C3dv implements 1K9 {
    public final int A00;
    public final Object A01;
    public final String A02;
    public final String A03;

    public C3dv(C3Sp c3Sp, String str, String str2, int i) {
        this.A00 = i;
        this.A02 = str;
        this.A01 = c3Sp;
        this.A03 = str2;
    }

    public void onFailure(Throwable th) {
        C3Sp c3Sp;
        String str;
        String str2;
        int i = this.A00;
        11T.A0F(th, 0);
        String str3 = this.A02;
        Object[] objArr = {str3};
        if (i != 0) {
            0fH.A0z("MLDWFalcoHost", "Failed to register event %s in MLDW", th, objArr);
            c3Sp = (C3Sp) this.A01;
            str = this.A03;
            str2 = "event.federated.not_processed.register.failed";
        } else {
            0fH.A0z("MLDWFalcoHost", "Failed to log event %s to MLDW", th, objArr);
            c3Sp = (C3Sp) this.A01;
            str = this.A03;
            str2 = "event.federated.not_processed.persist.failed";
        }
        C3Sp.A00(c3Sp, str2, str3, str);
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C3Sp c3Sp;
        String str;
        String str2;
        int i = this.A00;
        String str3 = this.A02;
        if (i != 0) {
            0fH.A0g(str3, "MLDWFalcoHost", "Registered event %s in MLDW successfully");
            c3Sp = (C3Sp) this.A01;
            str = this.A03;
            str2 = "event.federated.registered";
        } else {
            0fH.A0g(str3, "MLDWFalcoHost", "Logged %s successfully to MLDW");
            c3Sp = (C3Sp) this.A01;
            str = this.A03;
            str2 = "event.federated.persisted";
        }
        C3Sp.A00(c3Sp, str2, str3, str);
    }
}
