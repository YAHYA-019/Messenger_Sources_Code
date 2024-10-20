package X;

import com.facebook.messaging.nativepagereply.plugins.biimthreadactionsystem.quickpromotion.ThreadActionSystemBanner;
import com.facebook.prefs.shared.FbSharedPreferences;

/* renamed from: X.9y1, reason: invalid class name */
/* loaded from: 9y1.class */
public final class C9y1 implements AYH {
    public final int A00;
    public final Object A01;

    public C9y1(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onDismiss() {
        if (this.A00 != 0) {
            ((9VP) this.A01).A01.A07((java.util.Map) null);
            return;
        }
        1Br.A0C(((ThreadActionSystemBanner) this.A01).A02);
        1G9 r0 = C5vl.A04;
        FbSharedPreferences A0W = 1BL.A0W();
        1G9 r02 = C5vl.A04;
        7zO.A1T(A0W.edit(), r02, 7zM.A03(A0W, r02));
    }
}
