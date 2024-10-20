package X;

import org.json.JSONObject;

/* renamed from: X.5u4, reason: invalid class name */
/* loaded from: 5u4.class */
public abstract class C5u4 {
    public static final 6Pq A00(C7dk c7dk) {
        JSONObject jSONObject = c7dk.A00;
        if (!(!jSONObject.isNull("target_type"))) {
            return null;
        }
        int optInt = jSONObject.optInt("target_type");
        if (Integer.valueOf(optInt) == null) {
            return null;
        }
        6Pq[] values = 6Pq.values();
        int length = values.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return null;
            }
            6Pq r0 = values[i2];
            if (11T.A01(r0.mValue, optInt) == 0) {
                return r0;
            }
            i = i2 + 1;
        }
    }

    public static final boolean A01(4lD r301, int i) {
        boolean z = false;
        if (((1qX) r301).mResultSet.getLong(i, 68) != 0) {
            z = true;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0047, code lost:
    
        if (r0.mResultSet.getInteger(r302, 27) > 0) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A02(X.4lD r301, int r302) {
        /*
            r0 = r301
            X.1qX r0 = (X.1qX) r0
            r301 = r0
            r0 = r301
            com.facebook.msys.mci.CQLResultSet r0 = r0.mResultSet
            r303 = r0
            r0 = 26
            r304 = r0
            r0 = r303
            r1 = r302
            r2 = r304
            java.lang.Integer r0 = r0.getNullableInteger(r1, r2)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L35
            r0 = r301
            com.facebook.msys.mci.CQLResultSet r0 = r0.mResultSet
            r1 = r302
            r2 = r304
            java.lang.Integer r0 = r0.getNullableInteger(r1, r2)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L4a
            r0 = r303
            int r0 = r0.intValue()
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L4a
        L35:
            r0 = r301
            com.facebook.msys.mci.CQLResultSet r0 = r0.mResultSet
            r1 = r302
            r2 = 27
            int r0 = r0.getInteger(r1, r2)
            r305 = r0
            r0 = 0
            r304 = r0
            r0 = r305
            if (r0 <= 0) goto L4c
        L4a:
            r0 = 1
            r304 = r0
        L4c:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5u4.A02(X.4lD, int):boolean");
    }
}
