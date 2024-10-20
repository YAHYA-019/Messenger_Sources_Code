package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.google.gson.Gson;
import java.util.HashMap;
import org.json.JSONException;

/* renamed from: X.9h5, reason: invalid class name */
/* loaded from: 9h5.class */
public final class C9h5 {
    public final 1Br A01 = 1BK.A0E();
    public final 1Br A00 = 1Bu.A00(147496);

    public static final java.util.Map A00(C9h5 c9h5) {
        FbSharedPreferences A09 = 1Br.A09(c9h5.A01);
        1Br.A0C(c9h5.A00);
        String BD0 = A09.BD0(1NK.A08);
        if (BD0 == null) {
            BD0 = "";
        }
        HashMap A0u = AnonymousClass001.A0u();
        if (BD0.equals("")) {
            return A0u;
        }
        try {
            Object A05 = new Gson().A05(BD0, new EHU().type);
            11T.A0D(A05);
            return (java.util.Map) A05;
        } catch (JSONException unused) {
            return A0u;
        }
    }

    public final boolean A01(ThreadKey threadKey, String str) {
        java.util.Map A00 = A00(this);
        if (A00.containsKey(threadKey.toString())) {
            return 11T.A0O(A00.get(threadKey.toString()), str);
        }
        return false;
    }
}
