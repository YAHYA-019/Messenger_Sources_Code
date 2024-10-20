package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.15r, reason: invalid class name */
/* loaded from: 15r.class */
public final class C15r {
    public C15q A00;
    public List A01;
    public final String A02;
    public final long A03 = System.currentTimeMillis();

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.15q] */
    public C15r(String str, long j) {
        this.A02 = str;
        ?? obj = new Object();
        obj.A00 = 1L;
        obj.A02 = j;
        obj.A01 = j;
        this.A00 = obj;
    }

    public static String A00(C15r c15r) {
        List list = c15r.A01;
        if (list == null || list.isEmpty()) {
            return null;
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0k.append(AnonymousClass001.A0i(it));
            A0k.append("_");
        }
        A0k.setLength(A0k.length() - 1);
        return A0k.toString();
    }

    public JSONObject A01() {
        JSONObject A12 = AnonymousClass001.A12();
        try {
            A12.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "fbns_counters");
            A12.put("time", C15p.A00(this.A03));
            JSONObject A122 = AnonymousClass001.A12();
            A122.put("key", this.A02);
            A122.put("dims", A00(this));
            C15q c15q = this.A00;
            JSONObject A123 = AnonymousClass001.A12();
            A123.put("cnt", c15q.A00);
            A123.put("avg", ((float) c15q.A02) / ((float) c15q.A00));
            A123.put("max", c15q.A01);
            Iterator<String> keys = A123.keys();
            while (keys.hasNext()) {
                String A0i = AnonymousClass001.A0i(keys);
                A122.put(A0i, A123.get(A0i));
            }
            A12.put("extra", A122);
            return A12;
        } catch (JSONException e) {
            0fH.A0v("CounterEvent", "Failed to serialize", e);
            return A12;
        }
    }

    public String toString() {
        return A01().toString();
    }
}
