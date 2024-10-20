package X;

import android.os.Bundle;
import com.facebook.messaging.hdmediasends.nux.HdMediaNuxFragment;
import com.facebook.prefs.shared.FbSharedPreferences;
import java.io.Serializable;
import kotlin.jvm.functions.Function1;

/* renamed from: X.799, reason: invalid class name */
/* loaded from: 799.class */
public final class AnonymousClass799 {
    public static final 1G2 A01 = 1NK.A1R;
    public final 1Br A00 = 1Bq.A00(33013);

    public final boolean A00(06Z r302, H9y h9y, Function1 function1) {
        11T.A0F(r302, 0);
        C00i c00i = this.A00.A00;
        FbSharedPreferences A0S = 1BK.A0S(c00i);
        1G2 r0 = A01;
        if (!(!A0S.AZn(r0, false))) {
            return false;
        }
        2qR r02 = HdMediaNuxFragment.A00;
        Bundle A05 = 1BK.A05();
        A05.putSerializable(7zK.A00(212), (Serializable) function1);
        A05.putSerializable("NUX_TRIGGER", h9y);
        2Ov hdMediaNuxFragment = new HdMediaNuxFragment();
        hdMediaNuxFragment.setArguments(A05);
        hdMediaNuxFragment.A0m(r302, "HdMediaNuxFragment");
        1Ql.A03(r0, c00i.get(), true);
        return true;
    }
}
