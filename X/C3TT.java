package X;

import android.app.ActivityThread;
import android.os.Bundle;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3TT, reason: invalid class name */
/* loaded from: 3TT.class */
public final class C3TT {
    public LinkedList A01;
    public final /* synthetic */ C05754es A03;
    public long A00 = 0;
    public JSONObject A02 = null;

    public C3TT(C05754es c05754es) {
        this.A03 = c05754es;
    }

    public static JSONObject A00(C3TT c3tt, Object obj, LinkedList linkedList, long j) {
        JSONObject A12 = AnonymousClass001.A12();
        try {
            String A0Y = AnonymousClass001.A0Y(obj);
            A12.put("_type", A0Y);
            A12.put("_size", j);
            if (obj instanceof Bundle) {
                Bundle bundle = (Bundle) obj;
                if (!A02(bundle)) {
                    c3tt.A01(bundle, linkedList, A12, j);
                    return A12;
                }
                if (A02(bundle)) {
                    Object obj2 = bundle.get("state");
                    obj2.getClass();
                    Object A01 = C05z.A00(ActivityThread.currentActivityThread().getApplication()).A01("mClassName", obj2);
                    if (A01 == null) {
                        A01 = "FailedToGetFragmentClassName";
                    }
                    linkedList.addFirst(A01);
                    if (!bundle.containsKey("childFragmentManager") && j > c3tt.A00) {
                        c3tt.A00 = j;
                        c3tt.A01 = new LinkedList(linkedList);
                    }
                    c3tt.A01(bundle, linkedList, A12, j);
                    linkedList.removeFirst();
                    return A12;
                }
            } else if (A0Y.equals("androidx.fragment.app.FragmentState")) {
                Object A012 = C05z.A00(ActivityThread.currentActivityThread().getApplication()).A01("mClassName", obj);
                if (A012 != null) {
                    A12.put("mClassName", A012);
                    return A12;
                }
            }
        } catch (JSONException e) {
            c3tt.A03.A0A(e);
        }
        return A12;
    }

    private void A01(Bundle bundle, LinkedList linkedList, JSONObject jSONObject, long j) {
        long j2 = j;
        try {
            Bundle bundle2 = new Bundle(bundle);
            JSONArray jSONArray = new JSONArray();
            Iterator<String> it = bundle.keySet().iterator();
            while (it.hasNext()) {
                String A0i = AnonymousClass001.A0i(it);
                Object obj = bundle2.get(A0i);
                bundle2.remove(A0i);
                long A00 = C05754es.A00(bundle2);
                long j3 = j2 - A00;
                if (obj != null) {
                    if (j3 <= 10240 && !A02(bundle)) {
                        Object obj2 = bundle.get("state");
                        if (obj2 == null || !AnonymousClass001.A0Y(obj2).equals("androidx.fragment.app.FragmentManagerState")) {
                            jSONArray.put(A0i);
                        }
                    }
                    jSONObject.put(A0i, A00(this, obj, linkedList, j3));
                }
                j2 = A00;
            }
            if (jSONArray.length() > 0) {
                jSONObject.put("_small", jSONArray);
            }
        } catch (Throwable th) {
            this.A03.A0A(th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (X.AnonymousClass001.A0Y(r0).equals("androidx.fragment.app.FragmentState") == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A02(android.os.Bundle r301) {
        /*
            r0 = r301
            java.lang.String r1 = "state"
            java.lang.Object r0 = r0.get(r1)
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L1f
            r0 = r302
            java.lang.String r0 = X.AnonymousClass001.A0Y(r0)
            r301 = r0
            java.lang.String r0 = "androidx.fragment.app.FragmentState"
            r302 = r0
            r0 = r301
            r1 = r302
            boolean r0 = r0.equals(r1)
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r303
            if (r0 != 0) goto L23
        L1f:
            r0 = 0
            r304 = r0
            r0 = 0
            r302 = r0
        L23:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3TT.A02(android.os.Bundle):boolean");
    }
}
