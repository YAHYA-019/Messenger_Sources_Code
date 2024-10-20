package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadSummary;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.7uf, reason: invalid class name */
/* loaded from: 7uf.class */
public abstract class C7uf {
    public static final boolean A00(Context context, FbUserSession fbUserSession, ThreadSummary threadSummary, Integer num, String str) {
        11T.A0G(fbUserSession, 0, str);
        C5yq A00 = ((C5ym) 1Bn.A0E(context, (1BY) null, 68427)).A00(fbUserSession, threadSummary, num);
        if (A00 != null) {
            return A03(2yD.A02(C5yr.A00((C5yr) 1Bi.A03(68198)), 36883916417729974L), A00.serverLocation, str);
        }
        return false;
    }

    public static final boolean A01(String str) {
        11T.A0F(str, 0);
        boolean z = true;
        if (!str.equals(C5yq.A0g.serverLocation) && !str.equals(C5yq.A0h.serverLocation) && !str.equals(C5yq.A0G.serverLocation) && !str.equals(C5yq.A0E.serverLocation) && !str.equals(C5yq.A0H.serverLocation)) {
            z = str.equals(C5yq.A0F.serverLocation);
        }
        return z;
    }

    public static final boolean A02(String str, String str2) {
        1BL.A1F(str, str2);
        return A03(2yD.A02(C5yr.A00((C5yr) 1Bi.A03(68198)), A01(str) ? 36883916417664437L : 36882391704339566L), str, str2);
    }

    public static final boolean A03(String str, String str2, String str3) {
        boolean z = false;
        try {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= length) {
                    break;
                }
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                String A02 = 11T.A02(jSONObject.getJSONArray("loc"));
                String A022 = 11T.A02(jSONObject.getJSONArray("ep"));
                Locale locale = Locale.ROOT;
                boolean A0T = 0CU.A0T(A022, 4YU.A18(locale, str3), false);
                if (0CU.A0T(A02, 4YU.A18(locale, str2), false) && A0T) {
                    z = true;
                    break;
                }
                i = i2 + 1;
            }
            return z;
        } catch (JSONException e) {
            4YV.A0G().softReport("FRXFragmentEligibilityLauncher", "Unexpected exception while parsing Bloks Supported Types Json", e);
            return false;
        }
    }
}
