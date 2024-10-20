package com.facebook.battery.samsunglegacy;

import X.0Lm;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.AHe;
import X.AnonymousClass001;
import X.C02l;
import X.C15h;
import android.os.Bundle;
import android.util.SparseArray;
import com.facebook.inject.FbInjector;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: SamsungWarningNotificationLogger.class */
public final class SamsungWarningNotificationLogger implements C02l {
    public 0Lm A00;
    public final 1Br A06 = 1Bq.A00(16772);
    public final 1Br A03 = 1Bu.A00(100311);
    public final 1Br A01 = 1Bq.A00(16885);
    public final 1Br A04 = 1Bq.A00(16511);
    public final 1Br A02 = 1Bq.A00(65726);
    public final 1Br A05 = 1Bq.A00(16385);
    public final Object A07 = new Object();
    public final C15h A08 = new AHe(FbInjector.A00(), 3);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r304v0, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r304v1, types: [org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r304v2 */
    /* JADX WARN: Type inference failed for: r304v3, types: [org.json.JSONArray] */
    public static Object A00(Object obj) {
        Object A12;
        Class<?> cls = obj.getClass();
        if (cls.isPrimitive() || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Double) || (obj instanceof CharSequence) || (obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character)) {
            return obj;
        }
        if (cls.isArray()) {
            A12 = new JSONArray();
            int length = Array.getLength(obj);
            for (int i = 0; i < length; i++) {
                A12.put(A00(Array.get(obj, i)));
            }
        } else if (obj instanceof List) {
            A12 = new JSONArray();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                A12.put(A00(it.next()));
            }
        } else {
            if (obj instanceof Bundle) {
                return A01((Bundle) obj);
            }
            if (!(obj instanceof SparseArray)) {
                JSONObject A122 = AnonymousClass001.A12();
                A122.put("class", cls.getCanonicalName());
                A122.put("string", obj.toString());
                return A122;
            }
            SparseArray sparseArray = (SparseArray) obj;
            A12 = AnonymousClass001.A12();
            int size = sparseArray.size();
            for (int i2 = 0; i2 < size; i2++) {
                A12.put(Integer.toString(sparseArray.keyAt(i2)), A00(sparseArray.valueAt(i2)));
            }
        }
        return A12;
    }

    public static JSONObject A01(Bundle bundle) {
        JSONObject A12 = AnonymousClass001.A12();
        Iterator<String> it = bundle.keySet().iterator();
        while (it.hasNext()) {
            String A0i = AnonymousClass001.A0i(it);
            Object obj = bundle.get(A0i);
            if (A0i == null) {
                A0i = "null";
            }
            A12.put(A0i, A00(obj));
        }
        return A12;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x017a A[Catch: JSONException -> 0x0298, TRY_ENTER, TRY_LEAVE, TryCatch #1 {JSONException -> 0x0298, blocks: (B:58:0x016f, B:61:0x017a, B:63:0x0182, B:94:0x0226, B:103:0x022e, B:105:0x0231, B:107:0x0233, B:108:0x0238, B:110:0x0246, B:114:0x0259, B:115:0x0260, B:116:0x0266, B:117:0x026d, B:118:0x0274, B:119:0x027b, B:121:0x0284, B:123:0x028f, B:66:0x0184, B:67:0x0189, B:69:0x0190, B:70:0x0195, B:74:0x01ad, B:75:0x01b4, B:76:0x01bb, B:77:0x01c2, B:79:0x01cd, B:81:0x01df, B:82:0x01e6, B:83:0x01ed, B:85:0x01f8, B:87:0x0205, B:88:0x020c, B:89:0x0213, B:91:0x021e), top: B:57:0x016f, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02d6  */
    @Override // X.C02l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void CFb(android.content.Context r302, android.content.Intent r303, X.C01q r304) {
        /*
            Method dump skipped, instructions count: 792
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.battery.samsunglegacy.SamsungWarningNotificationLogger.CFb(android.content.Context, android.content.Intent, X.01q):void");
    }
}
