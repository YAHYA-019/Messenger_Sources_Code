package X;

import android.content.Context;
import android.os.StrictMode;
import java.io.File;
import java.util.Collection;

/* renamed from: X.0cv, reason: invalid class name */
/* loaded from: 0cv.class */
public final class C0cv extends C0ib implements C0jm {
    public C13i A00;
    public final int A01;

    public C0cv(Context context, int i) {
        this.A01 = i;
        this.A00 = new C13i(AnonymousClass001.A0E(context.getApplicationInfo().nativeLibraryDir), i);
    }

    @Override // X.C0ib
    public void A02(Collection collection) {
        this.A00.A02(collection);
    }

    @Override // X.C0ib
    public String[] A03(String str) {
        return this.A00.A03(str);
    }

    @Override // X.C0ib
    public int A05(StrictMode.ThreadPolicy threadPolicy, String str, int i) {
        return this.A00.A05(threadPolicy, str, i);
    }

    @Override // X.C0ib
    public File A06(String str) {
        return this.A00.A0A(str);
    }

    @Override // X.C0ib
    public String A07() {
        return "ApplicationSoSource";
    }

    @Override // X.C0ib
    public String A08(String str) {
        return this.A00.A08(str);
    }

    @Override // X.C0ib
    public void A09(int i) {
        this.A00.A09(i);
    }

    @Override // X.C0jm
    public C0ib Cbf(Context context) {
        this.A00 = new C13i(AnonymousClass001.A0E(context.getApplicationInfo().nativeLibraryDir), this.A01 | 1);
        return this;
    }

    @Override // X.C0ib
    public String toString() {
        return 0Pz.A0v("ApplicationSoSource", "[", this.A00.toString(), "]");
    }
}
