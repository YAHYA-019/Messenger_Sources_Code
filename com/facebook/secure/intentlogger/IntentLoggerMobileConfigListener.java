package com.facebook.secure.intentlogger;

import X.0JI;
import X.0MM;
import X.0MN;
import X.1Bi;
import X.1GD;
import X.1Nq;
import X.2yD;
import X.C00i;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: IntentLoggerMobileConfigListener.class */
public final class IntentLoggerMobileConfigListener implements 1Nq {
    public 0JI A02 = null;
    public 0JI A01 = null;
    public 0MM A00 = null;
    public final C00i A03 = 1Bi.A00(16385);

    public static final IntentLoggerMobileConfigListener A00() {
        return new IntentLoggerMobileConfigListener();
    }

    public static String A01(IntentLoggerMobileConfigListener intentLoggerMobileConfigListener) {
        return ((2yD) intentLoggerMobileConfigListener.A03.get()).BCy(36873844719681746L);
    }

    public static String A02(IntentLoggerMobileConfigListener intentLoggerMobileConfigListener) {
        return ((2yD) intentLoggerMobileConfigListener.A03.get()).BCy(36873844719812820L);
    }

    public static String A03(IntentLoggerMobileConfigListener intentLoggerMobileConfigListener) {
        return ((2yD) intentLoggerMobileConfigListener.A03.get()).BCy(36873844719747283L);
    }

    public static void A04(IntentLoggerMobileConfigListener intentLoggerMobileConfigListener, String str, String str2, String str3) {
        0MM r306;
        JSONArray jSONArray;
        synchronized (intentLoggerMobileConfigListener) {
            intentLoggerMobileConfigListener.A02 = 0JI.A00(str, 2);
            intentLoggerMobileConfigListener.A01 = 0JI.A00(str2, 3);
            try {
                JSONArray jSONArray2 = new JSONArray(str3);
                ArrayList arrayList = new ArrayList(jSONArray2.length());
                int i = 0;
                while (true) {
                    int i2 = i;
                    if (i2 >= jSONArray2.length()) {
                        break;
                    }
                    if (jSONArray2.getJSONArray(i2) == null) {
                        new JSONArray();
                    } else {
                        jSONArray = jSONArray2.getJSONArray(i2);
                    }
                    ArrayList arrayList2 = new ArrayList(jSONArray.length());
                    int i3 = 0;
                    while (true) {
                        int i4 = i3;
                        if (i4 >= jSONArray.length()) {
                            break;
                        }
                        JSONObject jSONObject = jSONArray.getJSONObject(i4);
                        String str4 = null;
                        if (jSONObject != null && jSONObject.has("field_name")) {
                            String string = jSONObject.getString("field_name");
                            if (jSONObject.has("regex")) {
                                str4 = jSONObject.getString("regex");
                            }
                            arrayList2.add(new 0MN(string, str4));
                        }
                        i3 = i4 + 1;
                    }
                    arrayList.add(arrayList2);
                    i = i2 + 1;
                }
                new 0MM(arrayList);
            } catch (JSONException unused) {
                r306 = null;
            }
            intentLoggerMobileConfigListener.A00 = r306;
        }
    }

    public 0MM A05() {
        0MM r0;
        synchronized (this) {
            r0 = this.A00;
        }
        return r0;
    }

    public 0JI A06() {
        0JI r0;
        synchronized (this) {
            r0 = this.A01;
        }
        return r0;
    }

    public 0JI A07() {
        0JI r0;
        synchronized (this) {
            r0 = this.A02;
        }
        return r0;
    }

    public int Adi() {
        return 1792;
    }

    public void BqJ(int i) {
        C00i c00i = this.A03;
        2yD r0 = (2yD) c00i.get();
        1GD r02 = 1GD.A05;
        A04(this, r0.BDB(r02, 36873844719747283L), ((2yD) c00i.get()).BDB(r02, 36873844719681746L), ((2yD) c00i.get()).BDB(r02, 36873844719812820L));
    }
}
