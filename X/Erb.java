package X;

import android.content.Context;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: Erb.class */
public final class Erb {
    public final Context A00;

    public Erb(Context context) {
        this.A00 = context;
    }

    public final void A00(Runnable runnable, Runnable runnable2, String str, String str2) {
        HashMap A0u = AnonymousClass001.A0u();
        try {
            JSONObject A1F = DKC.A1F(str2);
            Iterator<String> keys = A1F.keys();
            while (keys.hasNext()) {
                String A0i = AnonymousClass001.A0i(keys);
                Object obj = A1F.get(A0i);
                11T.A0D(A0i);
                11T.A0D(obj);
                A0u.put(A0i, obj);
            }
        } catch (JSONException unused) {
        }
        HashMap A02 = C4O5.A02(A0u);
        Fwv fwv = new Fwv(runnable, runnable2, 0);
        Context context = this.A00;
        C2049DaC A00 = EUZ.A00(context);
        Eul eul = new Eul(str);
        eul.A02 = A02;
        eul.A00 = fwv;
        eul.A00(context, A00);
    }
}
