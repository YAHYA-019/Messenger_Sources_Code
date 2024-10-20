package X;

import android.content.Context;
import com.facebook.inject.FbInjector;

/* renamed from: X.9X3, reason: invalid class name */
/* loaded from: 9X3.class */
public final class C9X3 {
    public final 1Br A00 = 7zM.A0W();

    public final boolean A00() {
        if (!7zP.A0a(this.A00).A09()) {
            return false;
        }
        try {
            Context A00 = FbInjector.A00();
            9H5 r0 = (9H5) 1Bn.A0A(68908);
            11T.A0D(A00);
            11T.A0F(A00, 0);
            if (r0.A00.A03(A00) == 0) {
                0fH.A0j("EbGDriveGatingUtil", "Google Play Services are available");
                return true;
            }
            0fH.A0j("EbGDriveGatingUtil", "Google Play Services are not available");
            return false;
        } catch (Exception e) {
            0fH.A0s("EbGDriveGatingUtil", "Failed to check Google Play Services availability", e);
            return false;
        }
    }
}
