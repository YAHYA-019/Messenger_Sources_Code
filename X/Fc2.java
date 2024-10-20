package X;

import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: Fc2.class */
public final class Fc2 implements GEO {
    public final 1RX A00;

    public Fc2(1RX r302) {
        this.A00 = r302;
    }

    public void logEvent(String str, String str2) {
        1Rf A01 = 1RX.A01(this.A00, 0S2.A00, (String) null, str, false);
        if (A01.A0D()) {
            try {
                JSONObject A1F = DKC.A1F(str2);
                Iterator<String> keys = A1F.keys();
                while (keys.hasNext()) {
                    String A0i = AnonymousClass001.A0i(keys);
                    A01.A08(A0i, A1F.get(A0i).toString());
                }
                A01.A0B();
            } catch (JSONException e) {
                android.util.Log.e("Analytics2LogWriter", "Failed to parse extra json", e);
            }
        }
    }
}
