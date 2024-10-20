package X;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.privacy.e2ee.genericimpl.store.EncryptedSharedPreferencesFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: L20.class */
public final class L20 {
    public final SharedPreferences A00;
    public final C0dp A01;

    public L20(Context context, C0dp c0dp) {
        11T.A0F(c0dp, 2);
        this.A01 = c0dp;
        this.A00 = EncryptedSharedPreferencesFactory.createEncryptedSharedPrefs(context, "passkey_secret_manager");
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0238 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.util.Map A00(X.L20 r301) {
        /*
            Method dump skipped, instructions count: 820
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.L20.A00(X.L20):java.util.Map");
    }

    public List A01(KNY kny, String str, Set set) {
        11T.A0F(str, 0);
        java.util.Map A00 = A00(this);
        LinkedHashMap A1C = 1BK.A1C();
        Iterator A0y = AnonymousClass001.A0y(A00);
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0y);
            Jsz jsz = (Jsz) A0z.getKey();
            if (11T.A0O(jsz.A03, str) && (set == null || set.contains(jsz.A02))) {
                1BL.A1O(A1C, A0z);
            }
        }
        LinkedHashMap A1C2 = 1BK.A1C();
        Iterator A0x = AnonymousClass001.A0x(A1C);
        while (A0x.hasNext()) {
            Map.Entry A0z2 = AnonymousClass001.A0z(A0x);
            if (((Jso) A0z2.getValue()).A02.contains(kny)) {
                1BL.A1O(A1C2, A0z2);
            }
        }
        LinkedHashMap A14 = DKE.A14(A1C2);
        Iterator A0x2 = AnonymousClass001.A0x(A1C2);
        while (A0x2.hasNext()) {
            Map.Entry A0z3 = AnonymousClass001.A0z(A0x2);
            A14.put(A0z3.getKey(), ((Jso) A0z3.getValue()).A01);
        }
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator A0x3 = AnonymousClass001.A0x(A14);
        while (A0x3.hasNext()) {
            Map.Entry A0z4 = AnonymousClass001.A0z(A0x3);
            Object key = A0z4.getKey();
            Object value = A0z4.getValue();
            if (value != null) {
                7zU.A1Y(key, value, A0s);
            }
        }
        java.util.Map A0B = 04R.A0B(A0s);
        ArrayList A0t = AnonymousClass001.A0t(A0B.size());
        Iterator A0y2 = AnonymousClass001.A0y(A0B);
        while (A0y2.hasNext()) {
            Map.Entry A0z5 = AnonymousClass001.A0z(A0y2);
            7zU.A1Y(A0z5.getKey(), A0z5.getValue(), A0t);
        }
        return A0t;
    }
}
