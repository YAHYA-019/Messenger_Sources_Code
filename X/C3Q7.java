package X;

import com.google.common.collect.ImmutableMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3Q7, reason: invalid class name */
/* loaded from: 3Q7.class */
public final class C3Q7 {
    public ImmutableMap A00;
    public final 1Br A01 = 1BK.A0C();
    public final Object A02 = new Object();

    public C3Q7() {
        ImmutableMap build = 1BK.A0c().build();
        11T.A0A(build);
        this.A00 = build;
        A00(this);
        ((1CR) 1Br.A0B(this.A01)).A5S(new 3aW(this));
    }

    public static final void A00(C3Q7 c3q7) {
        String A02 = 2yD.A02(1Br.A07(c3q7.A01), 36885716008961623L);
        ImmutableMap.Builder A0c = 1BK.A0c();
        try {
            JSONObject jSONObject = new JSONObject(A02);
            JSONArray names = jSONObject.names();
            int length = names.length();
            for (int i = 0; i < length; i++) {
                String obj = names.get(i).toString();
                A0c.put(obj, Integer.valueOf(jSONObject.getInt(obj)));
            }
        } catch (JSONException e) {
            0fH.A0z("FalcoEventVersionProvider", "Exception when deserializing falco event versions: %s", e, new Object[]{A02});
        }
        synchronized (c3q7.A02) {
            ImmutableMap build = A0c.build();
            11T.A0A(build);
            c3q7.A00 = build;
        }
    }
}
