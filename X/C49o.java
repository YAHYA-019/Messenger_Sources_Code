package X;

import com.facebook.analytics2.loggermodule.FbUploadJobInstrumentation;

/* renamed from: X.49o, reason: invalid class name */
/* loaded from: 49o.class */
public final class C49o implements C49p {
    public final C49m A00;
    public final FbUploadJobInstrumentation A01;
    public final String A02;

    public C49o(C49m c49m, FbUploadJobInstrumentation fbUploadJobInstrumentation, String str) {
        this.A00 = c49m;
        this.A02 = str;
        this.A01 = fbUploadJobInstrumentation;
    }

    @Override // X.C49p
    public void Bwz() {
        if (this.A01 != null) {
            String str = this.A02;
            C0k4.A00(str);
            C49h.A00.A06(str);
        }
    }

    @Override // X.C49p
    public void CUy(boolean z) {
        this.A00.CUy(z);
    }
}
