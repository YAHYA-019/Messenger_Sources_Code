package X;

import android.net.Uri;

/* loaded from: A26.class */
public final class A26 implements C5uZ {
    public final int A00;
    public final Object A01;
    public final String A02;

    public A26(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    @Override // X.C5uZ
    public /* bridge */ /* synthetic */ Object get() {
        C5j5 c5j5;
        boolean z;
        switch (this.A00) {
            case 0:
                Uri uri = null;
                try {
                    uri = C0A2.A03(7zS.A12((C5j5) this.A01, this.A02));
                } catch (SecurityException unused) {
                }
                if (!0CO.A03(uri) || uri == null || uri.getPath() == null) {
                    z = false;
                } else {
                    String path = uri.getPath();
                    if (path == null) {
                        throw 1BK.A0e();
                    }
                    z = AnonymousClass001.A0E(path).exists();
                }
                return Boolean.valueOf(z);
            case 1:
                c5j5 = ((94G) this.A01).A01;
                break;
            case 2:
                c5j5 = ((94K) this.A01).A01;
                break;
            case 3:
                try {
                    return C0A2.A03(7zS.A12((C5j5) this.A01, this.A02));
                } catch (SecurityException unused2) {
                    return null;
                }
            default:
                return null;
        }
        return 7zS.A12(c5j5, this.A02);
    }
}
